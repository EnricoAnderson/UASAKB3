package com.example.uas_akb3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import org.jetbrains.annotations.NotNull;

// Dibuat oleh 10118353 Enrico Anderson IF8 pada 14 Agustus 2021
public class DataAdapter extends  FirebaseRecyclerAdapter<DataIsi, DataAdapter.ViewHolder> {


    public DataAdapter(@NonNull @NotNull FirebaseRecyclerOptions<DataIsi> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull DataIsi model) {
        holder.nama.setText(model.getNama());
        holder.alamat.setText(model.getAlamat());



    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data,parent,false);

        return new ViewHolder(view);
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gambar;
        TextView nama;
        TextView alamat;

        public ViewHolder(View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.gambaritem);
            nama = itemView.findViewById(R.id.tulisanitem);
            alamat = itemView.findViewById(R.id.tulisanalamat);
        }
    }

}
