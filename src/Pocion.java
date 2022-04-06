public class Pocion extends Objeto{
    /*efecto- string
    duracion- int
     */
    private  String efecto;
    private int duracion;

    public String getEfecto() {
        return efecto;}
    public void setEfecto(String efecto) {
        this.efecto = efecto;}


    public int getDuracion() {
        return duracion;}
    public void setDuracion(int duracion) {
        this.duracion = duracion;}

    public Pocion(double costo, int cantidad, String nombre, String tipo, String efecto, int duracion) {
        super(costo, cantidad, nombre, tipo);
        this.efecto = efecto;
        this.duracion = duracion;
    }

    //usar
      /* if(curacion){aumentar 20hp}
         if(fuerza){ aumentar ataque 20hp}
         if(velocidad){aumentar 20hp velocidad}
       */

}
