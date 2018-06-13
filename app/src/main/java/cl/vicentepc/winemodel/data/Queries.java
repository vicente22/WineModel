package cl.vicentepc.winemodel.data;

import java.util.ArrayList;
import java.util.List;

import cl.vicentepc.winemodel.models.Wine;

public class Queries {

    public List<Wine> wines() {

        List<Wine> wines = new ArrayList<>();
        List<Wine> wineList = Wine.listAll(Wine.class);

        return wineList;

    }

}
