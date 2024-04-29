package academy.devdojo.maratonajava.introducao;

/*
 Prática

 Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

 Eu <nome>, morando no endereço <endereço>,
 confirmo que recebi o salário de <salario> na data <data>
 */
public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        // Criação de Variáveis
        String nome = "Robert";
        String endereco = "Rua Claúdio Milano, nº501, apt 524";
        double salario = 2500.50;
        String data = "29/04/2024";

        // Mensagem
        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", \nconfirmo que recebi o salário de R$" + salario + " na data " + data);
    }
}
