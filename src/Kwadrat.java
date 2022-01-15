public class Kwadrat extends Figura{

    double a;

    public Kwadrat(){

    }

    public Kwadrat(double a){
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    double Obwod() {
        return 4*a;
    }

    @Override
    double Pole() {
        return a*a;
    }

    @Override
    public String toString() {
        return  nazwaFigury("Kwadrat")+
                " o boku a = " + a + ". Pole wynosi: " + Pole() + ", a obwod: " + Obwod();

    }
}