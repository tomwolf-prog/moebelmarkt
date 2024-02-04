import Kategorie.*;
import Moebelstueck.Moebelstueck;
import java.lang.*;
import java.util.ArrayList;

class Lager{
    private static Lager instance;
    // Lagerung
    private int anzahlKuechenregal;
    private int anzahlBeistelltisch;
    private int anzahlKleiderschrank;
    ArrayList<Lagerung> lagerungArrayList; 

    // Liegemoebel
    private int anzahlDoppelbett;
    private int anzahlBalkonliege;
    ArrayList<Liegemoebel> liegemoebelArrayList;

    // Sitzmöbel 
    private int anzahlKuechenstuhl;
    private int anzahlOhrensessel;
    private int anzahlFernsehcouch;
    ArrayList<Sitzmoebel> sitzmoebelArrayList; 

    // Tische 
    private int anzahlKuechentisch;
    private int anzahlCouchtisch;
    private int anzahlBuerotisch;
    private int anzahlEsstisch;
    ArrayList<Tische> tischeArrayList;


    private Lager(){
        lagerungArrayList = new ArrayList<Lagerung>();
        liegemoebelArrayList = new ArrayList<Liegemoebel>();
        sitzmoebelArrayList = new ArrayList<Sitzmoebel>();
        tischeArrayList = new ArrayList<Tische>();
    }

    // Singleton - nur ein Lager / eine Instanz
    public static Lager getInstance(){
        if (instance == null){
            instance = new Lager();
        }
        return instance;
    }

    // Lagerung 
    public int getAnzahlKuechenregal() {
        return anzahlKuechenregal;
    }
    public int getAnzahlBeistelltisch() {
        return anzahlBeistelltisch;
    }
    public int getAnzahlKleiderschrank() {
        return anzahlKleiderschrank;
    }

    public void addLagerung(Lagerung lagerung){
        switch(lagerung.getMoebelart().toString()){
            case "Kuechenregal":
                this.anzahlKuechenregal++;
                break;
            case "Beistelltisch":
                this.anzahlBeistelltisch++;
                break;
            case "Kleiderschrank":
                this.anzahlKleiderschrank++;
                break;
        }
        lagerungArrayList.add(lagerung);
    }

    public void removeLagerung(Lagerung lagerung){
        switch(lagerung.getMoebelart().toString()){
            case "Kuechenregal":
                this.anzahlKuechenregal--;
                break;
            case "Beistelltisch":
                this.anzahlBeistelltisch--;
                break;
            case "Kleiderschrank":
                this.anzahlKleiderschrank--;
                break;
        }
        lagerungArrayList.remove(lagerung);
    }

    public boolean removeLagerung(Lagerung lagerung, Flaeche flaeche){
        switch(lagerung.getMoebelart().toString()){
            case "Kuechenregal":
                this.anzahlKuechenregal--;
                break;
            case "Beistelltisch":
                this.anzahlBeistelltisch--;
                break;
            case "Kleiderschrank":
                this.anzahlKleiderschrank--;
                break;
        }
        for (Lagerung l : lagerungArrayList){
            if (l.getFlaeche().equals(flaeche)){
                lagerungArrayList.remove(l);
                return true;
            }
        }
        return false;
    }

    //Liegemoebel
    public int getAnzahlDoppelbett() {
        return anzahlDoppelbett;
    }
    public int getAnzahlBalkonliege() {
        return anzahlBalkonliege;
    }

    public void addLiegemoebel(Liegemoebel liegemoebel){
        switch(liegemoebel.getMoebelart().toString()){
            case "Doppelbett":
                this.anzahlDoppelbett++;
                break;
            case "Balkonliege":
                this.anzahlBalkonliege++;
                break;
        }
        liegemoebelArrayList.add(liegemoebel);
    }

    public void removeLiegemoebel(Liegemoebel liegemoebel){
        switch(liegemoebel.getMoebelart().toString()){
            case "Doppelbett":
                this.anzahlDoppelbett--;
                break;
            case "Balkonliege":
                this.anzahlBalkonliege--;
                break;
        }
        liegemoebelArrayList.remove(liegemoebel);
    }

    public boolean removeLiegemoebel(Liegemoebel liegemoebel, Laenge laenge){
        switch(liegemoebel.getMoebelart().toString()){
            case "Doppelbett":
                this.anzahlDoppelbett--;
                break;
            case "Balkonliege":
                this.anzahlBalkonliege--;
                break;
        }
        for (Liegemoebel l : liegemoebelArrayList){
            if (l.getLaenge().equals(laenge)){
                liegemoebelArrayList.remove(l);
                return true;
            }
        }
        return false;
    }

    // Sitzmoebel
    public int getAnzahlKuechenstuhl() {
        return anzahlKuechenstuhl;
    }
    public int getAnzahlOhrensessel() {
        return anzahlOhrensessel;
    }
    public int getAnzahlFernsehcouch() {
        return anzahlFernsehcouch;
    }


