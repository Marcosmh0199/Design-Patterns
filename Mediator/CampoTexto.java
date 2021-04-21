import interfaces.Colega;
import interfaces.IMediator;

public class CampoTexto implements Colega {
    private IMediator mediator;
    private String texto;

    @Override
    public void setMediator(IMediator pMediator) {
        mediator = pMediator;
    }

    @Override
    public String getName() {
        return "CampoTexto";
    }

    public void addText(String pTexto) {
        mediator.setTexto(pTexto);
    }

    public void setTexto(String pTexto) {
        texto = pTexto;
    }

    public String getTexto() {
        return texto;
    }  
}
