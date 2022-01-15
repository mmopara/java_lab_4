import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        Student student = new Student();
        Pracownik pracownik = new Pracownik();
        ((PracownikI) pracownik).wymiarEtatu(1.5);
        ((StudentI) student).semestr(2);
        Student student2 = new Student();
        Student student3 = new Student();
        student2.toString();
        student3.toString();


        Pracownik pracownik2 = new Pracownik();
        Pracownik pracownik3=new Pracownik();
        pracownik2.toString();
        pracownik3.toString();
        pracownik.wymiarEtatu(1);

        List<PracownikI> listaPracownikow=new ArrayList<>();

        listaPracownikow.add(pracownik);
        listaPracownikow.add(pracownik);
        listaPracownikow.add(pracownik2);
        listaPracownikow.add(pracownik3);

        for (PracownikI item:listaPracownikow
        ) {
            System.out.println(item.toString());

        }


    }
}



        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody
        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody
        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów

        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */