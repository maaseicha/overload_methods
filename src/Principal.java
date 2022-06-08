public class Principal {
    public static void main(String [] args) throws Exception {
        Laptop objL = new Laptop();
        Escritorio objE = new Escritorio();
        Movil objM = new Movil();
        System.out.println("-----------------Función prender equipos-------------------");
        objL.prender("Laptop");
        objE.prender("Escritorio");
        objM.prender("Movil");
        System.out.println(' ');
        System.out.println("------------------Función apagar equipos--------------------");
        objL.apagar("Laptop");
        objE.apagar("Escritorio");
        objM.apagar("Movil");
        System.out.println(' ');
        System.out.println("-----------------Sobrecarga de metodos-----------------------");
        System.out.println("------------------Cargar Bateria Laptop--------------------");
        objL.cargarBateria(4.15,1.35,"2 horas y 31 minutos");
        System.out.println(' ');
        System.out.println("------------------Cargar Bateria Escritorio--------------------");
        System.out.println("Voltaje: "+objE.cargarBateria(4.5));
        System.out.println(' ');
        System.out.println("------------------Cargar Bateria Movil--------------------");
        objM.cargarBateria(12,4,2.20);
        System.out.println(' ');
        System.out.println("-----------------manejo de Exceptions-----------------------");
        System.out.println("Brillo Pantalla Laptop:");
        for(int i=0;;i++){
            objL.mostrarResolucion();
        }

    }
}
