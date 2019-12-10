package com.example.info;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Main3Activity extends Main2Activity {

    ImageView imageYerResmi;
    ImageView imageBayrak;
    TextView textUlke;
    TextView textSehir;
    TextView textiller;
    LinearLayout linearLayout;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textUlke=findViewById(R.id.textUlkeler);
        textSehir=findViewById(R.id.textSehirler);
        textiller=findViewById(R.id.textiller);
        imageBayrak=findViewById(R.id.imageBayrak);
        imageYerResmi=findViewById(R.id.imageYerResmi);




final Intent intent=getIntent();
String ulke=intent.getStringExtra("ulkeler");
        String iller=intent.getStringExtra("iller");
String yer=intent.getStringExtra("yerler");



        textUlke.setText(ulke);
        textiller.setText(iller);
        textSehir.setText(yer);
       imageYerResmi.setImageBitmap(icon);
        imageBayrak.setImageBitmap(resim);







    }

}
