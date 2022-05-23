public class Pokemon extends Personaje {
    
    private String tipo; 
    private Habilidad habilidad; 
    private int hp;
    private boolean esLegendario; 
    private String debilContra;
    private String fuerteContra;
    private int fuerza;
    private int velocidad;
    /* priavate
    tipo string
    habilidad- habilidad
   hp - int
   esLegendario - boolean
   debilCoantra - string
   fuerte Contra - string
*/

    public String getTipo() {
        return tipo;}
    public void setTipo(String tipo) {
        this.tipo = tipo;}

    public int getHp() {
        return hp;}
    public void setHp(int hp) {
        this.hp = hp;}

    public boolean isEsLegendario() {
        return esLegendario;}
    public void setEsLegendario(boolean esLegendario) {
        this.esLegendario = esLegendario;}

    public String getDebilContra() {
        return debilContra;}
    public void setDebilContra(String debilContra) {
        this.debilContra = debilContra;}

    public String getFuerteContra() {
        return fuerteContra;}
    public void setFuerteContra(String fuerteContra) {
        this.fuerteContra = fuerteContra;}

    public Habilidad getHabilidad() {
        return habilidad;}
    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;}

    public int getFuerza() {
        return fuerza;}
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;}

    public int getVelocidad() {
        return velocidad;}
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;}

    public Pokemon(String nombre, int nivel, char genero, String tipo, Habilidad habilidad, int hp, boolean esLegendario, String debilContra, String fuerteContra, int fuerza, int velocidad) {
        super(nombre, nivel, genero);
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.hp = hp;
        this.esLegendario = esLegendario;
        this.debilContra = debilContra;
        this.fuerteContra = fuerteContra;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
    }


    @Override
    public boolean pelear(Pokemon pokemon) {
        return false;
    }

    /*
no hacer todavia
   pelea :
   consumi pocion o baya para ataque
    habilidad.ataqueBase +20

     si (mi pokemon es fuerte contra el pokemon opuesto)
          mas ataque de habilidad
     sino(debil)
         menos ataque de habilidad
     sino(neutral)
        normal ataque

     cuando se lanza el ataque se resta la cantidad de ataque del hp




     */

    //poner to string
}
