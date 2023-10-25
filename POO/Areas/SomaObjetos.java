public class SomaObjetos {
    public double somaAreasT(Triangulo t1, Triangulo t2) {
        return t1.area() + t2.area();
    }
    
    public double somaAreasR(Retangulo r1, Retangulo r2) {
        return r1.area() + r2.area();
    }
    
    public double somaPerimetrosT(Triangulo t1, Triangulo t2) {
        return t1.perimetro() + t2.perimetro();
    }
    
    public double somaPerimetrosR(Retangulo r1, Retangulo r2) {
        return r1.perimetro() + r2.perimetro();
    }
    
    public double somaDiferentesAreas(Triangulo t1, Retangulo r1) {
        return t1.area() + r1.area();
    }
    
    public double somaDiferentesPerimetros(Triangulo t1, Retangulo r1) {
        return t1.perimetro() + r1.perimetro();
    }
}
