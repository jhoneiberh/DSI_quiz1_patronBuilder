package punto_1;

public abstract class Builder 
{
    protected Seguro_de_Vida seguro_vida;
    
    public Seguro_de_Vida getSeguroVida()
    {
        return this.seguro_vida;
    }
    
    public void crearSeguro() 
    {
        this.seguro_vida = new Seguro_de_Vida();
    }
    
    public abstract void nombre_cliente();
    
    
    public abstract void asignarCoordinador();
    public abstract void asignarEquipoAsesores();
    
    public abstract void asignarPrecio();
    
    
}
