package Exceptions;
// https://www.youtube.com/watch?v=ld2C4GcAtsg&ab_channel=LoianeGroner
public class Excecao {
    public static void main(String[] args) {

        try{
            int [] vetor = new int [4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Este texto não será impresso");
        } catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um indice do vetor que não existe");
        }

        System.out.println("Este texto será impresso após a expection");

    }
}
