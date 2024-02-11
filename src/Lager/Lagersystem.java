package Lager;

import Kategorie.Tische;

public class Lagersystem {
    private Buerotischlager buerotischlager;
    private Couchtischlager couchtischlager;
    private Esstischlager esstischlager;
    private Kuechentischlager kuechentischlager;

    public Lagersystem(){
        buerotischlager = new Buerotischlager();
        couchtischlager = new Couchtischlager();
        esstischlager = new Esstischlager();
        kuechentischlager = new Kuechentischlager();
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

}
