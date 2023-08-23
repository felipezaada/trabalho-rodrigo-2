package Banco;

class Data {

    String dataFormatada;
    int dia;
    int mes;
    int ano;

    public String recuperarData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        dataFormatada = "Data: " + dia + "/" + mes + "/" + ano;
        return dataFormatada;
    }
}