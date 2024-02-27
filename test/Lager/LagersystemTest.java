package test.Lager;

import Lager.*;
import Moebelstueck.Moebelstueck;
import src.Kategorie.Lagerung;
import src.Kategorie.Liegemoebel;
import src.Kategorie.Sitzmoebel;
import src.Kategorie.Tische;
import src.Lager.Lager;
import src.Lager.Lagersystem;

import org.junit.Assert;
import org.junit.jupiter.api.*;
// import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.stream.Collectors;

import Lager.*;
import Kategorie.*;



public class LagersystemTest {
    private static Lagersystem lagersystem;

    @BeforeEach
    public void lagersystemErstellen(){
        lagersystem = new Lagersystem();

        lagersystem.getBuerotischlager().setPreis(19999);
        lagersystem.getCouchtischlager().setPreis(9999);
        lagersystem.getEsstischlager().setPreis(16999);
        lagersystem.getKuechentischlager().setPreis(11999);

        lagersystem.getKuechenstuhllager().setPreis(4999);
        lagersystem.getOhrensessellager().setPreis(12999);
        lagersystem.getFernsehcouchlager().setPreis(39999);

        lagersystem.getKuechenregallager().setPreis(2999);
        lagersystem.getBeistelltischlager().setPreis(4999);
        lagersystem.getKleiderschranklager().setPreis(29999);

        lagersystem.getDoppelbettlager().setPreis(31999);
        lagersystem.getBalkonliegelager().setPreis(8999);
    }


    @Test
    public void teste_getPreis_mit_Rabatt_abrunden(){
        lagersystem.getCouchtischlager().setPreis(99_99);
        lagersystem.getCouchtischlager().setRabatt10(true);
        int preis = lagersystem.getCouchtischlager().getPreis();
        Assert.assertEquals(89_99, preis);
    }
    @Test
    public void teste_getPreis_mit_Rabatt_aufrunden(){
        lagersystem.getCouchtischlager().setPreis(99_95);
        lagersystem.getCouchtischlager().setRabatt10(true);
        int preis = lagersystem.getCouchtischlager().getPreis();
        Assert.assertEquals(89_96, preis);
    }


