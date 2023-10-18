public class MainTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(3.0, 3.0, 3.0); // Triângulo equilátero
        Triangulo triangulo2 = new Triangulo(3.0, 4.0, 5.0); // Triângulo retângulo

        System.out.println("Triângulo 1: Tipo - " + triangulo1.tipoTriangulo() + ", Área - " + triangulo1.calcularArea() + ", Perímetro - " + triangulo1.calcularPerimetro());
        System.out.println("Triângulo 2: Tipo - " + triangulo2.tipoTriangulo() + ", Área - " + triangulo2.calcularArea() + ", Perímetro - " + triangulo2.calcularPerimetro());
    }
}
