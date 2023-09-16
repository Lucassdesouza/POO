import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a figura geométrica:");
            System.out.println("1. Círculo");
            System.out.println("2. Quadrado");
            System.out.println("3. Retângulo");
            System.out.println("4. Triângulo");
            System.out.println("5. Encerrar");

            int escolha = scanner.nextInt();

            if (escolha == 5) {
                System.out.println("Programa encerrado.");
                break;
            }

            switch (escolha) {
                case 1:
                    calcularCirculo(scanner);
                    break;

                case 2:
                    calcularQuadrado(scanner);
                    break;

                case 3:
                    calcularRetangulo(scanner);
                    break;

                case 4:
                    calcularTriangulo(scanner);
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }

    private static void calcularCirculo(Scanner scanner) {
        System.out.print("Digite o raio do círculo: ");
        double raioCirculo = scanner.nextDouble();
        Circulo circulo = new Circulo(raioCirculo);

        System.out.println("Escolha a operação:");
        System.out.println("1. Calcular área");
        System.out.println("2. Calcular perímetro");

        int operacaoCirculo = scanner.nextInt();
        if (operacaoCirculo == 1) {
            System.out.println("Área do círculo: " + circulo.calcularArea());
        } else if (operacaoCirculo == 2) {
            System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
        } else {
            System.out.println("Opção inválida");
        }
    }

    private static void calcularQuadrado(Scanner scanner) {
        System.out.print("Digite o lado do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();
        Quadrado quadrado = new Quadrado(ladoQuadrado);

        System.out.println("Escolha a operação:");
        System.out.println("1. Calcular área");
        System.out.println("2. Calcular perímetro");

        int operacaoQuadrado = scanner.nextInt();
        if (operacaoQuadrado == 1) {
            System.out.println("Área do quadrado: " + quadrado.calcularArea());
        } else if (operacaoQuadrado == 2) {
            System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
        } else {
            System.out.println("Opção inválida");
        }
    }

    private static void calcularRetangulo(Scanner scanner) {
        System.out.print("Digite o comprimento do retângulo: ");
        double comprimentoRetangulo = scanner.nextDouble();
        System.out.print("Digite a largura do retângulo: ");
        double larguraRetangulo = scanner.nextDouble();
        Retangulo retangulo = new Retangulo(comprimentoRetangulo, larguraRetangulo);

        System.out.println("Escolha a operação:");
        System.out.println("1. Calcular área");
        System.out.println("2. Calcular perímetro");

        int operacaoRetangulo = scanner.nextInt();
        if (operacaoRetangulo == 1) {
            System.out.println("Área do retângulo: " + retangulo.calcularArea());
        } else if (operacaoRetangulo == 2) {
            System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
        } else {
            System.out.println("Opção inválida");
        }
    }

    private static void calcularTriangulo(Scanner scanner) {
        System.out.print("Digite a base do triângulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double alturaTriangulo = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);

        System.out.println("Escolha a operação:");
        System.out.println("1. Calcular área");
        System.out.println("2. Calcular perímetro");

        int operacaoTriangulo = scanner.nextInt();
        if (operacaoTriangulo == 1) {
            System.out.println("Área do triângulo: " + triangulo.calcularArea());
        } else if (operacaoTriangulo == 2) {
            System.out.println("Perímetro do triângulo: Não pode ser calculado diretamente");
        } else {
            System.out.println("Opção inválida");
        }
    }
}
