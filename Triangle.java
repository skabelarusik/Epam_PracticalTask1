public class Triangle{
    public static void main(String[] args){
        MessageIsFigure.checkTriangle(ControllerFigure.isTriangle(2,77.0,99));
 	MessageIsFigure.checkTriangle(ControllerFigure.isTriangle(16.6,22.0,34));
    }
}
class ControllerFigure{

    public static boolean isTriangle(double a, double b, double c){
        if( a<b+c && b<a+c && c<a+b )
            return true;
        else return false;
    }
}
class MessageIsFigure{
    public static void checkTriangle(boolean a){
        if(a==true) System.out.println("Figure is triangle");
        else System.out.println("Figure is not triangle");}
}