package Kategorie;

public class Lagerung {

    public enum Flaeche{
        A(025), B(050), C(100), D(200);

        private int numFlaeche;

        Flaeche(int Flaeche){
            this.numFlaeche = Flaeche;
        }

        public  int getNumFlaeche(){
            return numFlaeche;
        }
    }

    public enum Moebelart{Kuechenregal,Beistelltisch,Kleiderschrank}

    public Lagerung(Flaeche flaeche) {
        super();
        this.flaeche = flaeche;
    }

    private Flaeche flaeche;

    public Flaeche getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(Flaeche flaeche) {
        this.flaeche = flaeche;
    }
}
