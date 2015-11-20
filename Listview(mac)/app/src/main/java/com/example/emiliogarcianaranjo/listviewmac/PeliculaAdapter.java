package com.example.emiliogarcianaranjo.listviewmac;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by emiliogarcianaranjo on 20/11/15.
 */
class PeliculaAdapter extends BaseAdapter {

    private List<Pelicula> miLista;
    private Context miContext;

    public PeliculaAdapter(Context context, List<Pelicula> lista)
    {
        miLista = lista;
        miContext = context;
    }

    @Override
    public int getCount()
    {
        return this.miLista.size();
    }

    @Override
    public Object getItem(int position)
    {
        return this.miLista.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater)miContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View fila = inflater.inflate(R.layout.activity_list_view, null);

        ImageView ivCartel = (ImageView)(fila.findViewById(R.id.ivPoster));
        TextView tvTitulo = (TextView)(fila.findViewById(R.id.tvTitulo));
        TextView tvUrl = (TextView)(fila.findViewById(R.id.tvUrl));

        Pelicula peli = this.miLista.get(position);
        // ivCartel.setImageDrawable();
        tvTitulo.setText(peli.getTitulo());
        tvUrl.setText(peli.getUrl());

        return fila;
    }


}
