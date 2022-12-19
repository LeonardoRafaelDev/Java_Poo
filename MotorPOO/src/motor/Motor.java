package motor;

public class Motor {
    private final String NomeFabricante;
    private final Integer Potencia;
    private final String TipoCombustivel;

    public Motor (){
        this.NomeFabricante = "Mercedes";
        this.Potencia = 211;
        this.TipoCombustivel = "Oleo Diesel";
    }

    public Motor (String NF, Integer PT, String TC){
        this.NomeFabricante = NF;
        this.Potencia = PT;
        this.TipoCombustivel = TC;
    }

    public void MostraMotor(){
        System.out.println("O motor e da: " + NomeFabricante + " " + "a potencia e: " + Potencia + "cv" + " " + "o combustive e: " + TipoCombustivel);
    }

}
