package ExEjercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {


        System.out.println("Soy main de calculadora");


        System.out.println("Ingresa el primer valor para realizar la operacion  ");
        int num1 = miScanner.nextInt();

        System.out.println("Ingresa el segundo valor para realizar la operacion  ");
        int num2 = miScanner.nextInt();

        System.out.println("Ingresa el operador correspondiente a la operacion a realizar Suma + | Resta - | Multiplicacion * | Division /  ");
        String operador = miScanner.next();



        Calculadora calculadora = new Calculadora(num1, num2);

        //calculadora.suma();
        System.out.println("Resultado de la suma de : " + num1 + "+" + num2 + " es: " + calculadora.suma());

        System.out.println("Resultado de resta de : " + num1 + "-" + num2 + " es: " + calculadora.resta());

        System.out.println("Resultado de multiplicacion: " + num1 + "*" + num2 + " es: " + calculadora.multi());

        System.out.println("Resultado de division: " + num1 + "/" + num2 + " es: " + calculadora.div());



            System.out.println(i);
        }

    }
}
