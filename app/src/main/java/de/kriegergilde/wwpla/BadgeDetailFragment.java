package de.kriegergilde.wwpla;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import de.kriegergilde.wwpla.dummy.DummyContent;

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
    private DummyContent.DummyItem mItem;

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
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.badge_detail, container, false);

        // Show the content
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.badge_detail)).setText(mItem.details);
            ((ImageView) this.getActivity().findViewById(R.id.imageView2)).setImageResource(mItem.resId);
        }

        return rootView;
    }
}
