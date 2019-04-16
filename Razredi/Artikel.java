package Razredi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Artikel implements Searchable {

    ///////atributi/////
    private String id;
    private String ime;
    private double cena;
    private int kolicina;
    private int teza;
    private String ean;
    private static String Drzava;
    private String Popust;

    static private double cenaZddv = 0.22;

    ////konstruktorji///

    public Artikel(String id, String ime, double cena, int kolicina, int teza, String ean,String Popust) {
        this.id = id;
        this.ime = ime;
        this.cena = cena;
        this.kolicina = kolicina;
        this.teza = teza;
        //setCountryByEan(ean);
        this.ean = ean;
        this.Popust = Popust;
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
                ", teza=" + teza +
                ", cena=" + cena +
                ", cena z DDV-jem=" + koncnaCena() +
                ", ean=" + ean +
                ", Popust=" + Popust + "%"+
                ')';
    }

    public int getTeza() {
        return teza;
    }

    public void setTeza(int teza) {
        this.teza = teza;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public double getCena() {
        return cena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public static void setDrzava(String drzava) {
        Drzava = drzava;
    }

    public String getEan() {
        return ean;
    }

    public boolean search(String ime) {
        if (ime.contains("miska")) {
            return true;
        } else
            return false;
    }

    public String getPopust() {
        return Popust;
    }

    public void setPopust(String popust) {
        Popust = popust;
    }

    public static boolean checkDigit(int x[]) {

        int sum1 = 0;
        int sum2 = 0;
        int skupajSUM = 0;
        int checksum_digit = 0;
        int lastItem = x[x.length - 1];
       /* if (x[0] == 3 && x[1] == 8 && x[2] == 3) {
            setDrzava("Slovenija");
        }
*/
        for (int i = 0; i < x.length - 1; i++) {

            if (i % 2 == 0)//sodo
            {
                sum1 += x[i] * 1;
            } else {
                sum2 += x[i] * 3;
            }

        }
        skupajSUM = sum1 + sum2;
        checksum_digit = 10 - (skupajSUM % 10);
        if (checksum_digit == 10) {
            checksum_digit = 0;
        }
        if (checksum_digit == lastItem)
            return true;
        else
            return false;

    }
    public void FilterCrtneKode(String ean) {

        String popust =ean.substring(0,2);
        String st1 = ean.substring(2, 5);
        String st2 = ean.substring(5, 9);
        String st3 = ean.substring(9, 13);
        if(popust.contains("99"))
        {
            double pomoc = (getCena()*10)/100;
            setCena(getCena()-pomoc);
            setPopust("10");

        }
        if(popust.contains("95"))
        {
            double pomoc = (getCena()*5)/100;
            setCena(getCena()-pomoc);
            setPopust("5");
        }
        if(popust.contains("92"))
        {
            double pomoc = (getCena()*20)/100;
            setCena(getCena()-pomoc);
            setPopust("20");
        }
        int teza = Integer.parseInt(st3);
        setTeza(teza);
         int k =teza/100;
         setCena(getCena()*k);
         setKolicina(getKolicina()*k);
        if (st1.contains("211")) {
            setIme("Sadje");
        }
        if (st2.contains("6789")) {
            setId("banana");
        }
        if (st1.contains("111")) {
            setIme("Zelenjava");
        }
        if (st2.contains("6799")) {
            setId("ananas");
        }
        if (st1.contains("321")) {
            setIme("Meso");
        }
        if (st2.contains("6999")) {
            setId("Perutnina");
        }
    }

}




