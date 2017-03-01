package com.bekatei.sinauandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Pita4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //Deklarasi variabel
    private Spinner spinner1, spinner2, spinner3, spinner4;
    TextView teks_pita1, teks_pita2, teks_pita3, teks_pita4;
    private String[] listwarna = {"Hitam","Coklat","Merah","Orange","Kuning","Hijau","Biru","Ungu","Abu-Abu","Putih"};
    private String[] listwarna2 = {"Hitam","Coklat","Merah","Orange","Kuning","Hijau","Biru","Ungu","Emas","Perak"};
    private String[] listwarna3 = {"Hitam","Coklat","Merah","Hijau","Biru","Ungu","Emas","Perak"};
    private String[] listangka = {"0","1","2","3","4","5","6","7","8","9"};
    private String[] listpangkat = {"x1","x10","x100","x1K","x10K","x100K","x1M","x10M","x0.1","x0.01"};
    private String[] listpersen = {"20%","1%","2%","0.5%","0.25%","0.10%","0.05%","5%","10%"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pita4);

        //inisialisasi UI
        teks_pita1 = (TextView) findViewById(R.id.nilaipita1);
        teks_pita2 = (TextView) findViewById(R.id.nilaipita2);
        teks_pita3 = (TextView) findViewById(R.id.nilaipita3);
        teks_pita4 = (TextView) findViewById(R.id.nilaipita4);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);

        //Inisialisasi event
        spinner1.setOnItemSelectedListener(this);
        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, listwarna);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        spinner2.setOnItemSelectedListener(this);
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, listwarna);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        spinner3.setOnItemSelectedListener(this);
        ArrayAdapter adapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, listwarna2);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        spinner4.setOnItemSelectedListener(this);
        ArrayAdapter adapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, listwarna3);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Spinner spinner = (Spinner) parent;
        if(spinner.getId() == R.id.spinner1)
        {
            teks_pita1.setText(listangka[position]);
        }
        else if(spinner.getId() == R.id.spinner2)
        {
            teks_pita2.setText(listangka[position]);
        }
        else if(spinner.getId() == R.id.spinner3)
        {
            teks_pita3.setText(listpangkat[position]);
        }
        else if(spinner.getId() == R.id.spinner4)
        {
            teks_pita4.setText(listpersen[position]);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
