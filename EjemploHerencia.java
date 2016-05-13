public class EjemploHerencia {

    
    public static void main(String[] args) {

   Playera playera = new Playera(1,299.5,"CH","Roja","Polo");
   PlayeraPersonalizada playeraPersonalizada = new PlayeraPersonalizada(4, 230, "XL", "Azul Rey","@irahan");
   Jeans jeans = new Jeans(2,399.9,"32","Azul","Skinny",'F');
   Calcentin calcetin= new Calcentin(3,29,"M","Rojo");
   
   playera.mostrarDatos("Playera Gris");
   playeraPersonalizada.mostrarDatos("Playera de @irahan");
   jeans.mostrarDatos("Jeans de mujer");
   calcetin.mostrarDatos("Calcetines");
    
    playera.HacerDevolucion();
    jeans.HacerDevolucion();
    
    SmartPhone smartphone = new SmartPhone(5,8999,"LG","Nexus","NanoSIM");
    smartphone.mostrarDatos("Smartphone");
    smartphone.HacerDevolucion();
    }
    
}
