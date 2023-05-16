package Pessoa;

public class Pessoa {
    String nome;
    int idade;

    void fazerAniversario(){
        if(idade == 18){
            System.out.println("Ser humano: " + nome + " é maior de 18");
        } else {
            System.out.println("Ser humano: " + nome + " ainda não é maior de 18");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
