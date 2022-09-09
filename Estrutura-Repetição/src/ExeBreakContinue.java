public class ExeBreakContinue {
    public static void main(String[] args) {
        
        String carros [] = {"Fusca 1960", "Uno 2018", "Corrolla 2006", "Chevette 1984"};
        
        for(int x = 0; x <= carros.length; x++){
            if(x == 2)
            continue;
            System.out.println(" |-------------------------------------------------------------|");
            System.out.println("        Carro não foi escolhido para venda:  " + carros[x]);
        }
    }
}
