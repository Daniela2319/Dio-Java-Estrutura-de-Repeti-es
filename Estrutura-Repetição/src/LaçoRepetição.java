import java.util.Scanner;

public class LaçoRepetição {
    public static void main(String[] args) throws Exception {
        
        // Bloco declaração minha variável
        for(int carneirinho = 1; carneirinho <= 5; carneirinho++){
            System.out.println("Contando carneirinhos:  " + carneirinho);
        }
            System.out.println("Jãozinho dormiu");



            // Usando for para interagir sobre Array
            
            String alunos[] = {"Felipe", "Frank", "João","Valdemar"};

            for(int x = 0; x < alunos.length; x++){
                System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
     
            }


            // Desenvolvendo um gerador de tabuada.
            Scanner scan = new Scanner(System.in);

            System.out.println("Tabuada:  ");
            int tabuada = scan.nextInt();

            System.out.println("Tabuada de: " + tabuada);
            for(int i = 1; i <= 10; i++)
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));


    

    }

}
