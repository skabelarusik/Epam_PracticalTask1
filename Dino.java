public class Dino {
    private static double mas = 4_000_256.5;
    public static void main(String[] args) {
        CalculateWeight.calculate(TypeWeight.ton,mas);
    }
}

class CalculateWeight{
    public static void calculate(Enum type, double mas){
        if(type == TypeWeight.kilo)
            System.out.println("Weight = "+mas/1000+" kilogramms");

        if(type == TypeWeight.centner)
            System.out.println("Weight = "+mas/1_000_00+" centners");

        if(type == TypeWeight.ton)
            System.out.println("Weight = "+mas/1_000_000+" tons");

    }
}
enum TypeWeight{
    kilo, centner, ton
}
