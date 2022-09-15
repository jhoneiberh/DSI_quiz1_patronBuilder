package punto_1;

public class Directora {

    public Directora() {
    }
    
    public void crerSeguro(Builder builder)
    {
        builder.crearSeguro();
        
        builder.asignarCoordinador();
        builder.nombre_cliente();
        builder.asignarEquipoAsesores();
        
        builder.asignarPrecio();
    }
}
