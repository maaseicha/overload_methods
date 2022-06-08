public class Escritorio implements Dispositivos{
    int porcentaje;
    @Override
    public void mostrarResolucion() throws Exception{
        porcentaje+=100;
        if (porcentaje == 1000){
            parar();
        }
        System.out.println(porcentaje);
    }
}
