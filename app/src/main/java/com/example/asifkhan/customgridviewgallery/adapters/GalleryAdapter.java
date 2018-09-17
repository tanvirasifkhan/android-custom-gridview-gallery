package com.example.asifkhan.customgridviewgallery.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asifkhan.customgridviewgallery.R;
import com.example.asifkhan.customgridviewgallery.models.Users;

import java.util.ArrayList;

public class GalleryAdapter extends BaseAdapter {
    private ArrayList<Users> users;
    private Context context;

    public GalleryAdapter(ArrayList<Users> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=layoutInflater.inflate(R.layout.custom_gallery_layout,null);
        ImageView photo,option;
        if(view==null){
            photo=new ImageView(context);
        }
        photo=(ImageView)view.findViewById(R.id.photo);
        option=(ImageView)view.findViewById(R.id.option);
        TextView name=(TextView)view.findViewById(R.id.name);
        TextView profession=(TextView)view.findViewById(R.id.profession);
        Users user=users.get(i);
        photo.setImageResource(user.getPhoto());
        name.setText(user.getName());
        profession.setText(user.getProfession());
        return view;
    }
}
