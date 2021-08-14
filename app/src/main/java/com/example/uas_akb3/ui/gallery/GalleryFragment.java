package com.example.uas_akb3.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.uas_akb3.R;
import com.example.uas_akb3.databinding.ActivityGalleryFragmentBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.DatabaseReference;
// Dibuat oleh 10118353 Enrico Anderson IF8 pada 14 Agustus 2021
public class GalleryFragment extends Fragment {
    private DatabaseReference reference;
    private GoogleMap mMap;
    private ActivityGalleryFragmentBinding binding;
    private LatLng test;

// Dibuat oleh 10118353 Enrico Anderson IF8

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.activity_gallery_fragment, container, false);

        return root;
    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    private OnMapReadyCallback callback = new OnMapReadyCallback() {
        @Override
        public void onMapReady(GoogleMap googleMap) {
            mMap = googleMap;



            LatLng Trans = new LatLng(-6.924970675263676, 107.63649392250605);
            LatLng FarmHouse = new LatLng(-6.832628110712072, 107.60565048444624);


            mMap.addMarker(new MarkerOptions().position(Trans).title("Trans Studio Bandung"));
            mMap.addMarker(new MarkerOptions().position(FarmHouse).title("FarmHouse Lembang"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Trans, 12));
        }
    };

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }

}