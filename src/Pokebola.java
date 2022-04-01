public class Pokebola extends Objeto{
    /*efectividad- double
    atrapar: revisar el tipo que pokebola, y el tipo de pokemon} return boolean*/
    private double efectividad;

    public Pokebola(double costo, int cantidad, String nombre, String tipo, double efectividad) {
        super(costo, cantidad, nombre, tipo);
        this.efectividad = efectividad;
    }
    /*if(pokemon ==legendario){efectividad=-40}
    hacer random del 1-1000
    if( se obtiene un nuero entre 1 y la efectividad que lo atrape y restamos pokebola)
    else(intenta otra vez hasta que se acaben las pokebolas o ya no queira intentar)
     */


}
