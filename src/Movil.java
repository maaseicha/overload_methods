public class Movil implements Dispositivos{
    int porcentaje;
    @Override
    public void mostrarResolucion() throws Exception{
        porcentaje+=1;
        if (porcentaje == 10){
            parar();
        }
        System.out.println(porcentaje);
    }
}
