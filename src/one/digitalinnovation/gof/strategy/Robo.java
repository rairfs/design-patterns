package one.digitalinnovation.gof.strategy;

public class Robo {

    //Comportamento é a strategy
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }

}
