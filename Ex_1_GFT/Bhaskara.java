package Ex_1_GFT;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
      
        System.out.println("Digite o primeiro número: ");
        double A = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double B = entrada.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double C = entrada.nextDouble();
        
        double delta = Math.pow(B,2) - 4 * A * C;
        
        if(delta < 0){
            System.out.println("Impossível calcular");
            System.exit(0);
        }
        
        double divisao = 2 * A;
        
        if(divisao == 0){
            System.out.println("Impossível calcular");
            System.exit(0);
        }
        
        entrada.close();
        
        double X1 = (- B + Math.sqrt(delta)) / (divisao);
        double X2 = (- B - Math.sqrt(delta)) / (divisao);
        
          System.out.printf("X1 = %.5f\n", X1);
           System.out.printf("X2 = %.5f\n", X2);
    }
    
}
