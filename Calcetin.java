public class Calcentin extends Ropa implements IHacerDevolucion{
    
      public Calcentin(int id, double precio, String talla, String color) {
        super(id, precio, talla, color);
    }
   @Override
    public void mostrarDatos(String nombreClase) {
        super.mostrarDatos(nombreClase); //To change body of generated methods, choose Tools | Templates.
    }    
   @Override
    public void HacerDevolucion() {
       System.out.println("Hacer Devolución de un Calcetin");
    }

   
}
   
