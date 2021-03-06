package com.faceswiping.app.adapter;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.faceswiping.app.R;
import com.faceswiping.app.base.ListBaseAdapter;
import com.faceswiping.app.bean.FriendBean;
import com.faceswiping.app.fragment.ChatFragment;
import com.faceswiping.app.util.UIHelper;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by John on 15/12/13.
 */
public class FriendAdapter extends ListBaseAdapter<FriendBean> {
    //是一些小图，放在内存中
    public static DisplayImageOptions optionsImage = new DisplayImageOptions
            .Builder()
            .cacheInMemory(true)
            .cacheOnDisk(false)
            .considerExifParams(true)
            .bitmapConfig(Bitmap.Config.RGB_565)
            .imageScaleType(ImageScaleType.EXACTLY)
            .build();

    public static class ViewHolder {

        @InjectView(R.id.tv_name)
        TextView tv_name;

        @InjectView(R.id.im_header)
        ImageView im_header;


        public ViewHolder(View view) {

            ButterKnife.inject(this, view);

        }
    }

    @Override
    public int getCount() {
        return super.getCount() + 1;
    }

    @Override
    protected View getRealView(int position, View convertView, final ViewGroup parent) {
        ViewHolder vh = null;
        LayoutInflater inflater = getLayoutInflater(parent.getContext());
        if (convertView == null || convertView.getTag() == null) {
            convertView = inflater.inflate(R.layout.list_friend, null);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        } else {

            vh = (ViewHolder) convertView.getTag();

        }


        if (position == 0) {
            vh.im_header.setImageResource(R.drawable.add_friend);
            vh.tv_name.setText("添加好友");
            vh.im_header.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    UIHelper.shoAddNewFriendsActivity(parent.getContext());
                }
            });
        } else {
            FriendBean friendBean = mDatas.get(position-1);
            vh.tv_name.setText(friendBean.getName());
            ImageLoader.getInstance().displayImage(friendBean.getHeaderImageUrl(), vh.im_header, optionsImage);
            vh.tv_name.setText(friendBean.getName());
        }


        return convertView;
    }
}