package Razredi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Artikel implements Searchable {

    ///////atributi/////
    private String id;
    private String ime;
    private double cena;
    private int kolicina;
    private String Drzava;

    static private double cenaZddv = 0.22;

    ////konstruktorji///

    public Artikel(String id, String ime, double cena, int kolicina, String Drzava) {
        this.id = id;
        this.ime = ime;
        this.cena = cena;
        this.kolicina = kolicina;
        this.Drzava = Drzava;
    }

    public double koncnaCena() {
        return cena + cenaZddv;
    }

    @Override
    public String toString() {
            return "\n" + "(" +
                    "ID='" + id + '\'' +
                    "ime='" + ime + '\'' +
                    ", kolicina=" + kolicina +
                    ", cena=" + cena +
                    ", cena z DDV-jem=" + koncnaCena() +
                    ", Drzava=" + Drzava +
                    ')';
    }

    public double getCena() {
        return cena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setDrzava(String drzava) {
        Drzava = drzava;
    }

    public boolean search(String ime) {
        if (ime.contains("miska")) {
            return true;
        } else
            return false;
    }

    public boolean checkDigit(int x[]) {

        int sum1 = 0;
        int sum2 = 0;
        int skupajSUM = 0;
        int checksum_digit = 0;
        int lastItem = x[x.length-1];
            if(x[0] == 3 && x[1] == 8 && x[2] == 3)
            {
                setDrzava("Slovenija");
            }

        for( int i = 0; i< x.length-1; i++ ) {

            if (i% 2 == 0)//sodo
            {
                sum1 += x[i]*1;
            }
            else
            {
                sum2 += x[i]*3;
            }

        }
        skupajSUM = sum1 + sum2;
        checksum_digit = 10 - (skupajSUM % 10);
        if(checksum_digit == 10)
        {
            checksum_digit = 0;
        }
        if(checksum_digit == lastItem)
            return true;
        else
        return false;

    }
}




