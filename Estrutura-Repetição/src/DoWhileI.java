import java.util.Scanner;

/**
 * Faça um programa que peça N número inteiros, calcule e mostre a quantidade de números pares 
 *  e a quantidades de números impares.
 * @param args
 */

public class DoWhileI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int quantiPares = 0, quantiImpares = 0, quantiNumeros;
        int count = 0;
        

        System.out.println("Quantidade de Número: ");
        quantiNumeros = scan.nextInt();
        System.out.println("-------------------------------------------------");
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            
            if(numero % 2 == 0)
            quantiPares++;


            else quantiImpares++;
            count++;

        }while(count < quantiNumeros );

        System.out.println("Quantidades numeros são: " + quantiNumeros + " unidades");

        System.out.println("Quantidades Pares são: " + quantiPares + " unidades");

        System.out.println("Quantidade Impares são: " + quantiImpares + " unidades");



        
    }
}
