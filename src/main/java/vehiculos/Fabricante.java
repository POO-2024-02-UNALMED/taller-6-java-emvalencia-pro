package vehiculos;
import java.util.ArrayList;
public class Fabricante {
    public static ArrayList<Fabricante> ventas = new ArrayList<Fabricante>();
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre,Pais pais){
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Pais getPais(){
        return pais;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante f = null;
        int max = 0;
        for(Fabricante e:ventas){
            int cont = 0;
            for(Fabricante i:ventas){
                if (e.getNombre() == i.getNombre()) {
                    cont++;
                }
            }
            if (cont > max) {
                max = cont;
                f = e;
            }
        }
        return f;
    }
}
