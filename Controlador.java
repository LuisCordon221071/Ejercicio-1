import java.util.Random;
public class Controlador{
    //Amigo
    Amigo pal = new Amigo();
    //Atributos
    private int perrera;
    private int anuncio;
    private int periodico;
    private int dinero;
    private int A;
    private int B;
    private Random rand = new Random();
    //Constructor
    public Controlador(){
        perrera = rand.nextInt(1,20);
        anuncio = rand.nextInt(1,20);
        periodico = rand.nextInt(1,20);
        dinero = pal.getDinero();
        A = dinero - 25;
        B = dinero - 125;
    }
    //Getters y setters

    /**
     * @return int return the perrera
     */
    public int getPerrera() {
        return perrera;
    }

    /**
     * @param perrera the perrera to set
     */
    public void setPerrera(int perrera) {
        this.perrera = perrera;
    }

    /**
     * @return int return the anuncio
     */
    public int getAnuncio() {
        return anuncio;
    }

    /**
     * @param anuncio the anuncio to set
     */
    public void setAnuncio(int anuncio) {
        this.anuncio = anuncio;
    }

    /**
     * @return int return the periodico
     */
    public int getPeriodico() {
        return periodico;
    }

    /**
     * @param periodico the periodico to set
     */
    public void setPeriodico(int periodico) {
        this.periodico = periodico;
    }

        /**
     * @return int return the dinero
     */
    public int getDinero() {
        return dinero;
    }

            /**
     * @return int return the A
     */
    public int getA() {
        return A;
    }

            /**
     * @return int return the B
     */
    public int getB() {
        return B;
    }

    /**
     * @param dinero the dinero to set
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
}