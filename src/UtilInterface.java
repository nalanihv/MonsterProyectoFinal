import javax.swing.text.StringContent;
import java.io.StringBufferInputStream;
import java.util.ArrayList;

public interface UtilInterface {
    void tiempoJugado(long tiempoInicial,long tiempoFinal);
    void mostrarMenu();
    Pokemon crearPokemon();
    <G> G sacarAleatorio(ArrayList<G>arrayList);//generico
    String[]debilFuerteAleatorio(String tipo);
    String[]nombreAleatorio(String tipo);
}
