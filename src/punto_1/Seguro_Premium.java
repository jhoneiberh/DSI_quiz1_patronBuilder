package punto_1;

public class Seguro_Premium extends Builder{

    public Seguro_Premium() {
    }
  

    @Override
    public void asignarCoordinador() {
        this.seguro_vida.setCoordinador("Asignar Coordinador Premium");
    }

    @Override
    public void asignarEquipoAsesores() {
        this.seguro_vida.setEquipo_asesores("Asignar asesores premium");
    }

    @Override
    public void asignarPrecio() {
        this.seguro_vida.setPrecio(100000000);
    }

    @Override
    public void nombre_cliente() {
        this.seguro_vida.setNombre_cliente("Asignar nombre cliente premium");
    }
    
}
