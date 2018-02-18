package com.example.android.megamendungfood;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_Detail extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main__detail);

		Intent i = getIntent();
		int gambar = i.getExtras().getInt("gambar");
		String nama = i.getStringExtra("nama");
		String harga = i.getStringExtra("harga");
		int komposisis = i.getExtras().getInt("komposisi");
		ImageView gambarDetail = (ImageView) findViewById(R.id.detailmenu);
		TextView namaMenu = (TextView) findViewById(R.id.namaMenu);
		TextView hargaMenu = (TextView) findViewById(R.id.hargaMenu);
		TextView komposisi = (TextView) findViewById(R.id.komposisi);


		gambarDetail.setImageResource(gambar);
		namaMenu.setText(nama);
		hargaMenu.setText(harga);
		komposisi.setText(komposisis);
	}
	public void konfirmasi(View view) {
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
		alertDialogBuilder.setMessage("Pesanan Berhasil,Harap Tunggu!");
		alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialogInterface, int i) {
				Intent intent = new Intent(getApplicationContext(), MainActivity_Menu.class);
				startActivity(intent);
			}
		});
		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();
	}
}
