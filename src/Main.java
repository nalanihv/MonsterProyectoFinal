import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

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
        public static void main(String[] args) {
            long tiempoIncicial= System.currentTimeMillis();
            //tiempoJugado(tiempoIncicial,currentTimeMillis())

        }

        @Override
        public void tiempoJugado(long tiempoInicial, long tiempoFinal) {
            //long  tiempoJugado(tiempoIncicial-tiempoFinal);
           //long tiempoJugado=System.currentTimeMillis();
             System.out.println("Llevas: " + (tiempoInicial - tiempoFinal));
           
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

            System.out.println();

            return null;
        }

        @Override
        public <G> G sacarAleatorio(ArrayList<G> arrayList) {
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
            Random random = new Random();
        int indice = random.nextInt(0,arrayList.size()-1);
        return arrayList.get(indice);

            
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
             
                case "electrico":
                    arreglo[0]="tierra";
                    arreglo[1]="agua";
                    break;


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


