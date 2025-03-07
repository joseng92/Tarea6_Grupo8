
package tarea6grupo8;

/**
 *
 * @author jose_
 */
public class Deportista extends Persona{
    private String deporte;

    public Deportista(String deporte, String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String obtenerInformacion() {
        return "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + "\n" +
               "Genero: " + getGenero() + "\n" +
               "Deporte: " + getDeporte();
    }
    
    
}
