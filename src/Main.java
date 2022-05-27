import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
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
}


    public class  Main implements UtilInterface{
        @Override
        public void tiempoJugado(long tiempoInicial, long tiempoFinal) {
           long tiempoJugado=System.currentTimeMillis();
            return ;
        }

        @Override
        public void mostrarMenu() {

        }

        @Override
        public Pokemon crearPokemon() {
            return null;
        }

        @Override
        public <G> G sacarAleatorio(ArrayList<G> arrayList) {
            return null;
        }

        @Override
        public String[] debilFuerteAleatorio(String tipo) {
            return new String[0];
        }

        @Override
        public String[] nombreAleatorio(String tipo) {
            return new String[0];
        }

    }


