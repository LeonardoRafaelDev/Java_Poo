package Disciplina;


public class Disciplina {
    public String NomeDisciplina;
    public String CargaHoraria;

    public Disciplina(String NomeDisciplina, String CargaHoraria){
        this.NomeDisciplina = NomeDisciplina;
        this.CargaHoraria = CargaHoraria;
    }

    public void MostraDados() {
        System.out.println("Materia: " + NomeDisciplina + " " + "CargaHoraria: " + CargaHoraria);
    }

}
