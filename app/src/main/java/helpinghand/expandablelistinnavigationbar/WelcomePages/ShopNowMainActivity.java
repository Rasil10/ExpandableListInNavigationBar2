package helpinghand.expandablelistinnavigationbar.WelcomePages;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import helpinghand.expandablelistinnavigationbar.MainActivity;
import helpinghand.expandablelistinnavigationbar.R;
import me.relex.circleindicator.CircleIndicator;

public class ShopNowMainActivity extends AppCompatActivity {
    private static final Integer[] XMEN = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide2, R.drawable.slide2};
    private static ViewPager mPager;
    private static int currentPage = 0;
    Button shopNowButton;
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_now);
        overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
        init();

        shopNowButton = (Button) findViewById(R.id.shopNowButton);
        shopNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(ShopNowMainActivity.this, MainActivity.class);
                ShopNowMainActivity.this.startActivity(mainIntent);
                ShopNowMainActivity.this.finish();
            }
        });

    }

    private void init() {
        for (int i = 0; i < XMEN.length; i++)
            XMENArray.add(XMEN[i]);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new ImageSliderAdapter(ShopNowMainActivity.this, XMENArray));
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == XMEN.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 2500, 2500);

    }
}
