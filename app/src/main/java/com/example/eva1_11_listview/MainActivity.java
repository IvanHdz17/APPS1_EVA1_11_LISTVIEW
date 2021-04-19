package com.example.eva1_11_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lstVwDatos;
    String[] aDatos = {
            "Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre",
            "Enero2",
            "Febrero2",
            "Marzo2",
            "Abril2",
            "Mayo2",
            "Junio2",
            "Julio2",
            "Agosto2",
            "Septiembre2",
            "Octubre2",
            "Noviembre2",
            "Diciembre2"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwDatos = findViewById(R.id.lstVwDatos);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwDatos = findViewById(R.id.lstVwDatos);
        lstVwDatos.setAdapter(new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                aDatos
        ));
        lstVwDatos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, aDatos[position], Toast.LENGTH_SHORT).show();
    }
}