    public void addSitzmoebel(Sitzmoebel sitzmoebel){
        switch(sitzmoebel.getMoebelart().toString()){
            case "Kuechenstuhl":
                this.anzahlKuechenstuhl++;
                break;
            case "Ohrensessel":
                this.anzahlOhrensessel++;
                break;
            case "Fernsehcouch":
                this.anzahlFernsehcouch++;
                break;
        }
        sitzmoebelArrayList.add(sitzmoebel);
    }

    public void removeSitzmoebel(Sitzmoebel sitzmoebel){
        switch(sitzmoebel.getMoebelart().toString()){
            case "Kuechenstuhl":
                this.anzahlKuechenstuhl--;
                break;
            case "Ohrensessel":
                this.anzahlOhrensessel--;
                break;
            case "Fernsehcouch":
                this.anzahlFernsehcouch--;
                break;
        }
        sitzmoebelArrayList.remove(sitzmoebel);
    }

    public boolean removeSitzmoebel(Sitzmoebel sitzmoebel, Sitzmoebel.Sitzplaetze sitzplaetze){
        switch(sitzmoebel.getMoebelart().toString()){
            case "Kuechenstuhl":
                this.anzahlKuechenstuhl--;
                break;
            case "Ohrensessel":
                this.anzahlOhrensessel--;
                break;
            case "Fernsehcouch":
                this.anzahlFernsehcouch--;
                break;
        }
        for (Sitzmoebel s : sitzmoebelArrayList){
            if (s.getSitzplaetze().equals(sitzplaetze)){
                sitzmoebelArrayList.remove(s);
                return true;
            }
        }
        return false;
    }

    // Tische
    public int getAnzahlKuechentisch() {
        return anzahlKuechentisch;
    }
    public int getAnzahlCouchtisch() {
        return anzahlCouchtisch;
    }
    public int getAnzahlBuerotisch() {
        return anzahlBuerotisch;
    }
    public int getAnzahlEsstisch() {
        return anzahlEsstisch;
    }

    public void addTische(Tische tische){
        switch(tische.getMoebelart().toString()){
            case "Kuechentisch":
                this.anzahlKuechentisch++;
                break;
            case "Couchtisch":
                this.anzahlCouchtisch++;
                break;
            case "Buerotisch":
                this.anzahlBuerotisch++;
                break;
            case "Esstisch":
                this.anzahlEsstisch++;
                break;
        }
        tischeArrayList.add(tische);
    }

    public void removeTische(Tische tische){
        switch(tische.getMoebelart().toString()){
            case "Kuechentisch":
                this.anzahlKuechentisch--;
                break;
            case "Couchtisch":
                this.anzahlCouchtisch--;
                break;
            case "Buerotisch":
                this.anzahlBuerotisch--;
                break;
            case "Esstisch":
                this.anzahlEsstisch--;
                break;
        }
        tischeArrayList.remove(tische);
    }

    public boolean removeTische(Tische tische, Tische.Hoehe hoehe){
        switch(tische.getMoebelart().toString()){
            case "Kuechentisch":
                this.anzahlKuechentisch--;
                break;
            case "Couchtisch":
                this.anzahlCouchtisch--;
                break;
            case "Buerotisch":
                this.anzahlBuerotisch--;
                break;
            case "Esstisch":
                this.anzahlEsstisch--;
                break;
        }
        for (Tische t : tischeArrayList){
            if (t.getHoehe().equals(hoehe)){
                tischeArrayList.remove(t);
                return true;
            }
        }
        return false;
    }

}

public class Moebelhaus {
    public static void main(String[] args){
        Lager lager = Lager.getInstance();

        
        Sitzmoebel a = new Sitzmoebel(Sitzmoebel.Sitzplaetze.eins);
        a.setVerkauspreis(100);
        a.setBereich(Moebelstueck.Bereich.Kueche);
        a.setMoebelart(Sitzmoebel.Moebelart.Kuechenstuhl);

        Sitzmoebel b = new Sitzmoebel(Sitzmoebel.Sitzplaetze.zwei);
        b.setVerkauspreis(100);
        b.setBereich(Moebelstueck.Bereich.Kueche);
        b.setMoebelart(Sitzmoebel.Moebelart.Kuechenstuhl);

        Sitzmoebel c = new Sitzmoebel(Sitzmoebel.Sitzplaetze.drei);
        c.setBereich(Moebelstueck.Bereich.Kueche);
        c.setMoebelart(Sitzmoebel.Moebelart.Kuechenstuhl);
        c.setVerkauspreis(100);

        // Tische d = new Tische();
        // b.setHoehe(Tische.Hoehe.A);    

        lager.addSitzmoebel(a);
        lager.addSitzmoebel(b);
        lager.addSitzmoebel(c);

        lager.removeSitzmoebel(b, Sitzmoebel.Sitzplaetze.eins);

        // lager.removeSitzmoebel(c);
        // lager.removeSitzmoebel(a);
        // lager.removeSitzmoebel(b);
    }
}
