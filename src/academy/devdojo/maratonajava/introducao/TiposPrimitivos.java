package academy.devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 20;
        long bigNumber = 100000;
        double salaryDouble = 2000.0;
        double salaryFloat = 2500.0F;
        byte ageByte = 10;
        short ageShort = 10;
        boolean trueBol = true;
        boolean falseBol = false;
        char character = '\u0041';
        String nome = "Robert";

        System.out.println("A idade do programador é " + age);
        System.out.println(trueBol);
        System.out.println("char: " + character);
        System.out.println("Oi, meu nome é " + nome);
    }
}
