public class Jeans extends Ropa implements IHacerDevolucion{
//private String id;
//private double precio;
//private String talla;
//private String color;
private String corte;
private char genero;

    public Jeans(int id, double precio, String talla, String color,String corte, char genero) {
        super(id, precio, talla, color);
        this.corte=corte;
        this.genero=genero;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }
    
  @Override
    public void mostrarDatos(String nombreClase) {
        super.mostrarDatos(nombreClase); //To change body of generated methods, choose Tools | Templates.
      System.out.println("Corte: "+corte);
      System.out.println("Genero: "+genero);
    }  
    
   @Override
    public void HacerDevolucion() {
        System.out.println("Hacer Devolucion de un Jeans");
    }

    
}   
