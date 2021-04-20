package tareas;

import interfaces.ITareaProducto;
import modelo.Producto;

public class TareaEnviarCorreo implements ITareaProducto  {
 
  @Override
  public void ejecutar(Producto p) {
      System.out.println(p.getNombre() +" enviado por correo") ;
  }
}