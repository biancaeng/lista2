import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) throws Exception {

        /*  // Input
        Scanner Leitor = new Scanner(System.in);
        System.out.print("Digite algo: ");
        String entrada = Leitor.nextLine(); 
        Leitor.close();
        */

        /* 
        // Questão 1
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int n1 = Leitor.nextInt(); 

        System.out.print("Digite o 2º número: ");
        int n2 = Leitor.nextInt(); 

        System.out.print("Digite o 3º número: ");
        int n3 = Leitor.nextInt(); 

        
        if(n2 > n1){
            if(n3 > n2){
                System.out.println("Verdadeiro");
            }else{
                System.out.println("Falso");
            }
        }else{
            System.out.println("Falso");
        }
        Leitor.close();*/


        // Questão 2
        /* 
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int n1 = Leitor.nextInt(); 

        System.out.print("Digite o 2º número: ");
        int n2 = Leitor.nextInt(); 

        System.out.print("Digite o 3º número: ");
        int n3 = Leitor.nextInt(); 

        if((n1%10) == (n2%10)){
            System.out.println("Verdadeiro");
        }else if((n1%10) == (n3%10)){
            System.out.println("Verdadeiro");
        }else if((n2%10) == (n3%10)){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }

        Leitor.close();
        */



        // Questão 3
        /* 
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Digite os segundos: ");
        int segundos = Leitor.nextInt(); 
        int resto = segundos % 3600;
        int totalHoras = (segundos - resto)/3600;
        System.out.print(totalHoras+":");

        int minutos = resto / 60;
        int segRestante = resto - (minutos*60);
        System.out.print(minutos+":");
        System.out.println(segRestante);
        Leitor.close();
        */




        // Questão 4
        /* 
        int contador = 0; 

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {              
                    if (i != j && i != k && j != k) {             
                        int numero = i * 100 + j * 10 + k;
                        System.out.println(numero);
                        contador++;
                    }
                }
            }
        }
        System.out.println("O número total de números de três dígitos é " + contador);
        */




        // Questão 5
        /* 
        Scanner Leitor = new Scanner(System.in);
        System.out.print("Digite um número binário: ");
        String binario = Leitor.nextLine();
        int decimal = 0;
        int potencia = 0;
        for(int i = binario.length()-1; i >= 0; i--){
            decimal += (binario.toCharArray()[i]-'0') * (Math.pow(2, potencia));
            potencia++;
        }
        System.out.println(decimal);
        Leitor.close();
        */


        // Questão 6
        /* 
        Scanner Leitor = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        int decimal = Leitor.nextInt();
        int binarioInv = 0;
        int c = 1;
        while(decimal > 1){
            binarioInv += (decimal % 2)*c;
            decimal /= 2;
            c *= 10;
        }
        binarioInv += 1*c;
        System.out.println(binarioInv);*/



        // Questão 7
        
        Scanner Leitor = new Scanner(System.in);
        System.out.print("Digite um número binário: ");
        String binario = Leitor.nextLine();
        int decimal = 0;
        int potencia = 0;
        for(int i = binario.length()-1; i >= 0; i--){
            decimal += (binario.toCharArray()[i]-'0') * (Math.pow(2, potencia));
            potencia++;
        }
        
        
        System.out.print("Digite outro número binário: ");
        String binario2 = Leitor.nextLine();
        int decimal2 = 0;
        int potencia2 = 0;
        for(int i = binario2.length()-1; i >= 0; i--){
            decimal2 += (binario2.toCharArray()[i]-'0') * (Math.pow(2, potencia2));
            potencia2++;
        }
        

        int soma = decimal + decimal2;
        int binarioInv = 0;
        int c = 1;
        while(soma > 1){
            binarioInv += (soma % 2)*c;
            soma /= 2;
            c *= 10;
        }
        binarioInv += 1*c;
        System.out.println(binarioInv);
        Leitor.close();
        
    }
}