    @ParameterizedTest
    @ValueSource(ints = {99_99, 100_00, 100_01, 150_00, 400_00, 599_99, 600_00, 600_01})
    public void teste_moebelauswahlBisBetrag_dass_nur_100_bis_600_Euro_Moeglich(int betragInCent){
        if(betragInCent == 99_99 || betragInCent == 600_01){
            ArrayList<Lager<? extends Moebelstueck>> konstellation = lagersystem.moebelauswahlBisBetrag(betragInCent);
            Assert.assertNull(konstellation); //vllt mal auf Exception testen?
        } else {
            ArrayList<Lager<? extends Moebelstueck>> konstellation = lagersystem.moebelauswahlBisBetrag(betragInCent);
            Assert.assertNotNull(konstellation);
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {100_00, 100_01, 150_00, 400_00, 599_99, 600_00})
    public void teste_moebelauswahlBisBetrag_dass_nicht_ueber_hoechstbetrag(int betragInCent){
        ArrayList<Lager<? extends Moebelstueck>> konstellation = lagersystem.moebelauswahlBisBetrag(betragInCent);
        int summe = 0;
        for(Lager<? extends Moebelstueck> l: konstellation){
            summe += l.getPreis();
        }
        Assert.assertTrue(summe <= betragInCent);
    }
    
    @ParameterizedTest
    @ValueSource(ints = {100_00, 100_01, 150_00, 400_00, 599_99, 600_00})
    public void teste_Konstellationserstellung_dass_keiner_ueber_hoechstbetrag(int betragInCent){
        ArrayList<Lager<? extends Moebelstueck>> lager = lagersystem.getLager();

        ArrayList<Lager<? extends Moebelstueck>> copyLager = lager.stream()
        .collect(Collectors.toCollection(ArrayList::new));

        for(Lager<? extends Moebelstueck> l: lager){
            if (l.getPreis() > betragInCent){
                copyLager.remove(l);
            }
        }
        ArrayList<Integer> konstellationIndex = new ArrayList<>();
        for (ArrayList<Lager<? extends Moebelstueck>> k : lagersystem.konstellationenBisBetrag(copyLager, betragInCent, 0, 0, konstellationIndex)){
            int summe = 0;
            for(Lager<? extends Moebelstueck> l: k){
                summe += l.getPreis();
            }
            Assert.assertTrue(summe <= betragInCent);
        }
    }

    @Test
    public void teste_erhoeheBuerotischlagerLagerbestand(){        
        int alterBestandS = 0;
        lagersystem.erhoeheBuerotischlagerLagerbestand(5, Tische.Hoehe.s);
        int neuerBestandS = lagersystem.getBuerotischlagerBestand(Tische.Hoehe.s);

        int alterBestandM = 0;
        lagersystem.erhoeheBuerotischlagerLagerbestand(10, Tische.Hoehe.m);
        int neuerBestandM = lagersystem.getBuerotischlagerBestand(Tische.Hoehe.m);

        int alterBestandL = 0;
        lagersystem.erhoeheBuerotischlagerLagerbestand(15, Tische.Hoehe.l);
        int neuerBestandL = lagersystem.getBuerotischlagerBestand(Tische.Hoehe.l);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
    }

    @Test 
    public void teste_mindereBuerotischlagerLagerbestand(){
        lagersystem.erhoeheBuerotischlagerLagerbestand(20, Tische.Hoehe.s);
        lagersystem.erhoeheBuerotischlagerLagerbestand(20, Tische.Hoehe.m);
        lagersystem.erhoeheBuerotischlagerLagerbestand(20, Tische.Hoehe.l);

        int alterBestandS = 20;
        lagersystem.mindereBuerotischlagerLagerbestand(5, Tische.Hoehe.s);
        int neuerBestandS = lagersystem.getBuerotischlagerBestand(Tische.Hoehe.s);

        int alterBestandM = 20;
        lagersystem.mindereBuerotischlagerLagerbestand(10, Tische.Hoehe.m);
        int neuerBestandM = lagersystem.getBuerotischlagerBestand(Tische.Hoehe.m);

        int alterBestandL = 20;
        lagersystem.mindereBuerotischlagerLagerbestand(15, Tische.Hoehe.l);
        int neuerBestandL = lagersystem.getBuerotischlagerBestand(Tische.Hoehe.l);

        Assert.assertEquals(alterBestandS - 5, neuerBestandS);
        Assert.assertEquals(alterBestandM - 10, neuerBestandM);
        Assert.assertEquals(alterBestandL - 15, neuerBestandL);
    }

    @Test
    public void teste_erhoeheCouchtischlagerLagerbestand(){        
        int alterBestandS = 0;
        lagersystem.erhoeheCouchtischlagerLagerbestand(5, Tische.Hoehe.s);
        int neuerBestandS = lagersystem.getCouchtischlagerBestand(Tische.Hoehe.s);

        int alterBestandM = 0;
        lagersystem.erhoeheCouchtischlagerLagerbestand(10, Tische.Hoehe.m);
        int neuerBestandM = lagersystem.getCouchtischlagerBestand(Tische.Hoehe.m);

        int alterBestandL = 0;
        lagersystem.erhoeheCouchtischlagerLagerbestand(15, Tische.Hoehe.l);
        int neuerBestandL = lagersystem.getCouchtischlagerBestand(Tische.Hoehe.l);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
    }

    @Test 
    public void teste_mindereCouchtischlagerLagerbestand(){
        lagersystem.erhoeheCouchtischlagerLagerbestand(20, Tische.Hoehe.s);
        lagersystem.erhoeheCouchtischlagerLagerbestand(20, Tische.Hoehe.m);
        lagersystem.erhoeheCouchtischlagerLagerbestand(20, Tische.Hoehe.l);

        int alterBestandS = 20;
        lagersystem.mindereCouchtischlagerLagerbestand(5, Tische.Hoehe.s);
        int neuerBestandS = lagersystem.getCouchtischlagerBestand(Tische.Hoehe.s);

        int alterBestandM = 20;
        lagersystem.mindereCouchtischlagerLagerbestand(10, Tische.Hoehe.m);
        int neuerBestandM = lagersystem.getCouchtischlagerBestand(Tische.Hoehe.m);

        int alterBestandL = 20;
        lagersystem.mindereCouchtischlagerLagerbestand(15, Tische.Hoehe.l);
        int neuerBestandL = lagersystem.getCouchtischlagerBestand(Tische.Hoehe.l);

        Assert.assertEquals(alterBestandS - 5, neuerBestandS);
        Assert.assertEquals(alterBestandM - 10, neuerBestandM);
        Assert.assertEquals(alterBestandL - 15, neuerBestandL);
    }

    @Test
    public void teste_erhoeheEsstischlagerLagerbestand(){        
        int alterBestandS = 0;
        lagersystem.erhoeheEsstischlagerLagerbestand(5, Tische.Hoehe.s);
        int neuerBestandS = lagersystem.getEsstischlagerBestand(Tische.Hoehe.s);

        int alterBestandM = 0;
        lagersystem.erhoeheEsstischlagerLagerbestand(10, Tische.Hoehe.m);
        int neuerBestandM = lagersystem.getEsstischlagerBestand(Tische.Hoehe.m);

        int alterBestandL = 0;
        lagersystem.erhoeheEsstischlagerLagerbestand(15, Tische.Hoehe.l);
        int neuerBestandL = lagersystem.getEsstischlagerBestand(Tische.Hoehe.l);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
    }

    @Test
    public void teste_mindereEsstischlagerLagerbestand(){
        lagersystem.erhoeheEsstischlagerLagerbestand(20, Tische.Hoehe.s);
        lagersystem.erhoeheEsstischlagerLagerbestand(20, Tische.Hoehe.m);
        lagersystem.erhoeheEsstischlagerLagerbestand(20, Tische.Hoehe.l);

        int alterBestandS = 20;
        lagersystem.mindereEsstischlagerLagerbestand(5, Tische.Hoehe.s);
        int neuerBestandS = lagersystem.getEsstischlagerBestand(Tische.Hoehe.s);

        int alterBestandM = 20;
        lagersystem.mindereEsstischlagerLagerbestand(10, Tische.Hoehe.m);
        int neuerBestandM = lagersystem.getEsstischlagerBestand(Tische.Hoehe.m);

        int alterBestandL = 20;
        lagersystem.mindereEsstischlagerLagerbestand(15, Tische.Hoehe.l);
        int neuerBestandL = lagersystem.getEsstischlagerBestand(Tische.Hoehe.l);

        Assert.assertEquals(alterBestandS - 5, neuerBestandS);
        Assert.assertEquals(alterBestandM - 10, neuerBestandM);
        Assert.assertEquals(alterBestandL - 15, neuerBestandL);
    }

    @Test
    public void teste_erhoeheKuechentischlagerLagerbestand(){        
        int alterBestandS = 0;
        lagersystem.erhoeheKuechentischlagerLagerbestand(5, Tische.Hoehe.s);
        int neuerBestandS = lagersystem.getKuechentischlagerBestand(Tische.Hoehe.s);

        int alterBestandM = 0;
        lagersystem.erhoeheKuechentischlagerLagerbestand(10, Tische.Hoehe.m);
        int neuerBestandM = lagersystem.getKuechentischlagerBestand(Tische.Hoehe.m);

        int alterBestandL = 0;
        lagersystem.erhoeheKuechentischlagerLagerbestand(15, Tische.Hoehe.l);
        int neuerBestandL = lagersystem.getKuechentischlagerBestand(Tische.Hoehe.l);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
    }

    @Test   
    public void teste_mindereKuechentischlagerLagerbestand(){
        lagersystem.erhoeheKuechentischlagerLagerbestand(20, Tische.Hoehe.s);
        lagersystem.erhoeheKuechentischlagerLagerbestand(20, Tische.Hoehe.m);
        lagersystem.erhoeheKuechentischlagerLagerbestand(20, Tische.Hoehe.l);

        int alterBestandS = 20;
        lagersystem.mindereKuechentischlagerLagerbestand(5, Tische.Hoehe.s);
        int neuerBestandS = lagersystem.getKuechentischlagerBestand(Tische.Hoehe.s);

        int alterBestandM = 20;
        lagersystem.mindereKuechentischlagerLagerbestand(10, Tische.Hoehe.m);
        int neuerBestandM = lagersystem.getKuechentischlagerBestand(Tische.Hoehe.m);

        int alterBestandL = 20;
        lagersystem.mindereKuechentischlagerLagerbestand(15, Tische.Hoehe.l);
        int neuerBestandL = lagersystem.getKuechentischlagerBestand(Tische.Hoehe.l);

        Assert.assertEquals(alterBestandS - 5, neuerBestandS);
        Assert.assertEquals(alterBestandM - 10, neuerBestandM);
        Assert.assertEquals(alterBestandL - 15, neuerBestandL);
    }

    @Test
    public void teste_erhoeheKuechenstuhllagerLagerbestand(){        
        int alterBestandS = 0;
        lagersystem.erhoeheKuechenstuhllagerLagerbestand(5, Sitzmoebel.Sitzplaetze.eins);
        int neuerBestandS = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.eins);

        int alterBestandM = 0;
        lagersystem.erhoeheKuechenstuhllagerLagerbestand(10, Sitzmoebel.Sitzplaetze.zwei);
        int neuerBestandM = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.zwei);

