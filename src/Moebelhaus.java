import Kategorie.*;
import Moebelstueck.Moebelstueck;


class Lager{
    Sitzmoebel[] sitzmoebel = new Sitzmoebel[1000];
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
