package com.example.android.megamendungfood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_Content extends AppCompatActivity {

	private List<menu> menuList = new ArrayList<>();
	private RecyclerView recyclerView;
	private menuAdapter mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main__content);

		recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

		mAdapter = new menuAdapter(this, menuList);
		RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
		recyclerView.setLayoutManager(mLayoutManager);
		recyclerView.setItemAnimator(new DefaultItemAnimator());
		recyclerView.setAdapter(mAdapter);
		prepareMovieData();
	}

	private void prepareMovieData() {
		menu menu = new menu(R.drawable.docang, "Docang", "Rp. 10.000", R.string.docang);
		menuList.add(menu);

		menu = new menu(R.drawable.empal, "Empal Gentong", "Rp. 20.000", R.string.empal);
		menuList.add(menu);
		menu = new menu(R.drawable.jamblang, "Nasi Jamblang", "Rp. 15.000", R.string.jamblang);
		menuList.add(menu);
		menu = new menu(R.drawable.ketoprak, "Ketoprak", "Rp. 10.000", R.string.ketoprak);
		menuList.add(menu);
		menu = new menu(R.drawable.krupuk, "Krupuk Melarat", "Rp. 5.000", R.string.krupuk);
		menuList.add(menu);
		menu = new menu(R.drawable.lengko, "Nasi Lengko", "Rp. 10.000", R.string.lengko);
		menuList.add(menu);
		menu = new menu(R.drawable.mie, "Mie Koclok", "Rp. 15.000", R.string.mie);
		menuList.add(menu);
		menu = new menu(R.drawable.sate, "Sate Kalong", "Rp. 20.000", R.string.sate);
		menuList.add(menu);
		menu = new menu(R.drawable.tahu, "Tahu Gejrot", "Rp. 10.000", R.string.tahu);
		menuList.add(menu);
	}
	}


