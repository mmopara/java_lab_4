public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        c) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */
        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */
        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

        Dom A = new Dom(70,"ul. Słupecka", 8,5, "dom",3,KolorEnum.NIEBIESKI);
        System.out.println(A);
        A.RokBudowy(2010);
        System.out.println();

        Dom B = new Dom();

        B.powierzchnia(42);
        B.adresBudynku("ul. Piwna 38");
        B.liczbaOkien(7);
        B.kolorDomu(KolorEnum.SZARY);
        B.opis("blok",7);
        B.liczbaMieszkancow(4);
        System.out.println(B);
        B.RokBudowy(1987);
        System.out.println();

        Budynek C = new Dom();
        C.powierzchnia(45.5);
        C.adresBudynku("ul. Srebrna 45");
        C.liczbaOkien(5);
        C.kolorDomu(KolorEnum.CZERWONY);
        C.opis("kamienica",4);
        C.liczbaMieszkancow(2);
        //System.out.println(dom);
        System.out.println();

    }
}