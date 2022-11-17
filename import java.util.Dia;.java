import java.util.Dia;
public class Articulo implements Caracteristicas{
    private String Nombre;
    private int Disponibilidad;
    private float Precio;
    private boolean Portable;
    private String Marca;

    public Articulo(String Nombre, int Disponibilidad, float Precio, boolean Portable, String Marca){
        this.Nombre = Nombre;
        this.Disponibilidad = Disponibilidad;
        this.Precio = Precio;
        this.Portable = Portable;
        this.Marca = Marca;
    }
    public String getNombre(){
        return this.Nombre = nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public int getDisponibilidad(){
        return this.Disponibilidad;
    }
    public void setDisponibilidada(int Disponibilidad){
        this.Disponibilidad = Disponibilidad;
    }
    public float getPrecio(){
        return this.Precio;
    }
    public void setPrecio(float Precio){
        this.Precio = Precio;
    }
    public boolean isPortable(){
        return this.Portable;
    }
    public boolean getPortoble(){
        return this.Portable;
    }
    public void setPortable(boolean Portable){
        this.Portable = Portable;
    }
    public String getMarca(){
        return this.Marca;
    }
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    @Override
    public String ToString() {
        return "{" +
            "Nombre='" + getNombre() + "'" +
            ", Precio='" + getPrecio() + "'" +
            ", Disponibilidad='" + getDisponibilidad() + "'" +
            ", Marca='" + getMarca() +"'" +
            ", Portable='" + isPortable() + "'" +
            ", FechaDeFabricación='" + getFechaDeFabricación() + "'" +
            "}";
    }
    @Override
    public String Llamada(){
        return "Haciendo la llamada...";
    }
    @Override
    public String Imagen(){
        return "Click para tomar fotografia...";
    }
    @Override
    public String VerVideo(){
        return "Corriendo video...";
    }
    @Override
    public String NavegarEnInternet(){
        return "Buscando en Google chrome...";
    }
    @Override
    public boolean Portable(){
        return true;
    }
    @Override
    public String VideoJuegos(){
        return "Iniciando Video Juego";
    } 
}