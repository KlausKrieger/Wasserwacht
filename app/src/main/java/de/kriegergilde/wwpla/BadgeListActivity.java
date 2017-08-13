package de.kriegergilde.wwpla;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


import de.kriegergilde.wwpla.dummy.Ausbildungen;

import java.util.LinkedList;
import java.util.List;

/**
 * An activity representing a list of Badges. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link BadgeDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class BadgeListActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badge_list);

        Ausbildungen.loadPossessions(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.GONE); // TODO
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,new String[]{"Filter: Alle Abzeichen", "Filter: nur erworbene Abzeichen", "Filter: nur nicht erworbene Abzeichen"});
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        View recyclerView = findViewById(R.id.badge_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);

        if (findViewById(R.id.badge_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        View recyclerView = findViewById(R.id.badge_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);
    }


    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        View recyclerView = findViewById(R.id.badge_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);
    }
    public void onNothingSelected(AdapterView<?> parent){
        // TODO ?
    }


    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        int spinnerPosition = ((Spinner)findViewById(R.id.spinner)).getSelectedItemPosition();
        List<Ausbildungen.Badge> badgesToShow = new LinkedList<>();
        switch (spinnerPosition) {
            case 0: // all
                badgesToShow = Ausbildungen.ITEMS;
                break;
            case 1: // owned
                for(Ausbildungen.Badge badge : Ausbildungen.ITEMS){
                    if(Ausbildungen.possessions.contains(badge.id)){
                        badgesToShow.add(badge);
                    }
                }
                break;
            case 2: // open badges
                for(Ausbildungen.Badge badge : Ausbildungen.ITEMS){
                    if(!Ausbildungen.possessions.contains(badge.id)){
                        badgesToShow.add(badge);
                    }
                }
                break;
        }
        recyclerView.setAdapter(new SimpleItemRecyclerViewAdapter(badgesToShow));
    }

    public class SimpleItemRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder> {

        private final List<Ausbildungen.Badge> mValues;

        public SimpleItemRecyclerViewAdapter(List<Ausbildungen.Badge> items) {
            mValues = items;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.badge_list_content, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            holder.mItem = mValues.get(position);
            holder.mImageView.setImageResource(mValues.get(position).resId);
            holder.mContentView.setText(mValues.get(position).content);

            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mTwoPane) {
                        Bundle arguments = new Bundle();
                        arguments.putString(BadgeDetailFragment.ARG_ITEM_ID, holder.mItem.id);
                        BadgeDetailFragment fragment = new BadgeDetailFragment();
                        fragment.setArguments(arguments);
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.badge_detail_container, fragment)
                                .commit();
                    } else {
                        Context context = v.getContext();
                        Intent intent = new Intent(context, BadgeDetailActivity.class);
                        intent.putExtra(BadgeDetailFragment.ARG_ITEM_ID, holder.mItem.id);

                        context.startActivity(intent);
                    }
                }
            });
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public final View mView;
            public final ImageView mImageView;
            public final TextView mContentView;
            public Ausbildungen.Badge mItem;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                mImageView = (ImageView) view.findViewById(R.id.imageView);
                mContentView = (TextView) view.findViewById(R.id.content);
            }

            @Override
            public String toString() {
                return super.toString() + " '" + mContentView.getText() + "'";
            }
        }
    }
}
