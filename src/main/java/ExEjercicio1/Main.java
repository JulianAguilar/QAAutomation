package ExEjercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {


        System.out.println("---------Calculadora---------");


        System.out.println("Ingresa el primer valor para realizar la operacion  ");
        int num1 = miScanner.nextInt();

        System.out.println("Ingresa el segundo valor para realizar la operacion  ");
        int num2 = miScanner.nextInt();

        System.out.println("Ingresa el operador correspondiente a la operacion a realizar Suma + | Resta - | Multiplicacion * | Division /  ");
        String operador = miScanner.next();

        Calculadora calculadora = new Calculadora(num1, num2);


        String suma = "+";
        String resta = "-";
        String multi = "*";
        String div = "/";


        if (operador.equals(suma) ){
            System.out.println("Resultado de la suma de : " + num1 + "+" + num2 + " es: " + calculadora.suma());
            
            if (calculadora.suma() < 0){
                System.out.println("Ten cuidado, el resultado es negativo");
            }   else if (calculadora.suma() >= 0 &&  calculadora.suma() < 10000) {
                    System.out.println("Resultado dentro de los limites");
            }   else {
                System.out.println("Error, resultado muy grande");
            }

        }
            else if  (operador.equals(resta)){
                System.out.println("Resultado de resta de : " + num1 + "-" + num2 + " es: " + calculadora.resta());

                if (calculadora.resta() < 0){
                    System.out.println("Ten cuidado, el resultado es negativo");
                }   else if (calculadora.resta() >= 0 &&  calculadora.resta() < 10000) {
                    System.out.println("Resultado dentro de los limites");
                }   else {
                    System.out.println("Error, resultado muy grande");
                }

        }   else if (operador.equals(multi)) {


                System.out.println("Resultado de multiplicacion: " + num1 + "*" + num2 + " es: " + calculadora.multi());

                if (calculadora.multi() < 0){
                    System.out.println("Ten cuidado, el resultado es negativo");
                }   else if (calculadora.multi() >= 0 &&  calculadora.multi() < 10000) {
                    System.out.println("Resultado dentro de los limites");
                }   else {
                    System.out.println("Error, resultado muy grande");
                }

        }   else if (operador.equals(div)){
                System.out.println("Resultado de division: " + num1 + "/" + num2 + " es: " + calculadora.div());

                if (calculadora.div() < 0){
                    System.out.println("Ten cuidado, el resultado es negativo");
                }   else if (calculadora.div() >= 0 &&  calculadora.div() < 10000) {
                    System.out.println("Resultado dentro de los limites");
                }   else {
                    System.out.println("Error, resultado muy grande");
                }

        }   else {
            System.out.println("Operación no válida");
        }


            //Calculadora calculadora = new Calculadora(num1, num2);

        //calculadora.suma();
        // System.out.println("Resultado de la suma de : " + num1 + "+" + num2 + " es: " + calculadora.suma());

        //System.out.println("Resultado de resta de : " + num1 + "-" + num2 + " es: " + calculadora.resta());

        //System.out.println("Resultado de multiplicacion: " + num1 + "*" + num2 + " es: " + calculadora.multi());

        //System.out.println("Resultado de division: " + num1 + "/" + num2 + " es: " + calculadora.div());

            //System.out.println(i);
        }

    }
}
