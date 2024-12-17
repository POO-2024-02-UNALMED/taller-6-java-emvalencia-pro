package vehiculos;
public class Camioneta extends Vehiculo {
    public static int cantidad = 0;
    private Boolean volco;

    public Camioneta(String placa,int puertas,String nombre,int precio,int peso,Fabricante fabricante,Boolean volco){
        super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
        this.volco = volco;
        Camioneta.cantidad++;
    }

    public Boolean isVolco(){
        return volco;
    }

    public void setVolco(Boolean volco){
        this.volco = volco;
    }
}
