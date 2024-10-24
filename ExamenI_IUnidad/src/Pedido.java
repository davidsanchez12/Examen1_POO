import java.util.ArrayList;

public class Pedido  {

    private ArrayList<Productos> Producto;
    Producto= new ArrayList<>();
    
     //ProductoAlimenticio producto1 = new ProductoAlimenticio("Papa", 12, 20, 12.24);
     Producto.add(new ProductoAlimenticio("Papa", 12,20, 12.24));
     Producto.add(new ProductoAlimenticio("Jamon",45,10,11.24));
     Producto.add(new ProductoAlimenticio("Huevo", 12, 20, 12.24));
     Producto.add(new ProductoElectronico("Tablet",1200,10));
     Producto.add(new ProductoElectronico("Computadora",8000,10));

public void agregar_producto (String productos, int cantidad){
    if (Producto.contains(productos)) {
        
        
    }


    




}


//Productos producto1 = new ProductoAlimenticio("Pollo", 30, 20, 12.24)


}


/*Implementa una clase Pedido que contenga: 
▪ Una lista de productos. 
▪ Un método agregar_producto(producto, cantidad) que agregue productos al 
pedido. 
▪ Un método calcular_total() que calcule el costo total de los productos en el 
pedido. 
▪ Un método procesar_pedido(metodo_pago) que procese el pago del total 
utilizando un objeto que implemente MetodoPago.  */
/* */