package com.example.gmailui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.gmailui.adapters.CustomAdapter;
import com.example.gmailui.models.CustomItemModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<CustomItemModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();

        items.add(new CustomItemModel("CuongKEZ", "Hello my friend! How are you today ?.", "12:34 PM"));
        items.add(new CustomItemModel("Chris Abad", "Help make Campaign Monitor better Let us know your thoughts! No Images...", "11:22 AM"));
        items.add(new CustomItemModel("Tuto.com", "8h de formation gratuite et les nouvea... Photoshop, SEO, Blender, CSS, WorlPre...", "11:04 AM"));
        items.add(new CustomItemModel("support", "Société Ovh: suivi de vos sevices- hp... SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM"));
        items.add(new CustomItemModel("Matt from lonic", "The New lonic Creator Is Here! Announcing the all-new Creator, build...", "10:04 AM"));

        CustomAdapter adapter = new CustomAdapter(this, items);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
