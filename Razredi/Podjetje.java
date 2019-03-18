package Razredi;

public class Podjetje implements Searchable {

    private String ime;
    private String davcnaST;
    private int maticnaST;
    private Boolean davcniZavezanec;

    public Podjetje(String ime, String davcnaST, int maticnaST, Boolean davcniZavezanec) {
        this.ime = ime;
        this.davcnaST = davcnaST;
        this.maticnaST = maticnaST;
        this.davcniZavezanec = davcniZavezanec;
    }

    public String getIme() {
        return ime;
    }

    public String getDavcnaST() {
        return davcnaST;
    }

    @Override
    public String toString() {
        return "Podjetje{" +
                "ime='" + ime + '\'' +
                ", davcnaST=" + davcnaST +
                ", maticnaST=" + maticnaST +
                ", davcniZavezanec=" + davcniZavezanec +
                '}';
    }

    public boolean search(String davcnaST) {
        if(davcnaST.contains("SI")) {
            return true;
        }
        else
            return false;
    }
}
