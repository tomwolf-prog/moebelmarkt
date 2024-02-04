import Kategorie.*;
import Moebelstueck.Moebelstueck;
import java.lang.*;
import java.util.ArrayList;

class Lager{

    /*
    Sitzmoebelbestand

    */
    int Kuechenstuhl;
    int Ohrensessel;
    int Fernsehcouch;
    ArrayList<Sitzmoebel> sitzmoebelArrayList = new ArrayList<Sitzmoebel>();
    Liegemoebel[] liegemoebels = new Liegemoebel[1024];

    public void addSitzmoebel(Sitzmoebel sitzmoebel){
        switch(sitzmoebel.getMoebelart().toString()){
            case "Kuechenstuhl":
                Kuechenstuhl++;
                break;

            case "Ohrensessel":
                Ohrensessel++;
                break;

            case "Fernsehcouch":
                Fernsehcouch++;
                break;

        }
        sitzmoebelArrayList.add(sitzmoebel);


    }

    //... andere Lagerbestände
}

public class Moebelhaus {
    public static void main(String[] args){

        Sitzmoebel a = new Sitzmoebel(Sitzmoebel.Sitzplaetze.eins);
        a.setVerkauspreis(100);
        a.setBereich(Moebelstueck.Bereich.Kueche);
        a.setSitzplaetze(Sitzmoebel.Sitzplaetze.eins);

        Tische b = new Tische();
        b.setHoehe(Tische.Hoehe.A);




    }
}
