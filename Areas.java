import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Círculo
        System.out.print("Digite o raio do círculo: ");
        double raioCirculo = scanner.nextDouble();
        Circulo circulo = new Circulo(raioCirculo);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        // Quadrado
        System.out.print("Digite o lado do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();
        Quadrado quadrado = new Quadrado(ladoQuadrado);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());

        // Retângulo
        System.out.print("Digite o comprimento do retângulo: ");
        double comprimentoRetangulo = scanner.nextDouble();
        System.out.print("Digite a largura do retângulo: ");
        double larguraRetangulo = scanner.nextDouble();
        Retangulo retangulo = new Retangulo(comprimentoRetangulo, larguraRetangulo);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

        // Triângulo
        System.out.print("Digite a base do triângulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double alturaTriangulo = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());

        scanner.close();
    }
}

class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}

class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
    }
}
