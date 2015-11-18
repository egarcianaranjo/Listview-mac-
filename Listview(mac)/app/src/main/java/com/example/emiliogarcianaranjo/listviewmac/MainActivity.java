package com.example.emiliogarcianaranjo.listviewmac;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView)findViewById(R.id.lvLista);

        // Array con las opciones
        final String[] datos = new String[]{
                "Opcion 1",
                "Opcion 2",
                "Opcion 3",
                "Opcion 4",
                "Opcion 5",
        };

        // Adaptador
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);

        // Establecemos el adaptador del listview
        lista.setAdapter(adaptador);
    }
}
