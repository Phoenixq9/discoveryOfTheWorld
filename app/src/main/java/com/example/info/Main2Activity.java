package com.example.info;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
ListView listView;
 static Bitmap icon;
 static  Bitmap resim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView=findViewById(R.id.listView2);

        final ArrayList<String> ulkeler=new ArrayList<>();
        ulkeler.add("Türkiye");
        ulkeler.add("Almanya");
        ulkeler.add("İtalya");
        ulkeler.add("Azerbaycan");
        ulkeler.add("Fransa");
        ulkeler.add("Rusya");
        ulkeler.add("İngiltere");
        ulkeler.add("Yunanistan");
        ulkeler.add("İspanya");
        ulkeler.add("Macaristan");
        ulkeler.add("Hindistan");
        ulkeler.add("Avustralya");
        ulkeler.add("ABD");
        ulkeler.add("Brezilya");
        ulkeler.add("Birleşik Arap Emirlikleri");

        final ArrayList<String> iller=new ArrayList<>();
        iller.add("İstanbul");
        iller.add("Berlin");
        iller.add("Roma");
        iller.add("Bakü");
        iller.add("Paris");
        iller.add("Moskova");
        iller.add("Londra");
        iller.add("Atina");
        iller.add("Barselona");
        iller.add("Budapeşte");
        iller.add("Yeni Delhi");
        iller.add("Sidney");
        iller.add("New York’");
        iller.add("Brasilia");
        iller.add("Dubai");

        final ArrayList<String> yerler=new ArrayList<>();
        yerler.add("Kız Kulesi");
        yerler.add("Brandenburg Kapısı");
        yerler.add("Kolezyum");
        yerler.add("Ateş Kuleleri");
        yerler.add("Eyfel Kulesi");
        yerler.add("Aziz Vasil Katedrali");
        yerler.add("Big Ben");
        yerler.add("Parthenon");
        yerler.add("Sagrada Familia");
        yerler.add("Parlamento Binası");
        yerler.add("Lotus (Bahai) Tapınağı");
        yerler.add("Sidney Opera Evi");
        yerler.add("Empire State Binası");
        yerler.add("Brasilia Katedrali");
        yerler.add("Burj Khalifa");

        Bitmap kizkulesi= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kizkulesi);
        Bitmap brandenburgkapisi=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.brandenburgkapisi);
        Bitmap kolezyum=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kolezyum);
        Bitmap ateskuleleri=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ateskuleleri);
        Bitmap eyfelkulesi=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.eyfelkulesi);
        Bitmap azizvasilkatedrali=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.azizvasilkatedrali);
        Bitmap bigben=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.bigben);
        Bitmap parthenon=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.parthenon);
        Bitmap sagradafamilia=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.sagradafamilia);
        Bitmap parlamentobinasi=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.parlamentobinasi);
        Bitmap lotusbahaitapinagi=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.lotusbahaitapinagi);
        Bitmap sidneyoperaevi=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.sidneyoperaevi);
        Bitmap empirestatebinasi=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.empirestatebinasi);
        Bitmap brasiliakatedrali=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.brasiliakatedrali);
        Bitmap burjkhalifa=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.burjkhalifa);

        final ArrayList<Bitmap>iconlar=new ArrayList<>();
        iconlar.add(kizkulesi);
        iconlar.add(brandenburgkapisi);
        iconlar.add(kolezyum);
        iconlar.add(ateskuleleri);
        iconlar.add(eyfelkulesi);
        iconlar.add(azizvasilkatedrali);
        iconlar.add(bigben);
        iconlar.add(parthenon);
        iconlar.add(sagradafamilia);
        iconlar.add(parlamentobinasi);
        iconlar.add(lotusbahaitapinagi);
        iconlar.add(sidneyoperaevi);
        iconlar.add(empirestatebinasi);
        iconlar.add(brasiliakatedrali);
        iconlar.add(burjkhalifa);

        Bitmap turkeyflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.turkeyflag);
        Bitmap germayflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.germayflag);
        Bitmap italyflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.italyflag);
        Bitmap azerbaijanflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.azerbaijanflag);
        Bitmap franceflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.franceflag);
        Bitmap russiaflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.russiaflag);
        Bitmap englandflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.englandflag);
        Bitmap greeceflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.greeceflag);
        Bitmap spainflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.spainflag);
        Bitmap hungaryflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.hungaryflag);
        Bitmap indiaflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.indiaflag);
        Bitmap australiaflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.australiaflag);
        Bitmap abdflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.abdflag);
        Bitmap brazilflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.brazilflag);
        Bitmap unitedarabemiratesflag=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.unitedarabemiratesflag);

        final ArrayList<Bitmap> resimler=new ArrayList<>();
        resimler.add(turkeyflag);
        resimler.add(germayflag);
        resimler.add(italyflag);
        resimler.add(azerbaijanflag);
        resimler.add(franceflag);
        resimler.add(russiaflag);
        resimler.add(englandflag);
        resimler.add(greeceflag);
        resimler.add(spainflag);
        resimler.add(hungaryflag);
        resimler.add(indiaflag);
        resimler.add(australiaflag);
        resimler.add(abdflag);
        resimler.add(brazilflag);
        resimler.add(unitedarabemiratesflag);

        ArrayAdapter arrayAdapter=new ArrayAdapter(Main2Activity.this,android.R.layout.simple_list_item_1,ulkeler);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
        intent.putExtra("ulkeler",ulkeler.get(position));
        intent.putExtra("iller",iller.get(position));
        intent.putExtra("yerler",yerler.get(position));

        icon=iconlar.get(position);
        resim=resimler.get(position);
        startActivity(intent);
    }
});

    }
}
