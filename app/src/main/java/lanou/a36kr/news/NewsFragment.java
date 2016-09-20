package lanou.a36kr.news;

import android.widget.ListView;

import java.util.ArrayList;

import lanou.a36kr.R;
import lanou.a36kr.base.BaseFragment;
import lanou.a36kr.bean.NewsBean;

/**
 * Created by dllo on 16/9/19.
 */
public class NewsFragment extends BaseFragment {
    ListView lv;
    private ArrayList<NewsBean> arrayList;
    private NewsAdapter newsAdapter;

    @Override
    protected int setLayout() {
        return R.layout.activity_news;
    }

    @Override
    protected void initView() {
        lv = bindView(R.id.lv_news);


    }

    @Override
    protected void initData() {
        arrayList = new ArrayList<>();
        newsAdapter = new NewsAdapter(getContext());
        for (int i = 0; i < 2; i++) {
            NewsBean newsBean = new NewsBean();
            newsBean.setPic("asdkfj");
            newsBean.setTitle("sdgsdgds");
            newsBean.setAddress("dsjglkjadsh");
            newsBean.setTime("sajow");
            newsBean.setWrite("sdlkgjsadg");

        }

        newsAdapter.setNewsBeen(arrayList);

        lv.setAdapter(newsAdapter);





    }
}
