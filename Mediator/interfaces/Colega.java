package interfaces;

public interface Colega {
    void setMediator(IMediator pMediator);
    String getName();
    void comunicar(String mensaje, Colega colega);
    void recibir(String mensaje);
}
