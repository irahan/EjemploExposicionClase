public class Playera extends Ropa implements IHacerDevolucion{
//private String id;
//private double precio;
//private String talla;
//private String color;
private String corte;

// se ve presente el polimorfismo
    public Playera(int id, double precio, String talla, String color,String corte) {
        super(id, precio, talla, color);//se refiere a la clase padre
        this.corte=corte;
        
    }

public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
        
    }

    // sobreescribir el metodo mostrar datos añadir nuevo comportamiento
    
 @Override
    public void mostrarDatos(String nombreClase) {
        super.mostrarDatos(nombreClase); //To change body of generated methods, choose Tools | Templates.
     System.out.println("Corte: "+corte);
    }   

    @Override
    public void HacerDevolucion() {
        System.out.println("Devolución de una Playera");    
    }

    
}  
