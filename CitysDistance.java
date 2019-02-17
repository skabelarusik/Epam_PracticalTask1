public class CitysDistance {
    private static int distance = 5_000_000;
    public static void main(String[] args) {
        System.out.println(ChangeTypeDistance.inKilometres(distance));
        System.out.println(ChangeTypeDistance.inMetres(distance));
    }
}
class ChangeTypeDistance{
    public static String inMetres(int dist){
        return "Distance is "+(double)dist/100+" metres";
    }

    public  static String inKilometres(int dist){
        return "Distance is "+(double)dist/100_000+" kilometres";
    }
}
