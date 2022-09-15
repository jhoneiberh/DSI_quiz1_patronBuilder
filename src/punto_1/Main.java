/**
 * Su grupo tiene comisionado el desarrollo de un sistema de información para la compañía de seguros
Mutual Settlement, que vende por el momento Seguro de Vida de tres (3) tipos: Standard (50 millones),
Deluxe (75 millones) y Premium (100 millones). Todos los seguros tienen: Nombre del Cliente y Precio. La
compañía de seguros cuenta con un equipo de asesores por cada tipo de Seguro de Vida, así como un
Coordinador para todos los asesores.
1. (1,0) Utilizando alguno de los Patrones vistos en clase, diseñe un proyecto NetBeans Java llamado
Punto_1 que modele de manera general, los asesores, el coordinador y la creación de lostres (3) tipos
de seguro
 */


package punto_1;

public class Main 
{
    public static void main(String[] args) 
    {
        
        Directora miDirectora = new Directora();
        
        Seguro_Standard seguroStandard = new Seguro_Standard();
        Seguro_Deluxe seguroDeluxe = new Seguro_Deluxe();
        Seguro_Premium seguroPremium = new Seguro_Premium();
        
        
        miDirectora.crerSeguro(seguroStandard);
        Seguro_de_Vida miSeguroStandard = seguroStandard.getSeguroVida();
        
        miDirectora.crerSeguro(seguroDeluxe);
        Seguro_de_Vida miSeguroDeluxe = seguroDeluxe.getSeguroVida();
        
        miDirectora.crerSeguro(seguroPremium);
        Seguro_de_Vida miSeguroPremium = seguroPremium.getSeguroVida();
        
        
        presentarSeguro(miSeguroStandard);
        presentarSeguro(miSeguroDeluxe);
        presentarSeguro(miSeguroPremium);
    }
    
    
     public static void presentarSeguro(Seguro_de_Vida seguro_vida)
    {
        System.out.println("Precio: "+seguro_vida.getPrecio());
        System.out.println(seguro_vida.getCoordinador());
        System.out.println(seguro_vida.getEquipo_asesores());
        System.out.println(seguro_vida.getNombre_cliente());
        
        
        
        System.out.println("__________________________");   
        
        System.out.println();
    }
}
