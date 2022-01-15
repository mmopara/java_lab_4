public class Prostokąt extends Figura{
    double a,b;

    public void Prostokat(){

    }

    public Prostokąt(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    double Obwod() {
        return 2*a+2*b;
    }

    @Override
    double Pole() {
        return a*b;
    }

    @Override
    public String toString() {
        return  nazwaFigury("Prostokat")+
                " o boku a = " + a + " i boku b = " + b + ". Pole wynosi: " + Pole() + ", a obwod: " + Obwod();
    }

}