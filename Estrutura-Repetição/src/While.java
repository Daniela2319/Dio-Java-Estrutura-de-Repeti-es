import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;;

public class While {
    public static void main(String[] args) {


        // Exemplo de While (enquanto)
       /*  double mesada = 50.0;

        while (mesada > 0){
        Double valorDoce = valorAleatorio();

        if(valorDoce > mesada)
        valorDoce = mesada;
        System.out.println("Doce do Valor: " + valorDoce + "Adicionado no carrinho");

        mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda sua mesada em doces");*/

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.println("Nome: ");
        nome = scan.next();

        System.out.println("Idade: ");
        idade = scan.nextInt();

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            
            System.out.println("Idade: ");
            idade = scan.nextInt();
            if( nome.equals("o")) break;
        }
        
    }
    }
    /*private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}*/
