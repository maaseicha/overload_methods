public interface Dispositivos {
    final int porcentaje = 0;
    public default void prender(String dispositivo){
        System.out.println("Prendiendo "+dispositivo);
    };
    public default void apagar(String dispositivo){
        System.out.println("Apagando "+dispositivo);
    };

    public default void cargarBateria(int voltaje, int tiempoCarga, double duracion){
        System.out.println("Voltaje: "+voltaje);
        System.out.println("Tiempo para cargar: "+tiempoCarga);
        System.out.println("Tiempo para descargar: "+duracion);
    };
    public default double cargarBateria(double voltaje){
        return voltaje * 10;
    };
    public default void cargarBateria(double voltaje, double tiempoCarga, String duracion){
        System.out.println("This is other method");
        System.out.println("Voltaje: "+voltaje);
        System.out.println("Tiempo para cargar: "+tiempoCarga);
        System.out.println("Tiempo para descargar: "+duracion);
    };

    public void mostrarResolucion() throws Exception;
    public default void parar() throws Exception{
        throw new Exception("Alto");
    };
}
