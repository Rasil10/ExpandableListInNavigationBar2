package helpinghand.expandablelistinnavigationbar;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccessoriesFragment extends Fragment {
    GridView gridView;
    DressAdapter adapter;

    public AccessoriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_accessories, container, false);
        ArrayList<DressInfo> obj = new ArrayList<>();
        obj = (ArrayList<DressInfo>) getArguments().getSerializable("dresses");

        gridView = (GridView) view.findViewById(R.id.gridView);
        adapter = new DressAdapter(this.getActivity(), obj);
        adapter.notifyDataSetChanged();
        gridView.setAdapter(adapter);
        return view;
    }

}
