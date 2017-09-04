public class Vehiculo
{
    private String placas = "";
    private int hora;
    private int minutos;
    private float costo;
    
    public Vehiculo(String placasV, int horaEntrada, int minutosEntrada)
    {
        placas = placasV;
        hora = horaEntrada;
        minutos = minutosEntrada;
    }
    
    public float vehiculoSalida(int horaSalida, int minutosSalida)
    {
        costo = ((((horaSalida - hora) * 60) + (minutosSalida - minutos)) / 60) * 15;
        
        return costo;
    }
    
    public String dimePlacas()
    {
        return placas;
    }
}