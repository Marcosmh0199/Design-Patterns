package interfaces;

public interface IMediator {
    String getLista();
    void setTextoComplete();
    void setTexto(String pTexto);
    void enviar(String mensaje, Colega colega);
}