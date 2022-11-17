import java.util.ArrayList;
public class Compra {
    Cliente cliente;
    Tienda tienda;
    ArrayList<Articulo> Productos=new ArrayList<Articulo>();
    float Total;

    public Compra (Cliente cliente, Tienda tienda, ArrayList<Articulo> Productos, float Total){
        this.Cliente = Cliente;
        this.Tienda = Tienda;
        this.Productos = Productos;
        this.Total = Total;
    }
    
}
