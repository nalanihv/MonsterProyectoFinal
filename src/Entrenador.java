import java.util.ArrayList;

public class Entrenador extends Personaje{
    
    private String region; 
    private Pokemon pokemonMascota;
    private int torneosGanados;
    ArrayList<Pokemon>pokedex;
    ArrayList<Objeto>mochila;
    private double dinero;
    /*
    region - string
    pokemonMacota - Pokemon
    torneosGanados- int
    pokedex - ArraysList<Pokemon>
    mochila - ArraysList<Objeto>
     */

    public String getRegion() {
        return region;}
    public void setRegion(String region) {
        this.region = region;}

    public Pokemon getPokemonMascota() {
        return pokemonMascota;}
    public void setPokemonMascota(Pokemon pokemonMascota) {
        this.pokemonMascota = pokemonMascota;}

    public int getTorneosGanados() {
        return torneosGanados;}
    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;}

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;}
    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;}

    public ArrayList<Objeto> getMochila() {
        return mochila;}
    public void setMochila(ArrayList<Objeto> mochila) {
        this.mochila = mochila;}

    public Entrenador(String nombre, int nivel, char genero, String region, Pokemon pokemonMascota, int torneosGanados, double dinero, ArrayList<Pokemon> pokedex, ArrayList<Objeto> mochila) {
        super(nombre, nivel, genero);
        this.region = region;
        this.pokemonMascota = pokemonMascota;
        this.torneosGanados = torneosGanados;
        this.dinero = dinero;
        this.pokedex = pokedex;
        this.mochila = mochila;
    }

    /*
hacer metodo tirar e intercambiar 
    metodos:
    pelear(abstracto implementacion):
       - escoger pokemon del pokedex
             si( su HP es superior 15) y su atributo fuerte coincide con el pokemon a pelear
                 ecoger 2 fuertes y 1 debil
                 si no tiene fuertes, poner 3 aleatorios

       -llamar al metodo pelear del pokemon
      si entrenador no puede pelear o huir_ ciclo
            darle escoger ek pokemon al entrenador
            mostras la estadisticas(hp, velocidad, ataque )

           menu para curar, aumentar ataque o velocidad
      si escoge pelear:
           llamar al metodo pelear del pokemon
      si escoge curar
           validad si hay pocion de curacion, usar
      si escoge ataque
           validad si hay pocion de ese tipo , usar
      si escoge velocidad
           validad si hay pocion de ese tipo , usar
           fin ciclo

        ganar>(metodo) el entrenador opuesto ya no tiene pokemones
                       nivel 1  >10xp  (pokemon y entrenador los dos)
                       nivel n+1> 10sp *1.5
        perder>(metodo)  yo me quedo sin pokemones

     tirar objeto :
      mostrar los elementos en mochila
      que usuario escoja cual tirar

    intercambiar:
       entrenado opuesto muestra pokedex
       escojo el pokemon que quiero
       le propongo uno de mi pokedex
       y con un random true or false acepta
          si( true)
              get y add ( mas remove)
     */
    

    
}
