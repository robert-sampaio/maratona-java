package academy.devdojo.maratonajava.introducao;

public class Ex01EstruturaCondicionais {
    public static void main(String[] args) {
        // 0 - 34712 = 9.70%
        // 34713 - 68507 = 37.35%
        // 68508 = 49.50%
        double salario = 38000;
        double taxa;

        if(salario >= 0 && salario <=34712) {
            taxa = 9.70;
        } else if (salario >= 34713 && salario <= 68507) {
            taxa = 37.35;
        } else {
            taxa = 49.50;
        }

        System.out.println("Tendo um salário anual de " + salario + " euros.\nVocê deverá pagar uma taxa de " + taxa + "%!");
    }
}
