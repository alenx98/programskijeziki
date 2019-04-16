package Razredi;
import java.util.ArrayList;
import java.util.List;
import Razredi.Podjetje;
public class Companies {

    private List<Podjetje> seznamPodjetij = new ArrayList<>();

    public Companies(List<Podjetje> seznamPodjetij) {
        this.seznamPodjetij = seznamPodjetij;
    }

    @Override
    public String toString() {
        return " " +"\n"+"-------------------------------------------------------------------------------------------------------------------"+"\n"+
                ""
                + seznamPodjetij
                ;
    }

    public List<Podjetje> getSeznamPodjetij() {
        return seznamPodjetij;
    }

    public void setSeznamPodjetij(List<Podjetje> seznamPodjetij) {
        this.seznamPodjetij = seznamPodjetij;
    }
}
