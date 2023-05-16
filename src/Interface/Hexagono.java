package Interface;

public abstract class Hexagono implements AreaCalculavel {
    public double lado;

    public Hexagono(int lado){
        this.lado = lado;
    }
    public double calculaArea(){
        return this.lado * this.lado;
    }
}
