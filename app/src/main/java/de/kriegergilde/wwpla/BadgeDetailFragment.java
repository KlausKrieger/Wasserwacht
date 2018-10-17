package de.kriegergilde.wwpla;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import de.kriegergilde.wwpla.dummy.Ausbildungen;

/**
 * A fragment representing a single Badge detail screen.
 * This fragment is either contained in a {@link BadgeListActivity}
 * in two-pane mode (on tablets) or a {@link BadgeDetailActivity}
 * on handsets.
 */
public class BadgeDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private Ausbildungen.Badge mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public BadgeDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        refreshTitle();
    }

    @Override
    public void onResume() {
        super.onResume();
        refreshTitle();
    }

    private void refreshTitle() {
        if (getArguments().containsKey(ARG_ITEM_ID)) {

            mItem = Ausbildungen.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.badge_detail, container, false);

        final CheckBox checkBox = (CheckBox) rootView.findViewById(R.id.checkBox);
        checkBox.setChecked(Ausbildungen.possessions.contains(mItem.id));
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()){
                    Ausbildungen.possessions.add(mItem.id);
                } else {
                    Ausbildungen.possessions.remove(mItem.id);
                }
                Ausbildungen.savePossessions(getActivity());
            }
        });

        // Show the content
        if (mItem != null) {
            WebView wv = rootView.findViewById(R.id.badge_detail_wv);
            wv.getSettings().setDefaultTextEncodingName("UTF-8");
            wv.loadUrl("file:///android_asset/"+mItem.id+".html");

            ((ImageView) rootView.findViewById(R.id.imageViewDetailBadge)).setImageResource(mItem.resId);
        }

        return rootView;
    }
}
