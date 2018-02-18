package com.example.android.megamendungfood;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity_Takeaway extends AppCompatActivity {



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main__takeaway);
		Context context = getApplicationContext();
		Toast toast = Toast.makeText(context, "Take Away", Toast.LENGTH_LONG);
		toast.show();
	}
	public void mesan(View view) {
		Intent i = new Intent(this, MainActivity_Content.class);
		startActivity(i);
	}
}
