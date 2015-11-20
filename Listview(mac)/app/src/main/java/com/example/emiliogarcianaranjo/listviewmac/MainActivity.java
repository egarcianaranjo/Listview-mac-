package com.example.emiliogarcianaranjo.listviewmac;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

    private ListView lvLista;

    Pelicula[] lista= {
            new Pelicula(1, "Batman", "www.es.es"),
            new Pelicula(1, "Batman", "www.es.es"),
            new Pelicula(1, "Batman", "www.es.es"),
            new Pelicula(1, "Batman", "www.es.es"),
            new Pelicula(1, "Batman", "www.es.es"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvLista = (ListView)findViewById(R.id.lvLista);
        PeliculaAdapter pa = new PeliculaAdapter(this, lista);
        lvLista.setAdapter(pa);

    }
}
