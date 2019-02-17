public class CandyVsJelatin {
    private static double priceChocolCandy = 15.7;
    private static double weigthChocolCandy = 3.4;
    private static double priceZhelatin = 9.4;
    private static double weightZhelatin = 4.5;
 
    public static void main(String[] args) {
        double priceKiloChok = CalculDiffSumm.pricePerKilo(weigthChocolCandy, priceChocolCandy);
        double priceKiloZhelat = CalculDiffSumm.pricePerKilo(weightZhelatin, priceZhelatin);
       
	CalculDiffSumm.differencePrice(priceKiloChok, priceKiloZhelat);

    }
}
class CalculDiffSumm{
    public static double pricePerKilo(double weight, double price){
        return price/weight;
    }

    public static void differencePrice(double choc, double zhelat){
        if(choc/zhelat>1){
            System.out.println("Chocolate is more expensive than zhelatin in "+choc/zhelat);
        }else{
            if(choc/zhelat<1){
                System.out.println("Zhelatin is more expensive than chokolat in "+zhelat/choc);
            }else System.out.println("Prices are equals");
        }
    }
}
