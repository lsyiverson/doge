package cn.com.chongwubao.doge.ui.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.util.TypedValue;
import android.widget.TextView;

import butterknife.InjectView;
import cn.com.chongwubao.doge.R;

public class HomeActivity extends BaseActivity {

    @InjectView(R.id.tip_text)
    protected AppCompatTextView tipTextView;

    @InjectView(R.id.drawer_layout)
    protected DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int color = typedValue.data;

        drawerLayout.setStatusBarBackgroundColor(color);
    }
}
