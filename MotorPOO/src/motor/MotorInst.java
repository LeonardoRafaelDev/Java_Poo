package motor;

public class MotorInst {

    public static class Editor extends Motor{
        static Motor m1 = new Motor("Mercedes", 211,"Diesel");


        public static void main(String[] args){
            Motor m2 = new Motor("ferrari", 222,"Petroleo");
            m2.MostraMotor();
            m1.MostraMotor();
        }

    }








}
