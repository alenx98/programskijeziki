package Razredi;

import java.util.ArrayList;
import java.util.List;
import Razredi.Racun;

public class Invoices {

    private List<Racun> seznamRacunov = new ArrayList<>();

    public Invoices(List<Racun> seznamRacunov) {
        this.seznamRacunov = seznamRacunov;
    }

    @Override
    public String toString() {
        return "Invoices{" +
                "seznamRacunov=" + seznamRacunov +
                '}';
    }

    public List<Racun> getSeznamRacunov() {
        return seznamRacunov;
    }

    public void setSeznamRacunov(List<Racun> seznamRacunov) {
        this.seznamRacunov = seznamRacunov;
    }
}
