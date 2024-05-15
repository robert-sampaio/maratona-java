package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcólica");
        } else {
            System.out.println("Não pode comprar bebida alcólica");
        }
    }
}
