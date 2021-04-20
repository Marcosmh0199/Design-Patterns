package tareas;

import interfaces.ITareaProducto;
import modelo.Producto;

public class TareaMostrarProducto implements ITareaProducto{

  @Override
  public void ejecutar(Producto p) {
    System.out.println("Id: " + p.getId());
    System.out.println("Nombre: " + p.getNombre());
    System.out.println("Precio: " + p.getPrecio());
  }
  
}
