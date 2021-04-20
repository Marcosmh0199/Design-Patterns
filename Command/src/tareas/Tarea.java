package tareas;

import java.util.ArrayList;
import interfaces.ITareaProducto;
import modelo.Producto;

public class Tarea implements interfaces.ITareaProducto{

  private ArrayList<ITareaProducto> lista = new ArrayList<ITareaProducto>();
  
  public boolean agregarTarea(ITareaProducto t){
    if(t != null){
      lista.add(t);
      return true;
    }
    return false;
  }

  @Override
  public void ejecutar(Producto p) {
    lista.forEach((t)->t.ejecutar(p));    
  }
  
}
