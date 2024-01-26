import Kategorie.Sitzmoebel;
import Moebstueck.Moebelstueck;

public class Moebelhaus {
    public static void main(String[] args){

        Sitzmoebel a = new Sitzmoebel();
        a.setVerkauspreis(100);
        a.setMoebelart(Moebelstueck.Bereich.Kueche);
        System.out.println(a.getMoebelart());

    }
}
