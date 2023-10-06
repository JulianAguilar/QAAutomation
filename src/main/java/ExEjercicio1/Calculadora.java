package ExEjercicio1;

public class Calculadora {

    private int num1;
    private int num2;


    public Calculadora( int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }


    //Metodos
    public int suma (){
        return num1 + num2;
    }

    public int resta (){
        return num1 - num2;
    }

    public int multi (){
        return num1 * num2;
    }

    public int div (){
        return num1 / num2;
    }

}
