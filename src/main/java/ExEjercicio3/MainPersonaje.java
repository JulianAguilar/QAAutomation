package ExEjercicio3;

public class MainPersonaje {

    public static void main(String[] args) {


        Espadachin espadachin = new Espadachin(10, 10);
        System.out.println("Objeto Espadachin incremento ataque..." + espadachin.entrenar());

        Torre torre = new Torre(10, 10);
        System.out.println("Objeto Torre incremento nivel..." + torre.entrenar());

        Mago mago = new Mago(10, "Magia buuu");
        System.out.println("Objeto Mago no le gusta entrenar " + mago.entrenar());
    }
}
