package com.example.android.megamendungfood;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity_Dinnerin extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
	int someVar;
	String pilihan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main__dinnerin);
		Context context = getApplicationContext();
		Toast toast = Toast.makeText(context, "Dinner in", Toast.LENGTH_LONG);
		toast.show();
		showSpinner();
	}
	public void showSpinner() {

		Spinner spinner = (Spinner) findViewById(R.id.meja);
		if (spinner != null) {
			spinner.setOnItemSelectedListener(this);
		}
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
				R.array.menu, android.R.layout.simple_spinner_item);


		adapter.setDropDownViewResource
				(android.R.layout.simple_spinner_dropdown_item);


		if (spinner != null) {
			spinner.setAdapter(adapter);
		}
	}

	@Override
	public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
		this.pilihan = adapterView.getItemAtPosition(position).toString();
		String showToast = this.pilihan+" Pilihan Anda";
		this.someVar = position;
		if(position!=0) {
			Context context = getApplicationContext();
			Toast toast = Toast.makeText(context, showToast, Toast.LENGTH_LONG);
			toast.show();
		}
	}

	@Override
	public void onNothingSelected(AdapterView<?> adapterView  ) {
	}


		public void pesan(View view) {
			Context context = getApplicationContext();

			if (someVar != 0) {
				Intent i = new Intent(this, MainActivity_Content.class);
				startActivity(i);
			} else {
				Toast toast = Toast.makeText(context, "Booking Meja Terlebih Dahulu", Toast.LENGTH_LONG);
				toast.show();
			}
		}	}
