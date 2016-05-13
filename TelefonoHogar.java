public class TelefonoHogar extends Telefono implements IHacerDevolucion{
    
    private boolean alambrico;

   
    
    public TelefonoHogar(int id, double precio, String marca, String modelo,boolean alambrico) {
        super(id, precio, marca, modelo);
    this.alambrico=alambrico;
    }
    
    public boolean isAlambrico() {
        return alambrico;
    }

    public void setAlambrico(boolean alambrico) {
        this.alambrico = alambrico;
    }

    @Override
    public void HacerDevolucion() {
              System.out.println("Hacer Devolución de un Telefono de Hogar");
  }

    @Override
    public void mostrarDatos(String nombreClase) {
        super.mostrarDatos(nombreClase); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Alambrico: "+alambrico);
    }
    
    
}
