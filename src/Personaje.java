public class Personaje {
    protected String nombre ;
    protected int nivel;
    protected char genero;
    //nombre - string protected
    //nivel- int protected
    //genero- char protected
    //constructor
    //metodos: pelear- abstracto


    public String getNombre() {
        return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public int getNivel() {
        return nivel;}
    public void setNivel(int nivel) {
        this.nivel = nivel;}

    public char getGenero() {
        return genero;}
    public void setGenero(char genero) {
        this.genero = genero;}

    public Personaje(String nombre, int nivel, char genero) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.genero = genero;
    }
}

