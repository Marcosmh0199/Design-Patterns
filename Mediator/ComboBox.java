import java.util.ArrayList;
import interfaces.Colega;
import interfaces.IMediator;

public class ComboBox implements Colega {
    private IMediator mediator;
    ArrayList<String> items;

    public ComboBox() {
        items =  new ArrayList<String>();

        items.add("Primero");
        items.add("Segundo");
        items.add("Tercero");
    }

    @Override
    public void setMediator(IMediator pMediator) {
        mediator = pMediator;
    }

    @Override
    public String getName() {
        return "ComboBox";
    }

    public void viewLista() {
        String lista = mediator.getLista();
        System.out.println(lista);
    }

    public void addItem(String pItem) {
        items.add(pItem);
    }

    @Override
    public void comunicar(String mensaje, Colega colega) {
        mediator.enviar(mensaje, colega); 
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println( "ComboBox recibio: " + mensaje );
    }
}
