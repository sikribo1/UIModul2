package com.example.shiboo.fajri_1202140198_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {
    RecyclerView rv;
    menuadapter adapter;
    List<pilihanmenu> listmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.list_menu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }
    private void initdata(){
        listmenu.add(new pilihanmenu(R.drawable.mieacehbiasa, "mie aceh goreng", 15000, "mie danging, rempah-rempah aceh"));
        listmenu.add(new pilihanmenu(R.drawable.mieacehkepiting, "Mie aceh kepiting", 13500, "mie, kepiting,rempah-rempah aceh"));
        listmenu.add(new pilihanmenu(R.drawable.mieacehseafood, "mie aceh seafood", 20000, "mie, seafood, rempah-rempah aceh"));
        listmenu.add(new pilihanmenu(R.drawable.miekuahaceh, "mie aceh kuah", 17000, "mie, daging, rempah-rempah aceh"));
        listmenu.add(new pilihanmenu(R.drawable.mieacehtelur, "miea ceh telur", 50000, "mie, telur, rempah-rempah aceh"));
        adapter = new menuadapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}
