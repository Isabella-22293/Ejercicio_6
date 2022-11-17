public class Cliente {
    String Nombre;
    Carro carro;
    String NIT;
    String Telefono;

    public Cliente(String Nombre, Carro carro, String NIT, String Telefono){
        this.Nombre = Nombre;
        this.Carro = carro;
        this.NIT = NIT;
        this.Telefono = Telefono;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public Carro getCarro(){
        return this.Carro;
    }
    public void setCarro(Carro carro){
        this.Carro = Carro;
    }
    public String getNIT(){
        return this.NIT;
    }
    public void setNIT(String NIT){
        this.NIT = NIT;
    }
    public String getTelefono(){
        return this.Telefono;
    }
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }
    @Override
    public String toString(){
        return "{" +
        "Nombre ='" + getNombre() + "'" +
        ", NIT ='" + getNIT() + "'" +
        ", Telefono ='" + getTelefono() + "'" +
        "}";
    }
}
