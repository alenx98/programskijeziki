package Razredi;

import java.util.ArrayList;
import java.util.List;
import Razredi.Artikel;

public class Artikli {


    private List<Artikel> seznam = new ArrayList<>();

    public Artikli(List<Artikel> seznam) {
        this.seznam = seznam;
    }

    @Override
    public String toString() {
        return  seznam +"\n"+"-------------------------------------------------------------------------------------------------------------------";
    }

    public List<Artikel> getSeznam() {
        return seznam;
    }

    public void setSeznam(List<Artikel> seznam) {
        this.seznam = seznam;
    }

}