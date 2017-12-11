package helpinghand.expandablelistinnavigationbar;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class shirtfragment extends Fragment {

 LinearLayout ll2;
 LinearLayout ll9;
    LinearLayout ll4;
    LinearLayout ll5;
    LinearLayout ll6;
    LinearLayout ll7;
    LinearLayout ll8;
    LinearLayout ll3;





    public shirtfragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_shirtfragment, container, false);

        ll2=(LinearLayout) view.findViewById(R.id.kurta2);
        ll3=(LinearLayout) view.findViewById(R.id.kurta5);

        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),PaymentActivity.class));
            }
        });

        ll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),PaymentActivity.class));

            }
        });
        return view;
    }



}
