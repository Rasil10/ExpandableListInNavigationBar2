package helpinghand.expandablelistinnavigationbar.WelcomePages;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import helpinghand.expandablelistinnavigationbar.R;

/**
 * Created by Rasil10 on 2017-12-04.
 */

public class ImageSliderAdapter extends PagerAdapter {
    private ArrayList<Integer> images;
    private LayoutInflater inflater;
    private Context context;

    public ImageSliderAdapter(Context context, ArrayList<Integer> images) {
        this.context = context;
        this.images = images;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View myImageLayout = inflater.inflate(R.layout.slider_element, view, false);
        ImageView myImage = (ImageView) myImageLayout
                .findViewById(R.id.image);
        myImage.setImageResource(images.get(position));
        view.addView(myImageLayout, 0);
        return myImageLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}