public class SmartPhone extends Telefono implements IHacerDevolucion{

    
    private String SIM;
    
    public SmartPhone(int id, double precio, String marca, String modelo,String SIM) {
        super(id, precio, marca, modelo);
        this.SIM=SIM;
    }
    public String getSIM() {
        return SIM;
    }

    public void setSIM(String SIM) {
        this.SIM = SIM;
    }

    @Override
    public void HacerDevolucion() {
        System.out.println("Hacer Devolución de un SmartPhone");
    }

    @Override
    public void mostrarDatos(String nombreClase) {
        super.mostrarDatos(nombreClase); //To change body of generated methods, choose Tools | Templates.
        System.out.println("SIM: "+SIM);
    }

}
