import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(4, 5, 6);
        Triangulo t2 = new Triangulo(3, 5, 7);
        Retangulo r1 = new Retangulo(5, 10);
        Retangulo r2 = new Retangulo(4, 7); 
        SomaObjetos so = new SomaObjetos();
        
        System.out.println(t1.area());
        System.out.println(t2.area());
        
        System.out.println(r1.perimetro());
        System.out.println(r2.perimetro());
        
        System.out.println(so.somaAreasT(t1, t2));
        System.out.println(so.somaAreasR(r1, r2));
        System.out.println(so.somaPerimetrosT(t1, t2));
        System.out.println(so.somaPerimetrosR(r1, r2));
        System.out.println(so.somaDiferentesAreas(t1, r1));
        System.out.println(so.somaDiferentesPerimetros(t1, r1));
        
    }
}