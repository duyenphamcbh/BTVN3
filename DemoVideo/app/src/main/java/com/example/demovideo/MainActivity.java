package com.example.demovideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.demovideo.adapter.EmailAdapter;
import com.example.demovideo.model.Email;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String [] listName = {"Edurila.com","Chris Abad", "Tuto.com", "suport", "Matt from lonic", "Google", "Shopee","Adobe", "Dell", "Adobe Creative Cloud"};
    String [] listTime = {"12:34 PM","11:22 AM", "11:04 AM", "10:26 AM", "02:10 PM","03:26 PM", "01:11 AM", "05:27 PM", "08:36 AM","04:26 PM"};
    String [] listContent = {"$19 Only(First 10 spots)-Best selling...","Help make Campaign Monitor better...","8h de formation gratuite et les nouvea...",
            "Societe Ovh: suivi de vos services - hp...","The New lonic Creator Is Here!","$19 Only(First 10 spots)-Best selling...","Help make Campaign Monitor better",
            "8h de formation gratuite et les nouvea...","Societe Ovh: suivi de vos services - hp...","The New lonic Creator Is Here!"};
    String [] listTitleContent = {"Are you looking to Learn Web Designin...","Let us know your thoughts! No Images...","Photoshop, SEO,, Blender, CSS, WordPre...",
            "SAS OVH - http://www.ovh.com 2 rue K...","Announcing the all-new Creator, build ...","Are you looking to Learn Web Designin...","Let us know your thoughts! No Images...",
            "Photoshop, SEO,, Blender, CSS, WordPre...", "SAS OVH - http://www.ovh.com 2 rue K...","Announcing the all-new Creator, build ..."};
    List<Email> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        list = new ArrayList<>();
        for (int i = 0; i<10; i++){
            list.add(new Email(listName[i].substring(0,1),listName[i],listTime[i],listContent[i], listTitleContent[i]));
        }


        EmailAdapter adapter = new EmailAdapter(this, list);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}