/* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */
public class Dom implements Budynek {

    private double pow;
    private String adres;
    private int value;
    private int cena;
    private int liczbaMieszkancow;
    private String rodzaj;
    private int pietra;
    private KolorEnum kolorDomu;

    public Dom() {

    }

    public Dom(double pow, String adres, int value, int liczbaMieszkancow, String rodzaj, int pietra, KolorEnum kolorDomu) {
        this.pow = pow;
        this.adres = adres;
        this.value = value;
        this.liczbaMieszkancow = liczbaMieszkancow;
        this.rodzaj = rodzaj;
        this.pietra = pietra;
        this.kolorDomu = kolorDomu;
    }


    @Override
    public String toString() {
        return "Nieruchomosc: " + "\n" +
                "powierzchnia: " + pow + "\n" +
                " adres: " + adres + "\n" +
                " liczba okien: " + value + "\n" +
                " liczba mieszkancow to: " + liczbaMieszkancow + "\n" +
                " typ budynku to: " + rodzaj + "\n" +
                " ilosc pieter: " + pietra + "\n" +
                " kolor budynku to: " + kolorDomu;
    }

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public KolorEnum getKolorDomu() {
        return kolorDomu;
    }

    public void setKolorDomu(KolorEnum kolorDomu) {
        this.kolorDomu = kolorDomu;
    }

    public void RokBudowy(int RokBudowy){
        System.out.println("Rok budowy to: " + RokBudowy);
    }

    @Override
    public double powierzchnia(double pow) {
        this.pow = pow;
        return pow;
    }

    @Override
    public int liczbaOkien(int value) {
        this.value = value;
        return value;
    }

    @Override
    public String adresBudynku(String adres) {
        this.adres = adres;
        return adres;
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolorDomu = kolor;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        this.liczbaMieszkancow = value;
    }

    @Override
    public void opis(String rodzaj, int pietra) {
        this.rodzaj = rodzaj;
        this.pietra = pietra;
    }
}