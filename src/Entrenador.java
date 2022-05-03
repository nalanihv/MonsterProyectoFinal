import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


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

     public boolean tirarObjeto(int indice){
       /* int respuesta;
        Scanner read= new Scanner(System.in);

        for (int i = 0; i <mochila.size() ; i++) {
            System.out.println(i+1 +"- "+ mochila.get(i));
        }
        System.out.println("Elija el objeto a tirar, si ya no desea tirar escriba :0");
        do {
            respuesta=1;
             respuesta= read.nextInt();
             if(respuesta!=0){
                 mochila.remove(respuesta - 1);
             }
        }while (respuesta !=0);*/
         if(indice>mochila.size()-1){
             return false;
         }else {
             mochila.remove(indice);
             return true;
         }

    }


    public boolean intercambiar(ArrayList<Pokemon> mochilaOpuesto){
     System.out.println("los objetos disponibles son: ");
        int indice=1;
        for (Pokemon pokemon:pokedexOp) {
            System.out.println(indice + " - ");
            System.out.println(pokemon);
            indice++;}
         Scanner scanner=new Scanner(System.in);
        System.out.println("Escoger pokemon :");
        int escogidoOp =scanner.nextInt()-1;
        mostrarPokedex();
        System.out.println("Escoger pokemon para intercambiar:");
        int escogidoMio =scanner.nextInt()-1;
      System.out.println("Cambio por: "+ pokedex.get(escogidoMio));
      boolean acepta= false;
      Random random=new Random();
      int valor=random.nextInt(1)+1;
      acepta=(valor==1);
      if (acepta){
          Pokemon aux=pokedex.get(escogidoMio);
          pokedex.remove(escogidoMio);
          pokedex.add(pokedexOp.get(escogidoOp));
          pokedexOp.remove(escogidoOp);
          pokedexOp.add(aux);
          return true;
      }else {
          return false;
      }
       /* boolean prob;
        int respuesta;

        Random random = new Random();

        //pokedex del otro entrenador? :
        for (int i = 0; i < pokedex.size(); i++) {
            System.out.println(pokedex.get(i));
        }
        //escoje el pokemon
        System.out.println("seleccione un pokemon");
        respuesta= read.nextInt();
        System.out.println("escoja un pokemon para intercambiar: ");
        for (int i = 0; i < pokedex.size(); i++) { //pokedex del usuario
            System.out.println(pokedex.get(i));
        }
         respuesta= read.nextInt();
            /*  y con un random true or false acepta
          si( true)
              get y add ( mas remove)
     *//*
            prob= random.nextInt(100) > 60;
            if(prob){
                pokedex.add();
              pokedex.remove();

            } else {
                System.out.println("El entrenador rechazó tu cambio");
            }*/
        //acepta=(valor==1)? true: false;
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
