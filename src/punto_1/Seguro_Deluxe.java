package punto_1;

public class Seguro_Deluxe extends Builder
{
    public Seguro_Deluxe() 
    {
    } 

    @Override
    public void asignarCoordinador() {
        this.seguro_vida.setCoordinador("Asignar Coordinador Deluxe");
    }

    @Override
    public void asignarEquipoAsesores() {
        this.seguro_vida.setEquipo_asesores("Asignar asesores Deluxe");
    }

    @Override
    public void asignarPrecio() {
        this.seguro_vida.setPrecio(75000000);
    }

    @Override
    public void nombre_cliente() {
        this.seguro_vida.setNombre_cliente("Asignar nombre cliente Deluxe");
    }
    
}
