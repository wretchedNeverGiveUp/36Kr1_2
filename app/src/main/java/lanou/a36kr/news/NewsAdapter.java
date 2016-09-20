package lanou.a36kr.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import lanou.a36kr.R;
import lanou.a36kr.bean.NewsBean;

/**
 * Created by dllo on 16/9/19.
 */
public class
NewsAdapter extends BaseAdapter {
    ArrayList<NewsBean> newsBeen;
    Context mContext;

    public NewsAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setNewsBeen(ArrayList<NewsBean> newsBeen) {
        this.newsBeen = newsBeen;
    }

    @Override
    public int getCount() {
        return newsBeen == null ? 0 : newsBeen.size();
    }

    @Override
    public Object getItem(int position) {
        return newsBeen.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        NewsHolder newsHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_news, null);
            newsHolder = new NewsHolder(convertView);
            convertView.setTag(newsHolder);
        } else {
            newsHolder = (NewsHolder) convertView.getTag();
        }
        newsHolder.pic.setText(newsBeen.get(position).getPic());
        newsHolder.title.setText(newsBeen.get(position).getTitle());
        newsHolder.address.setText(newsBeen.get(position).getAddress());
        newsHolder.time.setText(newsBeen.get(position).getTime());
        newsHolder.writer.setText(newsBeen.get(position).getWrite());



        return null;
    }

    private class NewsHolder {
        TextView title, address, time, writer, pic;

        public NewsHolder(View view) {
            pic = (TextView) view.findViewById(R.id.iv_news_listView_pic);
            title = (TextView) view.findViewById(R.id.tv_news_listView_title);
            address = (TextView) view.findViewById(R.id.tv_news_listView_address);
            time = (TextView) view.findViewById(R.id.tv_news_listView_time);
            writer = (TextView) view.findViewById(R.id.tv_news_listView_writer);
        }
    }
}
