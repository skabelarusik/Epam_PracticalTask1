public class SizeByte {
    public static void main(String[] args) {
        int a = 80_000_000;
        CalculateSize.calculateAnotherType(TypeSize.kilobyte, a);
        CalculateSize.calculateAnotherType(TypeSize.megabyte, a);
        CalculateSize.calculateAnotherType(TypeSize.gigabyte, a);
    }
}
class CalculateSize{
    public static void calculateAnotherType(Enum type, int size){
        if(type == TypeSize.kilobyte)
            System.out.println("Size is "+(double)size/1000+" kilobyte");
        if(type == TypeSize.megabyte)
            System.out.println("Size is "+(double)size/1_000_000+" megabyte");
        if(type == TypeSize.gigabyte)
            System.out.println("Size is "+(double)size/1_000_000_000+" gigabyte");
    }
}

enum TypeSize{
    kilobyte, megabyte, gigabyte;
}
