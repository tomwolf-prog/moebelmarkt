package Lager;

import Kategorie.Sitzmoebel;
import Kategorie.Tische;
import Kategorie.Lagerung;
import Kategorie.Liegemoebel;
import Moebelstueck.Moebelstueck;

public class Lagersystem {
    //Tische
    private Buerotischlager buerotischlager;
    private Couchtischlager couchtischlager;
    private Esstischlager esstischlager;
    private Kuechentischlager kuechentischlager;

    //Sitzmoebel
    private Kuechenstuhllager kuechenstuhllager;
    private Ohrensessellager ohrensessellager;
    private Fernsehcouchlager fernsehcouchlager;

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
        esstischlager = new Esstischlager();
        kuechentischlager = new Kuechentischlager();

        kuechenregallager = new Kuechenregallager();
        beistelltischlager = new Beistelltischlager();
        kleiderschranklager = new Kleiderschranklager();

        doppelbettlager = new Doppelbettlager();
        balkonliegelager = new Balkonliegelager();
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

    public Esstischlager getEsstischlager() {return esstischlager;}

    public void setEsstischlager(Esstischlager esstischlager) {this.esstischlager = esstischlager;}

    public Kuechentischlager getKuechentischlager() {return kuechentischlager;}

    public void setKuechentischlager(Kuechentischlager kuechentischlager) {this.kuechentischlager = kuechentischlager;}



    public void addTisch(Tische tisch) {
        switch (tisch.getMoebelart()) {
            case Buerotisch:
                buerotischlager.addTisch(tisch);
                break;
            case Couchtisch:
                couchtischlager.addTisch(tisch);
                break;
            case Esstisch:
                esstischlager.addTisch(tisch);
            default:
                break;
        }
    }

    public Kuechenstuhllager getKuechenstuhllager() {
        return kuechenstuhllager;
    }

    public void setKuechenstuhllager(Kuechenstuhllager kuechenstuhllager) {
        this.kuechenstuhllager = kuechenstuhllager;
    }

    public Ohrensessellager getOhrensessel() {
        return ohrensessellager;
    }

    public void setOhrensessel(Ohrensessellager ohrensessellager) {
        this.ohrensessellager = ohrensessellager;
    }

    public Fernsehcouchlager getFernsehcouch() {
        return fernsehcouchlager;
    }

    public void setFernsehcouch(Fernsehcouchlager fernsehcouchlager) {
        this.fernsehcouchlager = fernsehcouchlager;
    }

    public void addSitzmoebel(Sitzmoebel sitzmoebel) {
        switch (sitzmoebel.getMoebelart()) {
            case Kuechenstuhl:
                kuechenstuhllager.addSitzmoebel(sitzmoebel);
                break;
            case Ohrensessel:
                ohrensessellager.addSitzmoebel(sitzmoebel);
                break;
            case Fernsehcouch:
                fernsehcouchlager.addSitzmoebel(sitzmoebel);
            default:
                break;
        }
    }


    //Lagerung
    public Kuechenregallager getKuechenregallager() {return kuechenregallager;}
    public void setKuechenregallager(Kuechenregallager kuechenregallager) {this.kuechenregallager = kuechenregallager;}
    public Beistelltischlager getBeistelltischlager() {return beistelltischlager;}
    public void setBeistelltischlager(Beistelltischlager beistelltischlager) {this.beistelltischlager = beistelltischlager;}
    public Kleiderschranklager getKleiderschranklager() {return kleiderschranklager;}
    public void setKleiderschranklager(Kleiderschranklager kleiderschranklager) {this.kleiderschranklager = kleiderschranklager;}

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
    public void removeLagerung(Lagerung.Moebelart moebelart, Lagerung.Flaeche flaeche) {
        switch (moebelart) {
            case Kuechenregal:
                kuechenregallager.removeLagerung(flaeche);
                break;
            case Kleiderschrank:
                kleiderschranklager.removeLagerung(flaeche);
                break;
            default:
                break;
        }
    }

    //Liegemoebel
    public Doppelbettlager getDoppelbettlager() {return doppelbettlager;}
    public void setDoppelbettlager(Doppelbettlager doppelbettlager) {this.doppelbettlager = doppelbettlager;}
    public Balkonliegelager getBalkonliegelager() {return balkonliegelager;}
    public void setBalkonliegelager(Balkonliegelager balkonliegelager) {this.balkonliegelager = balkonliegelager;}

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
    public void removeLiegemoebel(Liegemoebel.Moebelart moebelart, Liegemoebel.Laenge laenge) {
        switch (moebelart) {
            case Doppelbett:
                doppelbettlager.removeLiegemoebel(laenge);
                break;
            case Balkonliege:
                balkonliegelager.removeLiegemoebel(laenge);
                break;
            default:
                break;
        }
    }

    public void addMoebelstueck(Moebelstueck moebelstueck) {
        switch (moebelstueck.getKategorie()) {
            case Lagerung:
                addLagerung((Lagerung) moebelstueck);
                break;
            case Liegemoebel:
                addLiegemoebel((Liegemoebel) moebelstueck);
                break;
            case Tische:
                addTisch((Tische) moebelstueck);
                break;
            case Sitzmoebel:
                addSitzmoebel((Sitzmoebel) moebelstueck);
            default:
                break;
        }
    }

}
