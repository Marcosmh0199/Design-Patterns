import interfaces.*;

public class Mediator implements IMediator {
    private ComboBox comboBox;
    private TextLabel label;
    private CampoTexto CampoTexto;

    public void addColega(Colega colega) {
        colega.setMediator(this);
        switch (colega.getName()) {
            case "ComboBox":
                comboBox = (ComboBox)colega;
                break;
            case "CampoTexto":
                CampoTexto = (CampoTexto)colega;
                break;
            case "Label":
                label = (TextLabel)colega;
            default:
                break;
        }
    }

    @Override
    public String getLista() {
        String lista = "";
        for (String item : comboBox.items) {
            lista += item + ", ";
        }

        return lista;
    }

    @Override
    public void setTextoComplete() {
        label.setTexto("Ya me cambie");
    }

    @Override
    public void setTexto(String pTexto) {
        CampoTexto.setTexto(pTexto);
    }

    @Override
    public void enviar(String mensaje, Colega colega) {
        colega.recibir(mensaje);
    }
}
