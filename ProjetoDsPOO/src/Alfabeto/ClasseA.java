package Alfabeto;

public class ClasseA {

    public String Alfabeto = "humano";
    public String Letra = "b";

    public ClasseA(String A, String L){
        this.Alfabeto = A;
        this.Letra = L;
    }

    public void MostraNome() {
        System.out.println("O alfabeto e " + Letra + Alfabeto);
    }
}
