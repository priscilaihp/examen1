public class Estacionamiento
{
    private Vehiculo[] control;
    
    public Estacionamiento()
    {
        control = new Vehiculo[150];
    }
    
    public int Entrada(Vehiculo unVehiculo)
    {
        for(int i = 0; i < control.length; i++)
        {
            if(control[i] == null)
            {
                control[i] = unVehiculo;
                return 1;
            }
        }
        return 0;
    }
    
    private int buscaVehiculo(String placasV)
    {
        for(int i = 0; i < control.length; i++)
        {
            if(control[i].dimePlacas() == placasV)
            {
                return i;
            }
        }
        return 0;
    }
    
    public float Salida(String placasVehiculo, int horaS,int minutosS)
    {
        int existe = this.buscaVehiculo(placasVehiculo);
        
        if(existe == 1)
        {
            return (control[existe].vehiculoSalida(horaS, minutosS));
        }
        return 0;
    }
}