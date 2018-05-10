package com.example.betsysanchez.a51_deteccion_de_sensores;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by BetsySanchez on 08/05/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private List<DataProvider> lista;
    private Context mCtx;

    public RecyclerAdapter(List<DataProvider> lista, Context mCtx) {
        this.lista = lista;
        this.mCtx = mCtx;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.item_layout,null);
        RecyclerViewHolder holder = new RecyclerViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        DataProvider producto = lista.get(position);

        holder.nombre.setText(producto.getNombre());
        holder.fabricante.setText(producto.getFabricante());
        holder.version.setText(producto.getVersion());
        // holder.imagen.setImageDrawable(mCtx.getResources().getDrawable(R.drawable.contacto_mini));
    }

    @Override
    public int getItemCount() {return lista.size();}

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView nombre,fabricante,version;
        // ImageView imagen;
        public RecyclerViewHolder(View itemView) {
            super(itemView);

            //   imagen=itemView.findViewById(R.id.logo);
            nombre=itemView.findViewById(R.id.nombre);
            fabricante=itemView.findViewById(R.id.fabricante);
            version=itemView.findViewById(R.id.version);
        }
    }
}

