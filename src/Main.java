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

            System.out.println();

            return null;
        }

        @Override
        public <G> G sacarAleatorio(ArrayList<G> arrayList) {
            return null;
        }

        @Override
        public String[] debilFuerteAleatorio(String tipo) {
            String[] arreglo=new String[2];

            switch (arreglo[2]){
                case "agua":
                    break;
                case "fuego":
                    break;

            }
            return new String[0];
        }

        @Override
        public String[] nombreAleatorio(String tipo) {
            String[] banco= new String[4];
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
            }

            return banco;
        }





    }


