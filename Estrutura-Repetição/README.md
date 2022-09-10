## Estruturas de Repetição

Laços de repetição, também conhecido com laços de iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas veses.
Laços de repetições são representados pelas seguintes estruturas:

* For (Para)
* While (Enquanto)
* Do While (Faça enquanto)
  
  ## For (Para)

  O comando `for` (na tradução "Para") permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informação definidas na chamada do comando.
  O comando `for` recebe como entrada uma variável contadora, a condição e o valor de incrementação.
  
  // Estrutura do controle de fluxo `for`

  >for(int carneirinho = 1; carneirinho <= 5; carneirinho++){
            System.out.println("Contando carneirinhos:  " + carneirinho);
        }
            System.out.println("Jãozinho dormiu");    

## Break e Continue

`Break` significa quebrar, parar, frear e interromper. E é isso que se faz quando o Java encontra esse comando pela frente.
`Continue`, como o nome diz, ele continua o laço. O comando break interrompe o laço, já o continue interrompe somente a iteração atual.

String carros [] = {"Fusca 1960", "Uno 2018", "Corrolla 2006", "Chevette 1984"};
        
        for(int x = 0; x <= carros.length; x++){
            if(x == 2)
            continue;
            
            System.out.println("Carro não foi escolhido para venda:  " + carros[x]);
        }

## While 

O laço `while` (tradução "enquanto") determina que enquanto uma condição for válida, o bloco de código será executada. O laço `while` testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

> `while` (expressão booleana de validação)
> // comando que será executado até que a
>  expressão de validação torne-falsa.

## Do While

O laço `do while` (tradução "faça.. enquanto"), assim como o laço while, considerando que enquanto uma determinada condição for válida o bloco do código será executado. Entretanto, do while testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida no primeiro teste o bloco será executado pelo menos uma vez.

> `do`{
>   // comando que será executado até que expressão de validação torne-se false } `while` (expressão booleana de validação);
   


