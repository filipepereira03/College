 public class MainDatas {
 public static void main(String[] args) {
        Datas data = new Datas(2, 11, 2023);

        System.out.println("Mês por extenso: " + data.mesExtenso());
        System.out.println("Ano bissexto: " + data.ehAnoBissexto());
        System.out.println("Data válida: " + data.dataValida());
        System.out.println("Feriado: " + data.feriadoDiaDosFinados());
    }
}