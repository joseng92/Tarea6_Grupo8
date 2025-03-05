package tarea6grupo8;

/* 
Autor Cesar

*/
public class Doctor extends Persona {
    private String especialidad;
    private String hospital;

    // Constructor
    public Doctor(String nombre, int edad, String genero, String especialidad, String hospital) {
        super(nombre, edad, genero);  // Llamamos al constructor de la superclase (Persona)
        this.especialidad = especialidad;
        this.hospital = hospital;
    }

    // Métodos de acceso (Getters y Setters) para los nuevos atributos
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    // Implementación del método abstracto obtenerInformacion
    @Override
    public String obtenerInformacion() {
        return "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + "\n" +
               "Genero: " + getGenero() + "\n" +
               "Especialidad: " + especialidad + "\n" +
               "Hospital: " + hospital;
    }
}
