public class Objeto {
    /*costo- double
    cantidad- entero
    nombre- string
    tipo- string
     */
    private double costo;
    private  int cantidad;
    private String nombre;
    private String tipo;

    public double getCosto() {
        return costo;}
    public void setCosto(double costo) {
        this.costo = costo;}

    public int getCantidad() {
        return cantidad;}
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;}

    public String getNombre() {
        return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public String getTipo() {
        return tipo;}
    public void setTipo(String tipo) {
        this.tipo = tipo;}


    public Objeto(double costo, int cantidad, String nombre, String tipo) {
        this.costo = costo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.tipo = tipo;
    }
}
