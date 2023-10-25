import java.lang.Math;

public class Triangulo {
    private double l1;
    private double l2;
    private double l3;
    
    public Triangulo(double l1, double l2, double l3) {
         this.l1 = l1;
         this.l2 = l2;
         this.l3 = l3;
    }
    
    public double getL1() {
        return l1;
    }
    
    public double getL2() {
        return l2;
    }
    
    public double getL3() {
        return l3;
    }
    
    public void setL1(double novoL1) {
        this.l1 = novoL1;
    }
    
    public void setL2(double novoL2) {
        this.l2 = novoL2;
    }
    
    public void setL3(double novoL3) {
        this.l3 = novoL3;
    }
    
    public double area() {
        double s = perimetro() / 2;
        return (Math.sqrt(s*(s-this.l1)*(s-this.l2)*(s-this.l3)));
    }
    
    public double perimetro() {
        return (this.l1 + this.l2 + this.l3);
    }
}
