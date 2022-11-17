import java.util.ArrayList;
import java.util.Collections;
public class Carro {
    String Cliente;
    int CantidadDeProductos;
    ArrayList<Articulo> Productos=new ArrayList<Articulo>();
    float Total;
    
    public Carro(String Cliente, int CantidadDeProductos, ArrayList<Articulo>Productos, float Total){
        this.Cliente= Cliente;
        this.CantidadDeProductos = CantidadDeProductos;
        this.Productos = Productos;
        this.Total = Total;
    }
    public void AgregarArticulo(Articulo articulo){
        Total+=articulo.getPrecio();
    }
    public void ListarCarro(){
        for(int i=0; i<Productos.size(); i++){
            System.out.println(Productos.get(i).getNombre());
        }
        System.out.println("Total: "+total);
    }
    public void ListarCarroOrdenado(){
        ArrayList<Articulo> ayudante=new ArrayList<Articulo>();
        for(int i=0; i<ayudante.size(); i++){
        }
        }
        public String getCliente(){
            return this.Cliente;
        }
        public void setCliente(String Cliente){
            this.Cliente = Cliente;
        }
        public int getCantidadDeProductos(){
            return this.CantidadDeProductos;
        }
        public void setCantidadDeProductos(int CantidadDeProductos){
            this.CantidadDeProductos = CantidadDeProductos;
        }
        public ArrayList<Articulo> getProductos(){
            return this.Productos;
        }
        public void setProductos(ArrayList<Articulo> Productos){
            this.Productos = Productos;
        }
        public float getTotal(){
            return this.Total;
        }
        public void setTotal(float Total){
            this.Total = Total;
        }
        @Override
        public String ToString(){
            return "{" + 
                "Cliente ='" + getCliente() + "'" +
                ", CantidadDeProductos ='" + getCantidadDeProductos() + "'" +
                ", Productos ='" + getProductos() + "'" +
                ", Total ='" + getTotal() + "'" +
                "}";
        }
    }

