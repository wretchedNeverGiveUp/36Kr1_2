package lanou.a36kr.main;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

import lanou.a36kr.Mine.MineFragment;
import lanou.a36kr.R;
import lanou.a36kr.base.BaseActivity;
import lanou.a36kr.discovery.DiscoveryFragment;
import lanou.a36kr.equity.EquityFragment;
import lanou.a36kr.message.MessageFragment;
import lanou.a36kr.news.NewsFragment;

public class MainActivity extends BaseActivity {

    private ViewPager vp;
    private TabLayout tb;

    @Override
    protected int setLayout() {

        return R.layout.activity_main;

    }

    @Override
    protected void initView() {
        vp = bindView(R.id.vp_main_tabLayout);
        tb = bindView(R.id.tb_main_tabLayout);


    }

    @Override
    protected void initData() {

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new NewsFragment());
        fragments.add(new EquityFragment());
        fragments.add(new DiscoveryFragment());
        fragments.add(new MessageFragment());
        fragments.add(new MineFragment());



        MainAdapter adapter = new MainAdapter(getSupportFragmentManager(), fragments);
        vp.setAdapter(adapter);
        tb.setupWithViewPager(vp);
        tb.setTabTextColors(Color.GRAY, Color.BLUE);
        tb.getTabAt(0).setIcon(R.drawable.news);
        tb.getTabAt(1).setIcon(R.drawable.equity);
        tb.getTabAt(2).setIcon(R.drawable.discovery);
        tb.getTabAt(3).setIcon(R.drawable.message);
        tb.getTabAt(4).setIcon(R.drawable.mine);


    }


}
