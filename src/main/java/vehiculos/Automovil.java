package vehiculos;
public class Automovil extends Vehiculo{
    public static int cantidad = 0;
    private int puestos;

    public Automovil(String placa,String nombre,int precio,int peso,Fabricante fabricante,int puestos){
        super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
        this.puestos = puestos;
        Automovil.cantidad++;
    }

    public int getPuestos(){
        return puestos;
    }

    public void setPuestos(int puestos){
        this.puestos = puestos;
    }
}
