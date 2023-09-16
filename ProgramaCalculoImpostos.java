public class ProgramaCalculoImpostos {
    public static void main(String[] args) {
        OperacaoComercial operacao = new OperacaoComercial("Venda de produto", 100.0);

        double iss = ISS.calcular(operacao);
        double icms = ICMS.calcular(operacao);
        double ipi = IPI.calcular(operacao);

        System.out.println("Descrição da operação: " + operacao.getDescricao());
        System.out.println("Valor original: R$" + operacao.getValor());
        System.out.println("ISS: R$" + iss);
        System.out.println("ICMS: R$" + icms);
        System.out.println("IPI: R$" + ipi);

        double total = operacao.getValor() + iss + icms + ipi;
        System.out.println("Valor total com impostos e taxas: R$" + total);
    }
}

class ICMS {
    private static final double ALIQUOTA = 0.17;

    public static double calcular(OperacaoComercial operacao) {
        if (operacao.getDescricao().toLowerCase().contains("produto") || operacao.getDescricao().toLowerCase().contains("serviço")) {
            return operacao.getValor() * ALIQUOTA;
        } else {
            return 0;
        }
    }
}

class IPI {
    private static final double ALIQUOTA = 0.25;

    public static double calcular(OperacaoComercial operacao) {
        if (operacao.getDescricao().toLowerCase().contains("produto")) {
            return operacao.getValor() * ALIQUOTA;
        } else {
            return 0;
        }
    }
}

class ISS {
    private static final double ALIQUOTA = 0.046;

    public static double calcular(OperacaoComercial operacao) {
        if (operacao.getDescricao().toLowerCase().contains("serviço")) {
            return operacao.getValor() * ALIQUOTA;
        } else {
            return 0;
        }
    }
}

class OperacaoComercial {
    private String descricao;
    private double valor;

    public OperacaoComercial(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
