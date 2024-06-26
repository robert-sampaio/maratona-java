package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        // Operadores Aritméticos
        // Soma +
        int soma = num1 + num2;
        // Subtração -
        int sub = num1 - num2;
        // Divisão /
        int div = num1 / num2;
        // Multiplicação *
        int mult = num1 * num2;
//        System.out.println(soma);
//        System.out.println(sub);
//        System.out.println(div);
//        System.out.println(mult);

        // Operadores Relacionais
        // Resto %
        int resto = 20 % 10;
        // > < >= <= !=

        // Operadores Lógicos
        // && (AND) || (OR) ! (NOT)
        int idade = 35;
        float salario = 3700F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
//        System.out.println(isDentroDaLeiMaiorQueTrinta);
//        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 700;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
//        System.out.println("Posso comprar o PlayStation 5? " + isPlaystationCompravel);

        // Operadores de Atribuição
        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 500; // 2300
        bonus *= 2; // 4600
        bonus /= 2; // 2300
        bonus %= 2; // 0
        System.out.println(bonus);

        int contador = 0;
        contador++; // contador = contador + 1;
        contador--; // contador = contador - 1;
    }
}
