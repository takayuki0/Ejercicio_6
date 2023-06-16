import java.io.Serializable;

public class Amigos implements Serializable {

    private String nombre;
    private String telefono;
    private String email;
    private String fechaCumple;

    public Amigos(String nombre, String telefono, String email, String fechaCumple) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.fechaCumple = fechaCumple;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaCumple() {
        return fechaCumple;
    }

    public void setFechaCumple(String fechaCumple) {
        this.fechaCumple = fechaCumple;
    }

    @Override
    public String toString() {
        return "Amigos{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaCumple='" + fechaCumple + '\'' +
                '}';
    }
}