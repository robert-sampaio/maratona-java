package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;
        String mensagemDoar = "Eu vou doar R$500 pro RS";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
