package com.example.asifkhan.customgridviewgallery.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

import com.example.asifkhan.customgridviewgallery.R;
import com.example.asifkhan.customgridviewgallery.adapters.GalleryAdapter;
import com.example.asifkhan.customgridviewgallery.models.Users;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Users> users;
    private GridView gallery;
    private GalleryAdapter galleryAdapter;
    private String[] names={
            "Asif Khan","Tanvir Ahmed","Nafis Iqbal","Rahim Islam","Abir Hasan",
            "Asif Khan","Tanvir Ahmed","Nafis Iqbal","Rahim Islam","Abir Hasan",
            "Asif Khan","Tanvir Ahmed","Nafis Iqbal","Rahim Islam","Abir Hasan",
            "Asif Khan","Tanvir Ahmed","Nafis Iqbal","Rahim Islam","Abir Hasan",
            "Asif Khan","Tanvir Ahmed","Nafis Iqbal","Rahim Islam","Abir Hasan"
    };
    private String[] professions={
            "Android Developer","Web Developer","Python Programmer","iOS Programmer","Data Analyst",
            "Android Developer","Web Developer","Python Programmer","iOS Programmer","Data Analyst",
            "Android Developer","Web Developer","Python Programmer","iOS Programmer","Data Analyst",
            "Android Developer","Web Developer","Python Programmer","iOS Programmer","Data Analyst",
            "Android Developer","Web Developer","Python Programmer","iOS Programmer","Data Analyst"
    };
    private int[] photos={
            R.drawable.sample_5,R.drawable.sample_1,R.drawable.sample_6,R.drawable.sample_5,R.drawable.sample_5,
            R.drawable.sample_0,R.drawable.sample_2,R.drawable.sample_3,R.drawable.sample_5,R.drawable.sample_2,
            R.drawable.sample_6,R.drawable.sample_1,R.drawable.sample_4,R.drawable.sample_6,R.drawable.sample_4,
            R.drawable.sample_0,R.drawable.sample_3,R.drawable.sample_3,R.drawable.sample_5,R.drawable.sample_4,
            R.drawable.sample_7,R.drawable.sample_1,R.drawable.sample_5,R.drawable.sample_5,R.drawable.sample_0
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
        users=new ArrayList<>();
        gallery=(GridView)findViewById(R.id.gallery);
        galleryAdapter=new GalleryAdapter(users,this);
        gallery.setAdapter(galleryAdapter);
        getDatas();
    }

    // getting all the datas
    private void getDatas(){
        for(int count=0;count<names.length;count++){
            users.add(new Users(names[count],professions[count],photos[count]));
        }
    }
}
