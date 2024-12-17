package vehiculos;
import java.util.ArrayList;
public class Pais {
    public static ArrayList<Pais> ventas = new ArrayList<Pais>();
    private String nombre;

    public Pais(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor(){
        Pais p = null;
        int max = 0;
        for(Pais e:ventas){
            int cont = 0;
            for(Pais i:ventas){
                if (e.getNombre() == i.getNombre()) {
                    cont++;
                }
            }
            if (cont > max) {
                max = cont;
                p = e;
            }
        }
        return p;
    }
}
