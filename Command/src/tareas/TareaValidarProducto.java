package tareas;

import interfaces.ITareaProducto;
import modelo.Producto;

public class TareaValidarProducto implements ITareaProducto{

  @Override
  public void ejecutar(Producto p) {
    if(p.getPrecio() > 0) {
      System.out.println("Producto valido");
    }else {
      System.out.println("Producto invalido");
    }
  }
  
}
