/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_1;

/**
 *
 * @author jhone
 */
public class Seguro_Standard extends Builder{
     public Seguro_Standard() {
    }
    
  

    @Override
    public void asignarCoordinador() {
        this.seguro_vida.setCoordinador("Asignar Coordinador standard");
    }

    @Override
    public void asignarEquipoAsesores() {
        this.seguro_vida.setEquipo_asesores("Asignar asesores standard");
    }

    @Override
    public void asignarPrecio() {
        this.seguro_vida.setPrecio(50000000);
    }

    @Override
    public void nombre_cliente() {
        this.seguro_vida.setNombre_cliente("Asignar nombre cliente standard");
    }
    
}
