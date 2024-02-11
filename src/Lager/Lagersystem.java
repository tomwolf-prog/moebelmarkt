package Lager;

import Kategorie.Tische;
import Kategorie.Lagerung;
import Kategorie.Liegemoebel;

public class Lagersystem {
    private Buerotischlager buerotischlager;
    private Couchtischlager couchtischlager;

    //Lagerung
    private Kuechenregallager kuechenregallager;
    private Beistelltischlager beistelltischlager;  
    private Kleiderschranklager kleiderschranklager;

    //Liegemoebel
    private Doppelbettlager doppelbettlager;
    private Balkonliegelager balkonliegelager;


    public Lagersystem(){
        buerotischlager = new Buerotischlager();
        couchtischlager = new Couchtischlager();
    }

    public Buerotischlager getBuerotischlager() {
        return buerotischlager;
    }

    public void setBuerotischlager(Buerotischlager buerotischlager) {
        this.buerotischlager = buerotischlager;
    }
    
    public Couchtischlager getCouchtischlager() {
        return couchtischlager;
    }

    public void setCouchtischlager(Couchtischlager couchtischlager) {
        this.couchtischlager = couchtischlager;
    }

    public void addTisch(Tische tisch) {
        switch (tisch.getMoebelart()) {
            case Buerotisch:
                buerotischlager.addTisch(tisch);
                break;
            case Couchtisch:
                couchtischlager.addTisch(tisch);
                break;
            default:
                break;
        }
    }


    //Lagerung
    public Kuechenregallager getKuechenregallager() {
        return kuechenregallager;
    }
    public void setKuechenregallager(Kuechenregallager kuechenregallager) {
        this.kuechenregallager = kuechenregallager;
    }
    public Beistelltischlager getBeistelltischlager() {
        return beistelltischlager;
    }
    public void setBeistelltischlager(Beistelltischlager beistelltischlager) {
        this.beistelltischlager = beistelltischlager;
    }
    public Kleiderschranklager getKleiderschranklager() {
        return kleiderschranklager;
    }
    public void setKleiderschranklager(Kleiderschranklager kleiderschranklager) {
        this.kleiderschranklager = kleiderschranklager;
    }

    public void addLagerung(Lagerung lagerung) {
        switch (lagerung.getMoebelart()) {
            case Kuechenregal:
                kuechenregallager.addLagerung(lagerung);
                break;
            case Kleiderschrank:
                kleiderschranklager.addLagerung(lagerung);
                break;
            default:
                break;
        }
    }

    //Liegemoebel
    public Doppelbettlager getDoppelbettlager() {
        return doppelbettlager;
    }
    public void setDoppelbettlager(Doppelbettlager doppelbettlager) {
        this.doppelbettlager = doppelbettlager;
    }
    public Balkonliegelager getBalkonliegelager() {
        return balkonliegelager;
    }
    public void setBalkonliegelager(Balkonliegelager balkonliegelager) {
        this.balkonliegelager = balkonliegelager;
    }

    public void addLiegemoebel(Liegemoebel liegemoebel) {
        switch (liegemoebel.getMoebelart()) {
            case Doppelbett:
                doppelbettlager.addLiegemoebel(liegemoebel);
                break;
            case Balkonliege:
                balkonliegelager.addLiegemoebel(liegemoebel);
                break;
            default:
                break;
        }
    }
    
}
