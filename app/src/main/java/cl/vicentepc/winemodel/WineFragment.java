package cl.vicentepc.winemodel;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.vicentepc.winemodel.adapters.WinesAdapter;
import cl.vicentepc.winemodel.models.Wine;


/**
 * A simple {@link Fragment} subclass.
 */
public class WineFragment extends Fragment{

    private WinesAdapter adapter;


    public WineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wine, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewWine);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        Wine wine1 = new Wine("Santa Rita","1980","Carmener");
        wine1.save();

        Wine wine2 = new Wine("Casillero del Diablo", "2005", "Merlot");
        wine2.save();

        Wine wine3 = new Wine("Graham's Port","1995","Malbec");
        wine3.save();

        Wine wine4 = new Wine("Château Margaux","1999","Cabernet Sauvignon");
        wine4.save();

        Wine wine5 = new Wine("Ridge","2017","Pinot Noir");
        wine5.save();

        adapter = new WinesAdapter();
        recyclerView.setAdapter(adapter);

    }

}
