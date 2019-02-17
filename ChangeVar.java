public class ChangeVar {

    public static void main(String[] args) {
        Changer changer = new Changer(4.0, 5.5);

        changer.changeVar(changer.getA(), changer.getB());
    }
}
class Changer{
        private double a;
        private double b;

        public Changer(double a, double b){
            this.a = a;
            this.b = b;
        }

        public double getA(){
            return a;
        }

        public double getB(){
            return b;
        }

    public void changeVar(double a, double b){
        a = a + b;
        b = a - b;
        a = a - b;
        this.a = a;
        this.b = b;
    }
}