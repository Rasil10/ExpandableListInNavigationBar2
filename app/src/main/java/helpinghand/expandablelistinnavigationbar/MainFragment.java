package helpinghand.expandablelistinnavigationbar;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    ViewPager viewPager;
    private TextView mTextMessage;
    LinearLayout sliderdot;
    private int dotscount;
    private ImageView[] dots;
    Button mensbutton;


    FragmentPagerAdapter adapterViewpager;
    String[] web = {
            "Mens", "womens",
            "computing", "sports",
            "Appliances", "Home and living",
            "Beauty hub", "Toys and kids",
            "Smartphones", "Tvs and audio",
    };
    int[] imageId = {
            R.drawable.home,
            R.drawable.home,
            R.drawable.home,
            R.drawable.home,
            R.drawable.home,
            R.drawable.home,
            R.drawable.home,
            R.drawable.home,
            R.drawable.home,
            R.drawable.home,
    };
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_shoppingcart:
                    mTextMessage.setText(R.string.title_shoppingcart);
                    return true;
                case R.id.navigation_favourite:
                    mTextMessage.setText(R.string.title_favourite);
                    return true;
                case R.id.navigation_pricetag:
                    mTextMessage.setText(R.string.title_pricetag);
                    return true;
                case R.id.navigation_user:
                    mTextMessage.setText(R.string.User);
                    return true;
            }
            return false;
        }

    };
    ArrayList<SingleItemModel> allSampleData;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mensbutton = (Button) view.findViewById(R.id.mensbutton);
        mensbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Man_class.class);
                startActivity(i);

            }
        });

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getActivity());
        viewPager = (ViewPager) view.findViewById(R.id.Viewpager);

        viewPager.setAdapter(viewPagerAdapter);

        allSampleData = createDummyData();
        RecyclerView my_recycler_view = (RecyclerView) view.findViewById(R.id.recycler_view);
        RecyclerView my_recycler_view2 = (RecyclerView) view.findViewById(R.id.recycler_view2);

        int deviceHeight = getActivity().getWindowManager().getDefaultDisplay().getHeight();
        DisplayMetrics displayMetrics = getActivity().getResources().getDisplayMetrics();
        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;


        RecyclerViewDataAdapter recyclerViewDataAdapter = new RecyclerViewDataAdapter(this.getActivity(), allSampleData, height);
        RecyclerViewDataAdapter recyclerViewDataAdapter2 = new RecyclerViewDataAdapter(this.getActivity(), allSampleData, height);


        my_recycler_view.setLayoutManager(new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, false));
        my_recycler_view2.setLayoutManager(new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, false));

        my_recycler_view.setAdapter(recyclerViewDataAdapter);
        my_recycler_view2.setAdapter(recyclerViewDataAdapter2);

        return view;
    }

    private ArrayList<SingleItemModel> createDummyData2() {
        ArrayList<SingleItemModel> data2 = new ArrayList<>();
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "all women", R.drawable.kurta));
        data2.add(new SingleItemModel("pant", "gents", R.drawable.kurta));
        data2.add(new SingleItemModel("shirt", "all men", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));

        return data2;
    }

    private ArrayList<SingleItemModel> createDummyData() {
        ArrayList<SingleItemModel> data2 = new ArrayList<>();
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "all women", R.drawable.kurta));
        data2.add(new SingleItemModel("pant", "gents", R.drawable.kurta));
        data2.add(new SingleItemModel("shirt", "all men", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        data2.add(new SingleItemModel("kurta", "ladies", R.drawable.kurta));
        return data2;
    }

}
