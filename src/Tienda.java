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
        
        if(indiceObjeto>objetosDisponibles.size()){
            System.out.println("Error no existe ese objeto");
            return false;
        }else{
            if(objetosDisponibles.get(indiceObjeto).cantidad >=cantidad) {
                double precioTotal=cantidad*objetosDisponibles.get(indiceObjeto).costo;
                if(precioTotal>=dinero){
                    System.out.println("usted esta comprando"+cantidad+" "+objetosDisponibles.get(indiceObjeto).nombre +"por $" +precioTotal);
                   System.out.println("Su cambio es: "+(dinero-precioTotal));
                    return true;
                }else {
                    System.out.println("No le alcanza, le faltan:" + (precioTotal-dinero));
                    return false;
                }
            }else{
                System.out.println("No tenemos la cantidad solicitada");
                return false;
            }
        }
        /* validad que haya suficientes objetos del tipo requerido :
        cantidad y existe en el arreglo
        si si
        if si(validar el dinero suficiente){
        le vendo
        }else{"no le alcanza"}

        else() //exepcion de que no hay la cantidad que  pide
        se repite la pregunta


         */
    }
                                      
    public boolean usuarioVender(Objeto objeto, int cantidad){
        System.out.println(objeto.getClass());
        System.out.println("seleccione un objeto para vender");//como se selecciona?
        objeto.getNombre();
        //selecciona
        //menu o comparacion ?
        if (objeto.getClass().equals(Baya.class)){ //del cual selecciona
            System.out.println("No se puede comprar");
            return false;//sino continua, recibes los objetos y das el precio
        }
        else {
            for (Objeto elemento:objetosDisponibles) {
                if(elemento.nombre.equals(objeto.nombre)){
                    elemento.cantidad += cantidad;

                }

            }
           /* int cantidadF=objeto.getCantidad()-cantidad;
            System.out.println("cantidad:"+cantidadF);
            //objeto.getCantidad();
            
            System.out.println("precio:");
            objeto.getCosto();
            System.out.println("Vendido ");
            //.add y .remove?*/
            return false; 
        }
        //usar clase objeto
      /*clase objeto tiene:
    costo- double
    cantidad- entero
    nombre- string
    tipo- string
     */

        /*inverso de comprar
        dinero infinito
        recibir objetos y dar el dinero
        no se compra cuando el usuario quiera vendernos una baya
         */

    }
    public void mostrarDisponibles(){
        //objetos disponiblres
        System.out.println("Los objetos disponibles son: ");
        int indice=1;

        for (Objeto objeto:objetosDisponibles) {
            System.out.println(indice + " - ");//1 - pocicion vida

            System.out.println(objeto); //falta toString en objeto
            indice++;
        }

    }

}
