package helpinghand.expandablelistinnavigationbar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 12/seven/2017.
 */

public class RecyclerViewDataAdapter extends RecyclerView.Adapter<RecyclerViewDataAdapter.ItemRowHolder> {

    private ArrayList<SingleItemModel> dataList;
    private Context mContext;
    private int  deviceHeight ;

    public RecyclerViewDataAdapter(Context context, ArrayList<SingleItemModel> dataList, int deviceHeight) {
        this.dataList = dataList;
        this.mContext = context;
        this.deviceHeight = deviceHeight;
    }

    @Override
    public ItemRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_card_list, null);
        ItemRowHolder mh = new ItemRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(ItemRowHolder itemRowHolder, int i) {

        SingleItemModel currentSingleItemModel=dataList.get(i);

        itemRowHolder.itemTitle.setText(currentSingleItemModel.getProduct1());
        itemRowHolder.productTitle.setText(currentSingleItemModel.getProduct2());
        itemRowHolder.imageUrl.setImageResource(currentSingleItemModel.getImage_url());
itemRowHolder.imageUrl.getLayoutParams().height = deviceHeight/12;
itemRowHolder.imageUrl.requestLayout();




       /* Glide.with(mContext)
                .load(feedItem.getImageURL())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .error(R.drawable.bg)
                .into(feedListRowHolder.thumbView);*/
    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    public class ItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView itemTitle;

        protected TextView productTitle;
        protected ImageView imageUrl;




        public ItemRowHolder(View view) {
            super(view);

            this.itemTitle = (TextView) view.findViewById(R.id.product1);
            this.productTitle = (TextView) view.findViewById(R.id.product2);
            this.imageUrl=(ImageView)view.findViewById(R.id.itemimage);



        }

    }

}
