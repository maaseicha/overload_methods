public class Laptop implements Dispositivos{
    int porcentaje;
    @Override
    public void mostrarResolucion() throws Exception {
        porcentaje+=25;
        if (porcentaje >= 101){
            parar();
        }
        //Thread.sleep(1*1000);
        System.out.println(porcentaje+"%");


    }
}
