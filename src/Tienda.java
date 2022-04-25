import java.util.ArrayList;

public class Tienda {
    /*atributos:
   nombre- string
    objetos disponibles -arrays<objetos>

    metodos:
    comprar
    vender
     */

    private String nombre;
    private ArrayList<Objeto>objetosDisponibles;

    public String getNombre()
    {
        return nombre;}
    public void setNombre(String nombre)
    {
        this.nombre = nombre;}


    public ArrayList<Objeto> getObjetosDisponibles()
    {
        return objetosDisponibles;}
    public void setObjetosDisponibles(ArrayList<Objeto> objetosDisponibles)
    {
        this.objetosDisponibles = objetosDisponibles;}


    public Tienda(String nombre, ArrayList<Objeto> objetosDisponibles) {
        this.nombre = nombre;
        this.objetosDisponibles = objetosDisponibles;
    }

    public boolean usuarioComprar(double dinero, int cantidad, int indiceObjeto){
        /* validad que haya suficientes objetos del tipo requerido :
        cantidad y existe en el arreglo
        si si
        if si(validar el dinero suficiente){
        le vendo
        }else{"no le alcanza"}

        else() //exepcion de que no hay la cantidad que  pide
        se repite la pregunta


         */return false;
    }
    public boolean usuarioVender(Objeto objeto, int cantidad){
        /*inverso de comprar
        dinero infinito
        recibir objetos y dar el dinero
         */

        return false;
    }

}
