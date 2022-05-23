import java.util.Random;

public class Pokebola extends Objeto{
    /*efectividad- double
    atrapar: revisar el tipo que pokebola, y el tipo de pokemon} return boolean*/
    private double efectividad;

    public Pokebola(double costo, int cantidad, String nombre, String tipo, double efectividad) {
        super(costo, cantidad, nombre, tipo);
        this.efectividad = efectividad;
    }


    @Override
    public boolean usar(Pokemon pokemon) {
        if(pokemon.isEsLegendario()){
            this.efectividad-=40;
        }
        Random random=new Random();
        int valor= random.nextInt(100);
        if (valor>=1 && valor<=this.efectividad){
            return true;
        }else {
            return false;
        }

    }
//agregar toString a todas las clases
    /*if(pokemon ==legendario){efectividad=-40}
    hacer random del 1-1000
    if( se obtiene un nuero entre 1 y la efectividad que lo atrape y restamos pokebola)
    else(intenta otra vez hasta que se acaben las pokebolas o ya no queira intentar)
     */


}
