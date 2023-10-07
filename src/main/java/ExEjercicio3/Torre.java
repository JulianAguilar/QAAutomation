package ExEjercicio3;

public class Torre extends  Personaje{

    private int nivel;

    public Torre (int salud, int nivel){
        super(salud);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public int entrenar(){
        System.out.println("El torre entrenando incrementa nivel + 1");return nivel + 1;}
}
