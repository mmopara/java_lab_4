import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu
           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego);
           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */


        Scanner sc = new Scanner(System.in);
        int element;
        boolean sprawdzenie = true;


        String[] gry = {"lol", "cs", "fifa", "wow", "god of war", "rdr2"};
        System.out.println("Elementy tablicy to: " + Arrays.toString(gry));
        System.out.println("Wpisz numer indexu tablicy, aby wyswietlic element:");

        while(sprawdzenie) {
            try {
                element = Integer.parseInt(sc.next());
                System.out.println("Element z tym indexem to: " + gry[element]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Numer indexu jest nie prawidlowy");
                System.out.println("Wprowadz numer od  0 do " + (gry.length - 1));
            } catch (NumberFormatException e) {
                System.out.println("Błąd, wprowadzony znak nie jest cyfrą!");
                System.out.println("Wprowadz cyfre od 0 do " + (gry.length - 1));
            } // tu finally nie ma sensu, zostanie uzyte na koniec cwiczenia

        }

        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

        String slowo = null;
        try{
            System.out.println(slowo.length());
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException brak wartosci");
        }

        int wynik;
        try{
            wynik = 382/0;
            System.out.println(wynik);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException " + e.getMessage());
        }


        int[] tab = {97, 46, 69, 10, 12, 225, 26};
        System.out.println("Podaj numer indeksu: ");
        System.out.println("Ten element to: " + Arrays.toString(tab));

        try {
            element = Integer.parseInt(sc.next());
            System.out.println("Element z tym numerem : " + tab[element]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny numer indeksu");
            System.out.println("Wprowadz numer od  0 do " + (tab.length-1));
        }
        catch (NumberFormatException e) {
            System.out.println("Musisz podać cyfrę");
            System.out.println("Wprowadz cyfre od 0 do " + (tab.length-1));
        }
        catch (NullPointerException e) {
            System.out.println("Wartosc niepoprawna");
            System.out.println("Wprowadz cyfre od 0 do " + (tab.length-1));
        } finally {
            System.out.println("Koniec.");
        }

    }
}