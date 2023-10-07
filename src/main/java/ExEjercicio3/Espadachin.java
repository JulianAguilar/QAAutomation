package ExEjercicio3;

public class Espadachin  extends Personaje{

    private int ataque;


    public Espadachin(int salud, int ataque){
        super(salud);
        this.ataque = ataque;
    }

    public int getAtaque() {return ataque;}

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public int entrenar() {
        System.out.println("Espadachin entrenando incrementa ataque + 10");return ataque + 10;}
}
