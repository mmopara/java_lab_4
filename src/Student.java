public class Student implements StudentI {

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{}";
    }

    @Override
    public void kierunek(String kierunek) {
        System.out.println("Kierunek: "+ kierunek);
    }

    @Override
    public void indeks(int indeks) {
        System.out.println("Nr Indeksu:  "+indeks);
    }



    @Override
    public void semestr(int semestr) {
        System.out.println("Semestr: "+semestr);
    }

    @Override
    public void PrzedstawSie(String imie, String nazwisko) {

    }

    @Override
    public void PodajWiek(int wiek) {

    }
}

