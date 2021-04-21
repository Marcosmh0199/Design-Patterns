public class Persona {
    public String nombre;
    public String cedula;
    public int edad;

    public Persona(String pNombre, String pCedula, int pEdad){
        nombre = pNombre;
        cedula = pCedula;
        edad = pEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }
}