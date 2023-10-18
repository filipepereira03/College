public class Datas {
    private int dia;
    private int mes;
    private int ano;

    public Datas(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String mesExtenso() {
        String mesExtenso = "";
        if (mes == 1) {
            mesExtenso = "Janeiro";
        } else if (mes == 2) {
            mesExtenso = "Fevereiro";
        } else if (mes == 3) {
            mesExtenso = "Março";
        } else if (mes == 4) {
            mesExtenso = "Abril";
        } else if (mes == 5) {
            mesExtenso = "Maio";
        } else if (mes == 6) {
            mesExtenso = "Junho";
        } else if (mes == 7) {
            mesExtenso = "Julho";
        } else if (mes == 8) {
            mesExtenso = "Agosto";
        } else if (mes == 9) {
            mesExtenso = "Setembro";
        } else if (mes == 10) {
            mesExtenso = "Outubro";
        } else if (mes == 11) {
            mesExtenso = "Novembro";
        } else if (mes == 12) {
            mesExtenso = "Dezembro";
        }
        return mesExtenso;
    }

    public boolean ehAnoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            return true;
        }
        return false;
    }

    public boolean dataValida() {
        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                return false;
            } else if (mes == 2) {
                if (ehAnoBissexto() && dia > 29) {
                    return false;
                } else if (!ehAnoBissexto() && dia > 28) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public String feriadoDiaDosFinados() {
        if (mes == 11 && dia == 2) {
            return "Dia dos Finados";
        }
        return "Não é Dia dos Finados";
    }
}