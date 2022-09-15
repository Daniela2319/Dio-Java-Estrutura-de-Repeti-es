public class PraticaForI {
    
    public static void main(String[] args) {
        
         // Faça a variavel de controle varia de 1 a 100 em incrementos de 1.
        for(int i = 1; i < 11; i++)
        System.out.println("contagem: " + i);
        System.out.println("********************************************");
        // Faça a variavel de controle variar de 100 a 1 em incrementos de -1(i.e. decremento de 1)
        for(int i = 10; i >= 1; i--)
        System.out.println(" " + i);
        System.out.println("********************************************");
        // Faça a varíavel de controle variar de 7 a 77 em incrementos de 7 (conta 7 a 77, 7 em 7).
        for(int i = 7; i <= 77; i += 7)
        System.out.println("Contar em 7 e 7: " + i);
        System.out.println("********************************************");
        // Faça a varíavel de controle variar de 20 a 2 em incremento de -2 (conta 20 a 1, 2 em 2).
        for(int i = 20; i >= 2; i -= 2)
        System.out.println(i);
        System.out.println("********************************************");

        // Faça a varíavel de controle assumir a seguinte sequencia de valores: 2,5,8,11,14,17,20.
        for(int i = 2; i <= 20; i += 3)
        System.out.println(i);
        System.out.println("*******************************************");

        // Faça a varíavel assumir a seguinte sequencia de valores: 99,88,77,66,55,44,33,22,11,0
        for( int j = 99; j >= 0; j -= 11)
        System.out.println(j);
        
        
    }
}
