class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return 0.5 * base * altura;
    }

    public double calcularPerimetro() {
        // Perímetro de um triângulo não é diretamente calculável sem informações adicionais
        return Double.NaN;
    }
}
