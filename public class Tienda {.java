public class Tienda {
    String Nombre;
    String Dirección;
    String País;

    public Tienda(String Nombre, String Dirección, String País){
        this.Nombre=Nombre;
        this.Dirección=Dirección;
        this.País=País;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public String getDirección(){
        return this.Dirección;
    }
    public void setDirección(String Dirección){
        this.Dirección=Dirección;
    }
    public String getPaís(){
        return this.País;
    }
    public void setPaís(String País){
        this.País=País;
    }
    @Override
    public String toString(){
        return "{" +
            "Nombre='" + getNombre() + "'" +
            ", Dirección= '" + getDirección() + "'" +
            "}";
    }
}
