public class Pracownik implements PracownikI {
    public Pracownik() {
    }

    @Override
    public String toString() {
        return "Pracownik{}";
    }

    @Override
    public void wymiarEtatu(double etat) {
        System.out.println("Wymiar etatu: "+etat);
    }

    @Override
    public void wysokoscWynagrodzenia(int wynagrodzenie) {
        System.out.println("Wynagrodzenie: "+wynagrodzenie);
    }

    @Override
    public void lataDoswiadczenia(int doswiadczenie) {
        System.out.println("Lata doświadczenia: "+doswiadczenie);
    }

    @Override
    public void PrzedstawSie(String imie, String nazwisko) {

    }

    @Override
    public void PodajWiek(int wiek) {

    }
}