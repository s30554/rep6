public class StudyProgramme {


    private String nazwaKierunku;
    private String opis;
    private double czasTrwania;

    public StudyProgramme(String nazwaKierunku, String opis, double czasTrwania) {
        this.nazwaKierunku = nazwaKierunku;
        this.opis = opis;
        this.czasTrwania = czasTrwania;
    }

    public String getNazwaKierunku() {
        return nazwaKierunku;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getCzasTrwania() {
        return czasTrwania;
    }
}
