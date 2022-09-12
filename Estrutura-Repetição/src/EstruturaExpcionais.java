import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class EstruturaExpcionais {
    public static void main(String[] args) {
        
        try{
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.next();

        System.out.println("Digite sua Idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite sua Altura");
        double altura = scan.nextDouble();

        
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha Altura é: " + altura + " cm");

        } catch (InputMismatchException e){
            System.out.println("O campo idade e altura precisam ser númericos");

        }


    }

        

        
    
}
