package com.example.uas_akb3.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uas_akb3.DataAdapter;
import com.example.uas_akb3.DataIsi;
import com.example.uas_akb3.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

// Dibuat oleh 10118353 Enrico Anderson IF8 pada 14 Agustus 2021
public class HomeFragment extends Fragment {
    private RecyclerView simpan;
    private LinearLayoutManager manager;
    DataAdapter dataAdapter;
    List<Integer> drw;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        FirebaseRecyclerOptions<DataIsi> data = new FirebaseRecyclerOptions.Builder<DataIsi>().setQuery(FirebaseDatabase.getInstance("https://uas-akb-d0aa3-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference().child("Bandung"), DataIsi.class).build();
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        simpan = (RecyclerView) root.findViewById(R.id.frag_home);
        simpan.setLayoutManager(new LinearLayoutManager(getActivity()));

        drw = new ArrayList<>();
        drw.add(R.drawable.gambar1);
        drw.add(R.drawable.foto2);


        dataAdapter = new DataAdapter(data,drw);
        simpan.setAdapter(dataAdapter);

        return root;
    }

    @Override
    public void onStart() {
        super.onStart();
        dataAdapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        dataAdapter.stopListening();
    }
}