import modelo.Producto;
import tareas.GestorTareas;
import tareas.Tarea;
import tareas.TareaEnviarCorreo;
import tareas.TareaMostrarProducto;
import tareas.TareaValidarProducto;

public class App {
  public static void main(String[] args) throws Exception {
    Tarea tareas = new Tarea();
    tareas.agregarTarea(new TareaValidarProducto());
    tareas.agregarTarea(new TareaEnviarCorreo());
    tareas.agregarTarea(new TareaMostrarProducto());

    Producto p = new Producto(1, "Producto de Prueba", 1000.75);
    GestorTareas g = new GestorTareas();
    g.ejecutar(tareas, p);
  }
}
