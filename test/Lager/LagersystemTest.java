package test.Lager;

import Lager.*;
import Moebelstueck.Moebelstueck;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
        int alterBestandS = lagersystem.getBuerotischlagerBestand(Tische.Hoehe.s);
        lagersystem.erhoeheBuerotischlagerLagerbestand(5, Tische.Hoehe.s);
        int neuerBestandS = lagersystem.getBuerotischlagerBestand(Tische.Hoehe.s);

        int alterBestandM = lagersystem.getBuerotischlagerBestand(Tische.Hoehe.m);
        lagersystem.erhoeheBuerotischlagerLagerbestand(10, Tische.Hoehe.m);
        int neuerBestandM = lagersystem.getBuerotischlagerBestand(Tische.Hoehe.m);

        int alterBestandL = lagersystem.getBuerotischlagerBestand(Tische.Hoehe.l);
        lagersystem.erhoeheBuerotischlagerLagerbestand(15, Tische.Hoehe.l);
        int neuerBestandL = lagersystem.getBuerotischlagerBestand(Tische.Hoehe.l);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
    }

    @Test
    public void teste_erhoeheCouchtischlagerLagerbestand(){        
        int alterBestandS = lagersystem.getCouchtischlagerBestand(Tische.Hoehe.s);
        lagersystem.erhoeheCouchtischlagerLagerbestand(5, Tische.Hoehe.s);
        int neuerBestandS = lagersystem.getCouchtischlagerBestand(Tische.Hoehe.s);

        int alterBestandM = lagersystem.getCouchtischlagerBestand(Tische.Hoehe.m);
        lagersystem.erhoeheCouchtischlagerLagerbestand(10, Tische.Hoehe.m);
        int neuerBestandM = lagersystem.getCouchtischlagerBestand(Tische.Hoehe.m);

        int alterBestandL = lagersystem.getCouchtischlagerBestand(Tische.Hoehe.l);
        lagersystem.erhoeheCouchtischlagerLagerbestand(15, Tische.Hoehe.l);
        int neuerBestandL = lagersystem.getCouchtischlagerBestand(Tische.Hoehe.l);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
    }

    @Test
    public void teste_erhoeheEsstischlagerLagerbestand(){        
        int alterBestandS = lagersystem.getEsstischlagerBestand(Tische.Hoehe.s);
        lagersystem.erhoeheEsstischlagerLagerbestand(5, Tische.Hoehe.s);
        int neuerBestandS = lagersystem.getEsstischlagerBestand(Tische.Hoehe.s);

        int alterBestandM = lagersystem.getEsstischlagerBestand(Tische.Hoehe.m);
        lagersystem.erhoeheEsstischlagerLagerbestand(10, Tische.Hoehe.m);
        int neuerBestandM = lagersystem.getEsstischlagerBestand(Tische.Hoehe.m);

        int alterBestandL = lagersystem.getEsstischlagerBestand(Tische.Hoehe.l);
        lagersystem.erhoeheEsstischlagerLagerbestand(15, Tische.Hoehe.l);
        int neuerBestandL = lagersystem.getEsstischlagerBestand(Tische.Hoehe.l);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
    }

    @Test
    public void teste_erhoeheKuechentischlagerLagerbestand(){        
        int alterBestandS = lagersystem.getKuechentischlagerBestand(Tische.Hoehe.s);
        lagersystem.erhoeheKuechentischlagerLagerbestand(5, Tische.Hoehe.s);
        int neuerBestandS = lagersystem.getKuechentischlagerBestand(Tische.Hoehe.s);

        int alterBestandM = lagersystem.getKuechentischlagerBestand(Tische.Hoehe.m);
        lagersystem.erhoeheKuechentischlagerLagerbestand(10, Tische.Hoehe.m);
        int neuerBestandM = lagersystem.getKuechentischlagerBestand(Tische.Hoehe.m);

        int alterBestandL = lagersystem.getKuechentischlagerBestand(Tische.Hoehe.l);
        lagersystem.erhoeheKuechentischlagerLagerbestand(15, Tische.Hoehe.l);
        int neuerBestandL = lagersystem.getKuechentischlagerBestand(Tische.Hoehe.l);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
    }

    @Test
    public void teste_erhoeheKuechenstuhllagerLagerbestand(){        
        int alterBestandS = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.eins);
        lagersystem.erhoeheKuechenstuhllagerLagerbestand(5, Sitzmoebel.Sitzplaetze.eins);
        int neuerBestandS = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.eins);

        int alterBestandM = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.zwei);
        lagersystem.erhoeheKuechenstuhllagerLagerbestand(10, Sitzmoebel.Sitzplaetze.zwei);
        int neuerBestandM = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.zwei);

        int alterBestandL = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.drei);
        lagersystem.erhoeheKuechenstuhllagerLagerbestand(15, Sitzmoebel.Sitzplaetze.drei);
        int neuerBestandL = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.drei);

        int alterBestandXL = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.vier);
        lagersystem.erhoeheKuechenstuhllagerLagerbestand(20, Sitzmoebel.Sitzplaetze.vier);
        int neuerBestandXL = lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.vier);

        Assert.assertEquals(alterBestandS + 5, neuerBestandS);
        Assert.assertEquals(alterBestandM + 10, neuerBestandM);
        Assert.assertEquals(alterBestandL + 15, neuerBestandL);
        Assert.assertEquals(alterBestandXL + 20, neuerBestandXL);
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
