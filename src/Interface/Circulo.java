package Interface;

public class Circulo implements AreaCalculavel{

        public double raio;

        public Circulo(int raio){
            this.raio = raio;
        }
        public double calculaArea(){
            return Math.PI * this.raio * this.raio;
        }



}
