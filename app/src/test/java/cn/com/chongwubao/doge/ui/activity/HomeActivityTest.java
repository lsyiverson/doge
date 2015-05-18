package cn.com.chongwubao.doge.ui.activity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import cn.com.chongwubao.doge.BuildConfig;

import static org.assertj.android.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class HomeActivityTest {

    @Test
    public void shouldDisplayHelloWorldOnTipText() {
        final HomeActivity homeActivity = Robolectric.buildActivity(HomeActivity.class).create().get();

        assertThat(homeActivity.tipTextView).isNotNull().hasText("Hello world!");
    }
}