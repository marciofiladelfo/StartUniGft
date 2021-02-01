package questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Equação do Segundo Grau");
        System.out.println("Digite os valores de A, B e C da equação.");

        System.out.print("A: ");
        float a = num.nextFloat();
        if (a <= 0){
            System.out.println("Impossível calcular");
        }else{
            System.out.print("B: ");
            float b = num.nextFloat();

            System.out.print("C: ");
            float c = num.nextFloat();

            float delta = (float) (Math.pow(b, 2) - (4*a*c));
            if(delta < 0){
                System.out.println("Impossível calcular");
            }else {
                float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println(String.format("X1 = %.5f", x1));
                System.out.println(String.format("X2 = %.5f", x2));
            }
        }
    }
}
