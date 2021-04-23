import interfaces.*;

public class TextLabel implements Colega {
    private IMediator mediator;
    private String texto = "Soy texto a cambiar";

    @Override
    public void setMediator(IMediator pMediator) {
        mediator = pMediator;
        
    }

    @Override
    public String getName() {
        return "Label";
    }

    public void cambiarTexto(String pTexto) {
        mediator.setTextoComplete();
    }

    public void setTexto(String pTexto) {
        texto = pTexto;
    }

    public String getTexto() {
        return texto;
    }
    
    @Override
    public void comunicar(String mensaje, Colega colega) {
        mediator.enviar(mensaje, colega); 
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println( "Label recibio: " + mensaje );
    }
}
