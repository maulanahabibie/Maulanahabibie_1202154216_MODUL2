package com.example.android.megamendungfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class MainActivity_Menu extends AppCompatActivity {

	String lanjut;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main__menu);
		Context context = getApplicationContext();
		Toast toast = Toast.makeText(context, "Habibi_1202154216", Toast.LENGTH_LONG);
		toast.show();
	}

	public void dineIn(View view) {

		this.lanjut = "Dinner In";

	}
	public void takeAway(View view) {
		this.lanjut = "Take Away";

	}
	public void pilih(View view) {
		if (this.lanjut == "Dinner In") {
			Intent i = new Intent(this, MainActivity_Dinnerin.class);
			startActivity(i);
		}else if(this.lanjut == "Take Away"){
			Intent i = new Intent(this, MainActivity_Takeaway.class);
			startActivity(i);
		}
	}
}
