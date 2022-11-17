import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Objetos
        Cliente cliente=new Cliente(null, null, null, null);
        Carro carro=new Carro(null, 0, null, 0);
        Tienda tienda=new Tienda(null, null, null);
        Scanner keyboard=new Scanner(System.in);
        ArrayList<Articulo> ListaDeArticulosTemporal=new ArrayList<Articulo>();
        //Menu
            //Cliente
        String NombreDelCliente, NITdelCliente, TelefonoDelCliente;
        System.out.println("\f       ");
        System.out.println("Ingrese el nombre del Cliente ");
        NombreDelCliente = keyboard.next();
        System.out.println("Ingrese el NIT ");
        NITdelCliente = keyboard.next();
        System.out.println("Ingrese el número de telefono ");
        TelefonoDelCliente = keyboard.next();
        Cliente.setNombre(NombreDelCliente);
        Cliente.setNIT(NITdelCliente);
        Cliente.setTelefono(TelefonoDelCliente);
        //Tienda
        String NombreDeLaTienda, DirecciónDeLaTienda, PaísDondeEstaLaTienda;
        System.out.println("\f       ");
        System.out.println("Ingrese el nombre de la tienda ");
        NombreDeLaTienda = keyboard.next();
        System.out.println("Ingrese la dirección de la tienda ");
        DirecciónDeLaTienda = keyboard.next();
        System.out.println("Ingrese el país en el que se encuentra la tienda ");
        PaísDondeEstaLaTienda = keyboard.next();
        Tienda.serNombre(NombreDeLaTienda);
        Tienda.setDirección(DirecciónDeLaTienda);
        Tienda.setPaís(PaísDondeEstaLaTienda);
        Carro.setCliente(TelefonoDelCliente);
        //Compras (Menu)
        int Opcion=0;
        while(Opcion!=3){
            System.out.println("\f       ");
            System.out.println("1. Comprar Articulo");
            System.out.println("2. Ver carro de compras");
            System.out.println("3. Finalizar las compras");
            System.out.println("Ingrese la opcion con la que desea continuar   ");
            Opcion = keyboard.nextInt();
            if(Opcion==1){
                //Listado de productos
                int ElegirArticulo=0;
                Articulo articulo=new Articulo(NombreDeLaTienda, Opcion, Opcion, DirecciónDeLaTienda, false);
                System.out.println("\f           ");
                System.out.println("1. Smartphones");
                System.out.println("\r\r Llamadas, tomar fotografías, navegar por internet, reproducir videos, son portables");
                System.out.println("\f2. Telefonos celulares");
                System.out.println("\r\r Hacen llamadas, son portables");
                System.out.println("\f3. Telefonos fijos");
                System.out.println("\r\r Hacen llamadas");
                System.out.println("\f4. Camaras fotograficas");
                System.out.println("\r\r Toman fotografias, pueden reproducir videos, son portebles");
                System.out.println("\f5. Computador personal (Desktop)");
                System.out.println("\r\r Pueden navegar por internet, pueden reproducir videos, ejecutan videojuegos");
                System.out.println("\f6. Computador personal (Laptop)");
                System.out.println("\r\r Pueden navegar por internet, ejecutar videojuegos, reproducir videos, son portables");
                System.out.println("\f7. Smart TV");
                System.out.println("\r\r Pueden navegar por internet, pueden reproducir videos");
                System.out.println("\f8. Tablets");
                System.out.println("\r\r Toman fotografias, pueden navegar por internet, pueden reproducir videos, son portables");
                System.out.println("\f8. Smartwatch");
                System.out.println("\r\r Toman fotografias, son portables, hacen llamadas");
                ElegirArticulo=keyboard.nextInt();
                if(ElegirArticulo==1){
                    articulo.setNombre("Smartphone");
                    articulo.setMarca("Iphone");
                    articulo.setDisponibilidada(15);
                    articulo.setPrecio(1000);
                    articulo.setPortable(true);

                    System.out.println("Funcionalidades");
                    System.out.println(articulo.Llamada());
                    System.out.println(articulo.Fotografia());
                    System.out.println(articulo.NavegarEnInternet());
                    System.out.println(articulo.VerVideo());
                    System.out.println("Portable: "+articulo.Portable());
                    ListaDeArticulosTemporal.add(articulo);
                    Carro.AgregarArticulo(articulo);
                }else if(ElegirArticulo==2){
                    articulo.setNombre("Celular");
                    articulo.setMarca("Xiaomi");
                    articulo.setDisponibilidada(20);
                    articulo.setPrecio(800);
                    articulo.setPortable(true);

                    System.out.println("Funcionalidades");
                    System.out.println(articulo.Llamada());
                    System.out.println("Portable: "+articulo.Portable());
                    ListaDeArticulosTemporal.add(articulo);
                    Carro.AgregarArticulo(articulo);
                }else if(ElegirArticulo==3){
                    articulo.setNombre("TelefonoFijo");
                    articulo.setMarca("Nokia");
                    articulo.setDisponibilidada(20);
                    articulo.setPrecio(600);
                    articulo.setPortable(false);

                    System.out.println("Funcionalidades");
                    System.out.println(articulo.Llamada());
                    System.out.println("Portable: "+articulo.Portable());
                    ListaDeArticulosTemporal.add(articulo);
                    Carro.AgregarArticulo(articulo);
                }else if(ElegirArticulo==4){
                    articulo.setNombre("Camara Fotografica");
                    articulo.setMarca("Sony");
                    articulo.setDisponibilidada(23);
                    articulo.setPrecio(1700);
                    articulo.setPortable(true);

                    System.out.println("Funcionalidades");
                    System.out.println(articulo.Fotografia());
                    System.out.println(articulo.VerVideo());
                    System.out.println("Portable: "+articulo.Portable());
                    ListaDeArticulosTemporal.add(articulo);
                    Carro.AgregarArticulo(articulo);
                }else if(ElegirArticulo==5){
                    articulo.setNombre("Desktop");
                    articulo.setMarca("Omen");
                    articulo.setDisponibilidada(4);
                    articulo.setPrecio(15000);
                    articulo.setPortable(false);

                    System.out.println("Funcionalidades");
                    System.out.println(articulo.EjecutarVideoJuegos());
                    System.out.println(articulo.NavegarEnInternet());
                    System.out.println(articulo.VerVideo());
                    System.out.println("Portable: "+articulo.Portable());
                    ListaDeArticulosTemporal.add(articulo);
                    Carro.AgregarArticulo(articulo);
                }else if(ElegirArticulo==6){
                    articulo.setNombre("Laptop");
                    articulo.setMarca("HP");
                    articulo.setDisponibilidada(13);
                    articulo.setPrecio(8000);
                    articulo.setPortable(true);

                    System.out.println("Funcionalidades");
                    System.out.println(articulo.EjecutarVideoJuegos());
                    System.out.println(articulo.NavegarEnInternet());
                    System.out.println(articulo.VerVideo());
                    System.out.println("Portable: "+articulo.Portable());
                    ListaDeArticulosTemporal.add(articulo);
                    Carro.AgregarArticulo(articulo);
                }else if(ElegirArticulo==7){
                    articulo.setNombre("Smart TV");
                    articulo.setMarca("Samsung");
                    articulo.setDisponibilidada(16);
                    articulo.setPrecio(3275);
                    articulo.setPortable(false);

                    System.out.println("Funcionalidades");
                    System.out.println(articulo.NavegarEnInternet());
                    System.out.println(articulo.VerVideo());
                    System.out.println("Portable: "+articulo.Portable());
                    ListaDeArticulosTemporal.add(articulo);
                    Carro.AgregarArticulo(articulo);
                }else if(ElegirArticulo==8){
                    articulo.setNombre("Tablet");
                    articulo.setMarca("Vaio");
                    articulo.setDisponibilidada(17);
                    articulo.setPrecio(1650);
                    articulo.setPortable(true);

                    System.out.println("Funcionalidades");
                    System.out.println(articulo.Fotografia());
                    System.out.println(articulo.NavegarEnInternet());
                    System.out.println(articulo.VerVideo());
                    System.out.println("Portable: "+articulo.Portable());
                    ListaDeArticulosTemporal.add(articulo);
                    Carro.AgregarArticulo(articulo);
                }else if(ElegirArticulo==9){
                    articulo.setNombre("Smartwatch");
                    articulo.setMarca("Lenovo");
                    articulo.setDisponibilidada(26);
                    articulo.setPrecio(2000);
                    articulo.setPortable(true);

                    System.out.println("Funcionalidades");
                    System.out.println(articulo.Llamada());
                    System.out.println(articulo.Fotografia());
                    System.out.println("Portable: "+articulo.Portable());
                    ListaDeArticulosTemporal.add(articulo);
                    Carro.AgregarArticulo(articulo);
                }else{
                    System.out.println("Ingrese un valor valido ");
                }

            }else if(opcion==2){
                Carro.setProductos(ListaDeArticulosTemporal);
                if(ListaDeArticulosTemporal.size()==00){
                    System.out.println("\p        ")
                    System.out.println("_____ Carro _____");
                    Carro.ListarCarro();
                }
            }else if(opcion==3){
                if(ListaDeArticulosTemporal.size()==0){
                    System.out.println("\p         ")
                    System.out.println("No se hizo ninguna compra ");
                }else{
                    System.out.println("\p      ");
                    Carro.setProductos(ListaDeArticulosTemporal);
                    System.out.println("\p\p\p\p");
                    System.out.println("_______ Factura ______");
                    System.out.println("______ Datos Cliente ______");
                    System.out.println(Cliente.toString());
                    System.out.println("________ Información de la compra _________");
                    Carro.ListarCarro();
                    Archivo Cliente1=new Archivo("./registroClientes.csv","Nombre, NIT, Telefono");
                    String Linea="";
                    Linea+=Cliente.getNombre()+",";
                    Linea+=Cliente.getNIT()+",";
                    Linea+=Cliente.getTelefono()+",";
                    Cliente1.EscribirArchivo(Linea);
                    Archivo Compra1=new Archivo("./registroCompras.csv", "Nombre, Marca, Cliente, Precio");
                    for(int i=0; i<ListaDeArticulosTemporal.size(); i++){
                        Compra1.EscribirArchivo(ListaDeArticulosTemporal.get(i).toString()+","+Cliente.getNombre());
                    } 
                }
            }else{
                System.out.println("Ingrese una opcion correcta")
            }
        }
        
    }
}
