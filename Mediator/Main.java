public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        
        ComboBox comboBox = new ComboBox();
        TextLabel label = new TextLabel();
        CampoTexto campoTexto = new CampoTexto();

        mediator.addColega(comboBox);
        mediator.addColega(label);
        mediator.addColega(campoTexto);

        System.out.println(mediator.getLista());
        comboBox.viewLista();

        comboBox.addItem("Soy nuevo");
        System.out.println(mediator.getLista());
        comboBox.viewLista();

    }
}
