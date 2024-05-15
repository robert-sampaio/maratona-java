package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 = Categoria infantil
        // Idade >= 15 && idade < 18 = Categoria juvenil
        // Idade >= 18 = Categoria adulto
        int idade = 18;
        String categoria;

        if(idade < 15) {
            categoria = "Categoria Infantil";
        } else if(idade >= 15 && idade <18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
