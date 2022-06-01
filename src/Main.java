import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//public class Main {

    /*public static void main(String[] args) {
        ArrayList<Objeto> paraTienda = new ArrayList<>();
        Pocion pocion1 = new Pocion(30.3, 2, "pocion vida", "vida", "dar vida", 10);
        paraTienda.add(pocion1);
        Tienda miTienda = new Tienda("Mi tienda", paraTienda);
        miTienda.mostrarDisponibles();
        System.out.println(miTienda.usuarioComprar(30.3, 1, 0));
        miTienda.usuarioVender(pocion1, 4);
        //agregar tostring a las clases
        ArrayList<Habilidad> habilidades = new ArrayList<>();
        Habilidad habilidad = new Habilidad();

    }
}*/

    public class  Main implements UtilInterface{
        static ArrayList<Habilidad> habilidades = new ArrayList<>();
        static Habilidad habilidad=new Habilidad("patada voladora","da una patada",60);
        static Habilidad habilidad2=new Habilidad("puño volador","dar un puño",30);
        static Habilidad habilidad3=new Habilidad("cachetada", "dar una chachetada",15);
        static ArrayList<String>tiposPokemon;


        public static void main(String[] args) throws InterruptedException {
            long tiempoIncicial= System.currentTimeMillis();
            //tiempoJugado(tiempoIncicial,currentTimeMillis())
            habilidades.add(habilidad);
            habilidades.add(habilidad2);
            habilidades.add(habilidad3);
            tiposPokemon=new ArrayList<>(Arrays.asList("agua","fuego","tierra","electrico","planta"));//..etc
            Main objetoMain= new Main();
            //mostrar menu. con while?==0, muestro menu, usario escoje
            //explorar= while para seguir observando
            int respuesta=1;
            Scanner scanner=new Scanner(System.in);
            while (respuesta!=0){
                objetoMain.mostrarMenu();
                System.out.println("elija una opcion ");
                respuesta=scanner.nextInt();
                if(respuesta==1){
                    int dejarExplorar=1;
                    while (dejarExplorar!=0){
                        Thread.sleep(1500);
                        System.out.println("aparecio un pokemon salvaje ");
                        System.out.println(objetoMain.crearPokemon());
                        System.out.println("quieres seguir explorando 1.si  0. no");
                        //atrapar, pelear, dejar
                        dejarExplorar=scanner.nextInt();
                    }
                }
            }


            Thread.sleep(1500);
            //tamar tiempo jugado
            objetoMain.tiempoJugado(tiempoIncicial,System.currentTimeMillis());
            System.out.println(objetoMain.crearPokemon());
            System.out.println(objetoMain.crearPokemon());
            System.out.println(objetoMain.crearPokemon());

        }

        @Override
        public void tiempoJugado(long tiempoInicial, long tiempoFinal) {
            System.out.println("has jugado "+(tiempoInicial-tiempoFinal)+" milisegundos");

            // tiempoJugado(tiempoIncicial-tiempoFinal);
           //long tiempoJugado=System.currentTimeMillis();
            return ;
        }

        @Override
        public void mostrarMenu() {
            System.out.println("1. explorar");
            System.out.println("2. entrar a tienda");
            System.out.println("3.tirar objeto");
            System.out.println("4. ver estadisticas");
            System.out.println("5. tiempo jugado ");



        }

        @Override
        public Pokemon crearPokemon() {
            Random random=new Random();

            int numTipo=random.nextInt(tiposPokemon.size());
            String tipo=sacarAleatorio(tiposPokemon);
            int tamNombre= nombreAleatorio(tipo).length;
            int nombre= random.nextInt(tamNombre);
            int hp=random.nextInt(200);
            boolean legendario =random.nextBoolean();
            String[] debilFuerte=debilFuerteAleatorio(tipo);
            int fuerza=random.nextInt(200);
            int velocidad =random.nextInt(200);
            int numHabilidad=random.nextInt(habilidades.size());
            String nombreFinal=nombreAleatorio(tipo)[nombre];
            int nivel=random.nextInt(habilidades.size());
            char genero=random.nextInt(15)< 5 ? 'f':'m'; //operador ternario

            return new Pokemon(nombreFinal,nivel,genero,tipo,sacarAleatorio(habilidades),hp,legendario,debilFuerte[0],debilFuerte[1],fuerza,velocidad);
        }

        @Override
        public <G> G sacarAleatorio(ArrayList<G> arrayList) {
            Random random=new Random();
            //int indice=random.;
           /* String[] banco= new String[4];
            switch (banco[4]){
                case "agua":
                    banco[0]="";
                    break;
                case "fuego":
                    banco[1]="";
                    break;
                case "planta":
                    banco[2]="";
                    break;
                case "tierra":
                    banco[4]="";
            }*/

            return null;
        }

        @Override
        public String[] debilFuerteAleatorio(String tipo) {
            String[] arreglo=new String[2];

            switch ( tipo){

                case "agua":
                    arreglo[0]="electrico"; //debil
                    arreglo[1]="fuego";//fuerte
                    break;
                case "fuego":
                    arreglo[0]="agua";
                    arreglo[1]="bicho";
                    break;
                case "bicho":
                    arreglo[0]="";
                    arreglo[1]="";
                case "electrico":
                    arreglo[0]="";
                    arreglo[1]="";


            }
            return new String[0];
        }

        @Override
        public String[] nombreAleatorio(String tipo) {
            String[] banco= new String[4];
            switch (banco[4]){
                case "agua":
                    banco[0]="squitle";
                    banco[1]="magicarp";
                    banco[2]="Gyarados";
                    banco[3]="seaking";

                    break;
                case "fuego":
                    banco[0]="charmander";
                    banco[1]="rapidash";
                    banco[2]="growthe";//<3
                    banco[3]="arcanine";
                    break;
                case "planta":
                    banco[0]="roselia";
                    banco[1]="Petilli";
                    banco[2]="Bellossom";
                    banco[3]="roserade";
                        break;
                case "tierra":
                    banco[0]="drilbur";
                    banco[1]="excadrill";
                    banco[2]="Sandshrew";
                    banco[3]="krokorok";
            }

            return banco;
        }





    }


