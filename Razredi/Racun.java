package Razredi;
import Razredi.Artikel;
import Razredi.Artikli;
import Razredi.Podjetje;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Racun implements Searchable {

   protected String id;
   protected Date datum;
   Artikli artikli;
   protected String izdajatelj;
   protected String davcnaID;




   public Racun( String id, Date datum, Artikli artikli,String izdajatelj ,String davcnaID) {
      this.id = id;
      this.datum = datum;
      this.artikli = artikli;
      this.izdajatelj = izdajatelj;
      this.davcnaID = davcnaID;
   }

   @Override
   public String toString() {
      return "Racun{" +
              "id='" + id + '\'' +
              " datum=" + datum +"}"+"\n"+"-------------------------------------------------------------------------------------------------------------------"+
              "\n" + artikli + "\n"+
              "[izdajatelj=" + izdajatelj +
              ", davcnaID=" + davcnaID +
              ']'+"\n"+"Davčni zavezanec:  "+ search(davcnaID);

   }

   public boolean search(String davcnaID) {
      if(davcnaID.contains("SI")) {
         return true;
      }
      else
         return false;
   }
}
