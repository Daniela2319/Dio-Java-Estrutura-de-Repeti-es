public class ExeBreakContinue {
    public static void main(String[] args) {

        // Exemplo Continue

        String carros [] = {"Fusca 1960", "Uno 2018", "Corrolla 2006", "Chevette 1984"};
        
        for(int x = 0; x <= carros.length; x++){
            if(x == 2)
            continue;
            System.out.println(" |-------------------------------------------------------------|");
            System.out.println("        Carro:  " + carros[x]);
        }

        // Exemplo Break

        String paes [] = {"Pão francês", "Pão Fubá", "Pão Integral", "Pão Branco"};

        for(int y = 1; y <= paes.length; y++){
            if(y == 3)
            break;
            System.out.println("Pãe: " + paes[y]);
        }
    }
}
