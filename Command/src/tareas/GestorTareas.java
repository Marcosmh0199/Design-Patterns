package tareas;

import interfaces.ITareaProducto;
import modelo.Producto;

public class GestorTareas {
  public void ejecutar (ITareaProducto t, Producto p){
    t.ejecutar(p);
  }
}
