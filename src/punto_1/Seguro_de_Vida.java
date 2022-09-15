package punto_1;

public class Seguro_de_Vida 
{
    private String nombre_cliente = "";
    private String equipo_asesores = "";
    private String coordinador;
    private int precio;

    public Seguro_de_Vida() {
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getEquipo_asesores() {
        return equipo_asesores;
    }

    public void setEquipo_asesores(String equipo_asesores) {
        this.equipo_asesores = equipo_asesores;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
}
