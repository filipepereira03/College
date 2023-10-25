public class Retangulo {
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double getBase() {
        return base;
    }
    
    public void setAltura(double novaAlt) {
        this.altura = novaAlt;
    }
    
    public void setBase(double novaBase) {
        this.base = novaBase;
    }
    
    public double area() {
        return (this.base * this.altura);
    }
    
    public double perimetro() {
        return (this.base * 2) + (this.altura * 2);
    }
    
}