        int alterBestandL = 0;
        lagersystem.erhoeheKuechenstuhllagerLagerbestand(15, Sitzmoebel.Sitzplaetze.drei);
        int neuerBestandL = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.drei);

        int alterBestandXL = 0;
        lagersystem.erhoeheKuechenstuhllagerLagerbestand(20, Sitzmoebel.Sitzplaetze.vier);
        int neuerBestandXL = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.vier);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
        Assert.assertEquals(alterBestandXL + 20, neuerBestandXL);
    }

    @Test
    public void teste_mindereKuechenstuhllagerLagerbestand(){
        lagersystem.erhoeheKuechenstuhllagerLagerbestand(20, Sitzmoebel.Sitzplaetze.eins);
        lagersystem.erhoeheKuechenstuhllagerLagerbestand(20, Sitzmoebel.Sitzplaetze.zwei);
        lagersystem.erhoeheKuechenstuhllagerLagerbestand(20, Sitzmoebel.Sitzplaetze.drei);
        lagersystem.erhoeheKuechenstuhllagerLagerbestand(20, Sitzmoebel.Sitzplaetze.vier);

        int alterBestand1 = 20;
        lagersystem.mindereKuechenstuhllagerLagerbestand(5, Sitzmoebel.Sitzplaetze.eins);
        int neuerBestand1 = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.eins);

        int alterBestand2 = 20;
        lagersystem.mindereKuechenstuhllagerLagerbestand(10, Sitzmoebel.Sitzplaetze.zwei);
        int neuerBestand2 = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.zwei);

        int alterBestand3 = 20;
        lagersystem.mindereKuechenstuhllagerLagerbestand(15, Sitzmoebel.Sitzplaetze.drei);
        int neuerBestand3 = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.drei);

        int alterBestand4 = 20;
        lagersystem.mindereKuechenstuhllagerLagerbestand(20, Sitzmoebel.Sitzplaetze.vier);
        int neuerBestand4 = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.vier);
        
        Assert.assertEquals(alterBestand1 - 5, neuerBestand1);
        Assert.assertEquals(alterBestand2 - 10, neuerBestand2);
        Assert.assertEquals(alterBestand3 - 15, neuerBestand3);
        Assert.assertEquals(alterBestand4 - 20, neuerBestand4);
    }

    @Test
    public void teste_erhoeheOhrensessellagerLagerbestand(){        
        int alterBestandS = 0;
        lagersystem.erhoeheOhrensessellagerLagerbestand(5, Sitzmoebel.Sitzplaetze.eins);
        int neuerBestandS = lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.eins);

        int alterBestandM = 0;
        lagersystem.erhoeheOhrensessellagerLagerbestand(10, Sitzmoebel.Sitzplaetze.zwei);
        int neuerBestandM = lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.zwei);

        int alterBestandL = 0;
        lagersystem.erhoeheOhrensessellagerLagerbestand(15, Sitzmoebel.Sitzplaetze.drei);
        int neuerBestandL = lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.drei);

        int alterBestandXL = 0;
        lagersystem.erhoeheOhrensessellagerLagerbestand(20, Sitzmoebel.Sitzplaetze.vier);
        int neuerBestandXL = lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.vier);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
        Assert.assertEquals(alterBestandXL + 20, neuerBestandXL);
    }

    @Test
    public void teste_mindereOhrensessellagerLagerbestand(){
        lagersystem.erhoeheOhrensessellagerLagerbestand(20, Sitzmoebel.Sitzplaetze.eins);
        lagersystem.erhoeheOhrensessellagerLagerbestand(20, Sitzmoebel.Sitzplaetze.zwei);
        lagersystem.erhoeheOhrensessellagerLagerbestand(20, Sitzmoebel.Sitzplaetze.drei);
        lagersystem.erhoeheOhrensessellagerLagerbestand(20, Sitzmoebel.Sitzplaetze.vier);

        int alterBestand1 = 20;
        lagersystem.mindereOhrensessellagerLagerbestand(5, Sitzmoebel.Sitzplaetze.eins);
        int neuerBestand1 = lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.eins);

        int alterBestand2 = 20;
        lagersystem.mindereOhrensessellagerLagerbestand(10, Sitzmoebel.Sitzplaetze.zwei);
        int neuerBestand2 = lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.zwei);

        int alterBestand3 = 20;
        lagersystem.mindereOhrensessellagerLagerbestand(15, Sitzmoebel.Sitzplaetze.drei);
        int neuerBestand3 = lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.drei);

        int alterBestand4 = 20;
        lagersystem.mindereOhrensessellagerLagerbestand(20, Sitzmoebel.Sitzplaetze.vier);
        int neuerBestand4 = lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.vier);

        Assert.assertEquals(alterBestand1 - 5, neuerBestand1);
        Assert.assertEquals(alterBestand2 - 10, neuerBestand2);
        Assert.assertEquals(alterBestand3 - 15, neuerBestand3);
        Assert.assertEquals(alterBestand4 - 20, neuerBestand4);
    }

    @Test
    public void teste_erhoeheFernsehcouchlagerLagerbestand(){        
        int alterBestandS = 0;
        lagersystem.erhoeheFernsehcouchlagerLagerbestand(5, Sitzmoebel.Sitzplaetze.eins);
        int neuerBestandS = lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.eins);

        int alterBestandM = 0;
        lagersystem.erhoeheFernsehcouchlagerLagerbestand(10, Sitzmoebel.Sitzplaetze.zwei);
        int neuerBestandM = lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.zwei);

        int alterBestandL = 0;
        lagersystem.erhoeheFernsehcouchlagerLagerbestand(15, Sitzmoebel.Sitzplaetze.drei);
        int neuerBestandL = lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.drei);

        int alterBestandXL = 0;
        lagersystem.erhoeheFernsehcouchlagerLagerbestand(20, Sitzmoebel.Sitzplaetze.vier);
        int neuerBestandXL = lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.vier);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
        Assert.assertEquals(alterBestandXL + 20, neuerBestandXL);
    }

    @Test
    public void teste_mindereFernsehcouchlagerLagerbestand(){
        lagersystem.erhoeheFernsehcouchlagerLagerbestand(20, Sitzmoebel.Sitzplaetze.eins);
        lagersystem.erhoeheFernsehcouchlagerLagerbestand(20, Sitzmoebel.Sitzplaetze.zwei);
        lagersystem.erhoeheFernsehcouchlagerLagerbestand(20, Sitzmoebel.Sitzplaetze.drei);
        lagersystem.erhoeheFernsehcouchlagerLagerbestand(20, Sitzmoebel.Sitzplaetze.vier);

        int alterBestand1 = 20;
        lagersystem.mindereFernsehcouchlagerLagerbestand(5, Sitzmoebel.Sitzplaetze.eins);
        int neuerBestand1 = lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.eins);

        int alterBestand2 = 20;
        lagersystem.mindereFernsehcouchlagerLagerbestand(10, Sitzmoebel.Sitzplaetze.zwei);
        int neuerBestand2 = lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.zwei);

        int alterBestand3 = 20;
        lagersystem.mindereFernsehcouchlagerLagerbestand(15, Sitzmoebel.Sitzplaetze.drei);
        int neuerBestand3 = lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.drei);

        int alterBestand4 = 20;
        lagersystem.mindereFernsehcouchlagerLagerbestand(20, Sitzmoebel.Sitzplaetze.vier);
        int neuerBestand4 = lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.vier);

        Assert.assertEquals(alterBestand1 - 5, neuerBestand1);
        Assert.assertEquals(alterBestand2 - 10, neuerBestand2);
        Assert.assertEquals(alterBestand3 - 15, neuerBestand3);
        Assert.assertEquals(alterBestand4 - 20, neuerBestand4);
    }

    @Test
    public void teste_erhoeheKuechenregallagerLagerbestand(){        
        int alterBestandS = 0;
        lagersystem.erhoeheKuechenregallagerLagerbestand(5, Lagerung.Flaeche.s);
        int neuerBestandS = lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.s);

        int alterBestandM = 0;
        lagersystem.erhoeheKuechenregallagerLagerbestand(10, Lagerung.Flaeche.m);
        int neuerBestandM = lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.m);

        int alterBestandL = 0;
        lagersystem.erhoeheKuechenregallagerLagerbestand(15, Lagerung.Flaeche.l);
        int neuerBestandL = lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.l);

        int alterBestandXL = 0;
        lagersystem.erhoeheKuechenregallagerLagerbestand(20, Lagerung.Flaeche.xl);
        int neuerBestandXL = lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.xl);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
        Assert.assertEquals(alterBestandXL + 20, neuerBestandXL);
    }

    @Test
    public void teste_mindereKuechenregallagerLagerbestand(){
        lagersystem.erhoeheKuechenregallagerLagerbestand(20, Lagerung.Flaeche.s);
        lagersystem.erhoeheKuechenregallagerLagerbestand(20, Lagerung.Flaeche.m);
        lagersystem.erhoeheKuechenregallagerLagerbestand(20, Lagerung.Flaeche.l);
        lagersystem.erhoeheKuechenregallagerLagerbestand(20, Lagerung.Flaeche.xl);

        int alterBestandS = 20;
        lagersystem.mindereKuechenregallagerLagerbestand(5, Lagerung.Flaeche.s);
        int neuerBestandS = lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.s);

        int alterBestandM = 20;
        lagersystem.mindereKuechenregallagerLagerbestand(10, Lagerung.Flaeche.m);
        int neuerBestandM = lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.m);

        int alterBestandL = 20;
        lagersystem.mindereKuechenregallagerLagerbestand(15, Lagerung.Flaeche.l);
        int neuerBestandL = lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.l);

        int alterBestandXL = 20;
        lagersystem.mindereKuechenregallagerLagerbestand(20, Lagerung.Flaeche.xl);
        int neuerBestandXL = lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.xl);


        Assert.assertEquals(alterBestandS - 5, neuerBestandS);
        Assert.assertEquals(alterBestandM - 10, neuerBestandM);
        Assert.assertEquals(alterBestandL - 15, neuerBestandL);
        Assert.assertEquals(alterBestandXL - 20, neuerBestandXL);
    }

    @Test
    public void teste_erhoeheBeistelltischlagerLagerbestand(){        
        int alterBestandS = 0;
        lagersystem.erhoeheBeistelltischlagerLagerbestand(5, Lagerung.Flaeche.s);
        int neuerBestandS = lagersystem.getBeistelltischlagerBestand(Lagerung.Flaeche.s);

        int alterBestandM = 0;
        lagersystem.erhoeheBeistelltischlagerLagerbestand(10, Lagerung.Flaeche.m);
        int neuerBestandM = lagersystem.getBeistelltischlagerBestand(Lagerung.Flaeche.m);

        int alterBestandL = 0;
        lagersystem.erhoeheBeistelltischlagerLagerbestand(15, Lagerung.Flaeche.l);
        int neuerBestandL = lagersystem.getBeistelltischlagerBestand(Lagerung.Flaeche.l);

        int alterBestandXL = 0;
        lagersystem.erhoeheBeistelltischlagerLagerbestand(20, Lagerung.Flaeche.xl);
        int neuerBestandXL = lagersystem.getBeistelltischlagerBestand(Lagerung.Flaeche.xl);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
        Assert.assertEquals(alterBestandXL + 20, neuerBestandXL);
    }

    @Test
    public void teste_mindereBeistelltischlagerLagerbestand(){
        lagersystem.erhoeheBeistelltischlagerLagerbestand(20, Lagerung.Flaeche.s);
        lagersystem.erhoeheBeistelltischlagerLagerbestand(20, Lagerung.Flaeche.m);
        lagersystem.erhoeheBeistelltischlagerLagerbestand(20, Lagerung.Flaeche.l);
        lagersystem.erhoeheBeistelltischlagerLagerbestand(20, Lagerung.Flaeche.xl);

        int alterBestandS = 20;
        lagersystem.mindereBeistelltischlagerLagerbestand(5, Lagerung.Flaeche.s);
        int neuerBestandS = lagersystem.getBeistelltischlagerBestand(Lagerung.Flaeche.s);

        int alterBestandM = 20;
        lagersystem.mindereBeistelltischlagerLagerbestand(10, Lagerung.Flaeche.m);
        int neuerBestandM = lagersystem.getBeistelltischlagerBestand(Lagerung.Flaeche.m);

        int alterBestandL = 20;
        lagersystem.mindereBeistelltischlagerLagerbestand(15, Lagerung.Flaeche.l);
        int neuerBestandL = lagersystem.getBeistelltischlagerBestand(Lagerung.Flaeche.l);

        int alterBestandXL = 20;
        lagersystem.mindereBeistelltischlagerLagerbestand(20, Lagerung.Flaeche.xl);
        int neuerBestandXL = lagersystem.getBeistelltischlagerBestand(Lagerung.Flaeche.xl);

        Assert.assertEquals(alterBestandS - 5, neuerBestandS);
        Assert.assertEquals(alterBestandM - 10, neuerBestandM);
        Assert.assertEquals(alterBestandL - 15, neuerBestandL);
        Assert.assertEquals(alterBestandXL - 20, neuerBestandXL);
    }

    @Test
    public void teste_erhoeheDoppelbettlager(){
        int alterBestandS = 0;
        lagersystem.erhoeheDoppelbettlagerLagerbestand(5, Liegemoebel.Laenge.s);
        int neuerBestandS = lagersystem.getDoppelbettlagerBestand(Liegemoebel.Laenge.s);

        int alterBestandM = 0;
        lagersystem.erhoeheDoppelbettlagerLagerbestand(10, Liegemoebel.Laenge.m);
        int neuerBestandM = lagersystem.getDoppelbettlagerBestand(Liegemoebel.Laenge.m);

        int alterBestandL = 0;
        lagersystem.erhoeheDoppelbettlagerLagerbestand(15, Liegemoebel.Laenge.l);
        int neuerBestandL = lagersystem.getDoppelbettlagerBestand(Liegemoebel.Laenge.l);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
    }

    @Test
    public void teste_mindereDoppelbettlager(){
        lagersystem.erhoeheDoppelbettlagerLagerbestand(20, Liegemoebel.Laenge.s);
        lagersystem.erhoeheDoppelbettlagerLagerbestand(20, Liegemoebel.Laenge.m);
        lagersystem.erhoeheDoppelbettlagerLagerbestand(20, Liegemoebel.Laenge.l);

        int alterBestandS = 20;
        lagersystem.mindereDoppelbettlagerLagerbestand(5, Liegemoebel.Laenge.s);
        int neuerBestandS = lagersystem.getDoppelbettlagerBestand(Liegemoebel.Laenge.s);

        int alterBestandM = 20;
        lagersystem.mindereDoppelbettlagerLagerbestand(10, Liegemoebel.Laenge.m);
        int neuerBestandM = lagersystem.getDoppelbettlagerBestand(Liegemoebel.Laenge.m);

        int alterBestandL = 20;
        lagersystem.mindereDoppelbettlagerLagerbestand(15, Liegemoebel.Laenge.l);
        int neuerBestandL = lagersystem.getDoppelbettlagerBestand(Liegemoebel.Laenge.l);

        Assert.assertEquals(alterBestandS - 5, neuerBestandS);
        Assert.assertEquals(alterBestandM - 10, neuerBestandM);
        Assert.assertEquals(alterBestandL - 15, neuerBestandL);
    }

    @Test
    public void teste_erhoeheBalkonliegelager(){
        int alterBestandS = 0;
        lagersystem.erhoeheBalkonliegelagerLagerbestand(5, Liegemoebel.Laenge.s);
        int neuerBestandS = lagersystem.getBalkonliegelagerBestand(Liegemoebel.Laenge.s);

        int alterBestandM = 0;
        lagersystem.erhoeheBalkonliegelagerLagerbestand(10, Liegemoebel.Laenge.m);
        int neuerBestandM = lagersystem.getBalkonliegelagerBestand(Liegemoebel.Laenge.m);

        int alterBestandL = 0;
        lagersystem.erhoeheBalkonliegelagerLagerbestand(15, Liegemoebel.Laenge.l);
        int neuerBestandL = lagersystem.getBalkonliegelagerBestand(Liegemoebel.Laenge.l);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
    }

    @Test
    public void teste_mindereBalkonliegelager(){
        lagersystem.erhoeheBalkonliegelagerLagerbestand(20, Liegemoebel.Laenge.s);
        lagersystem.erhoeheBalkonliegelagerLagerbestand(20, Liegemoebel.Laenge.m);
        lagersystem.erhoeheBalkonliegelagerLagerbestand(20, Liegemoebel.Laenge.l);

        int alterBestandS = 20;
        lagersystem.mindereBalkonliegelagerLagerbestand(5, Liegemoebel.Laenge.s);
        int neuerBestandS = lagersystem.getBalkonliegelagerBestand(Liegemoebel.Laenge.s);

        int alterBestandM = 20;
        lagersystem.mindereBalkonliegelagerLagerbestand(10, Liegemoebel.Laenge.m);
        int neuerBestandM = lagersystem.getBalkonliegelagerBestand(Liegemoebel.Laenge.m);

        int alterBestandL = 20;
        lagersystem.mindereBalkonliegelagerLagerbestand(15, Liegemoebel.Laenge.l);
        int neuerBestandL = lagersystem.getBalkonliegelagerBestand(Liegemoebel.Laenge.l);

        Assert.assertEquals(alterBestandS - 5, neuerBestandS);
        Assert.assertEquals(alterBestandM - 10, neuerBestandM);
        Assert.assertEquals(alterBestandL - 15, neuerBestandL);
    }



    




    // @Test
    // public void testBerechenVerkaufspreisAllerMoebelImLager() {
    //     for(Lager<? extends Moebelstueck> l: lagersystem.getLager()){
    //         l.setPreis(100);
    //     }
    
    //     // Calculate the expected result
    //     int expectedSumme = (100 * 2) + 200;
    
    //     // Call the method and assert the result
    //     int actualSumme = lagersystem.berechenVerkaufspreisAllerMoebelImLager();
    //     assertEquals(expectedSumme, actualSumme);
    // }

}
