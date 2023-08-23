package Banco;

class Conta {

    String dadosImpressão;
    Double rendimento;

    public String recuperarDadosParaImpressão(String nomeTitular, String agencia, int numero, int dia, int mes, int ano,
            double saldo) {
        Data data = new Data();
        dadosImpressão = "Nome: " + nomeTitular + "\nAgência: " + agencia + "\nNúmero: " + numero + "\nSaldo: " + saldo + "\nRendimento: " + calcularRendimento(saldo) + "\nData de abertura: " + data.recuperarData(dia, mes, ano);
        return dadosImpressão;
    }

    public Double calcularRendimento(double saldo) {
        rendimento = saldo * 0.1;
        return rendimento;
    }

    public boolean Saque(double saldo, double valor) {
        if (saldo >= valor && valor > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Deposito(double saldo, double valor) {
        if (valor > 0.0) {
            return true;
        } else {
            return false;
        }
    }
}