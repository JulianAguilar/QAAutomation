package ExEjercicio3;

public class Mago extends  Personaje{

    private String magia;


    public Mago (int salud, String magia){
        super(salud);
        this.magia = magia;
    }


    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    @Override
    public int entrenar (){
        System.out.println("Los Magos son vagos :/  ");
        return 0;
    }
}
