package test.Lager;

import Lager.Balkonliegelager;
import Lager.Beistelltischlager;
import Lager.Buerotischlager;
import Lager.Couchtischlager;
import Lager.Doppelbettlager;
import Lager.Esstischlager;
import Lager.Fernsehcouchlager;
import Lager.Kleiderschranklager;
import Lager.Kuechenregallager;
import Lager.Kuechenstuhllager;
import Lager.Kuechentischlager;
import Lager.Lagersystem;
import Lager.Ohrensessellager;
import Moebelstueck.Moebelstueck;

import java.util.ArrayList;

import Lager.*;

public class LagersystemTest {


    public void konstellationenBisBetragTest(){
        Lagersystem lagersystem = new Lagersystem();

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
        
        
        System.out.println(lagersystem.MoebelauswahlBisBetrag(20000));

    }
    public static void main(String[] args) {
        LagersystemTest lagersystemTest = new LagersystemTest();
        lagersystemTest.konstellationenBisBetragTest();
    }

}
