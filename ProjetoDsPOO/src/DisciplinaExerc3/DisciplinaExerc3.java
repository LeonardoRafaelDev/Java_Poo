package DisciplinaExerc3;

public class DisciplinaExerc3 {

    private final String NomeDisciplina3;
    private final String CargaHorario3;

    DisciplinaExerc3(String NomeDisciplina3, String CargaHorario3){
        this.NomeDisciplina3 = NomeDisciplina3;
        this.CargaHorario3 = CargaHorario3;
    }

    public String MostraDados() {
        return NomeDisciplina3 + "" + CargaHorario3;
    }
}

