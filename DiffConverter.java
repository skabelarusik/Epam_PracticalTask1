public class DiffConverter {
    public static void main(String[] args) {
        double summMoney = 30.4;
        double temperature = 22;

        System.out.println(Converter.convValyut(Valyuta.BEL_RUBL, Valyuta.BEL_RUBL, summMoney));
        System.out.println(Converter.convValyut(Valyuta.BEL_RUBL, Valyuta.DOLLAR, summMoney));
        System.out.println(Converter.convValyut(Valyuta.BEL_RUBL, Valyuta.EURO, summMoney));

        System.out.println(Converter.convTemper(Temperature.Celsius, Temperature.Kelvin, temperature));
        System.out.println(Converter.convTemper(Temperature.Celsius, Temperature.Farengeit, temperature));
        System.out.println(Converter.convTemper(Temperature.Farengeit, Temperature.Kelvin, temperature));
        System.out.println(Converter.convTemper(Temperature.Celsius, Temperature.Celsius, temperature));
    }
}
class Converter{
    private static double convBelRubInDollar = 0.5;
    private static double convDolInEuro = 0.9;
    private static double convBelRubInEuro = 0.45;

    private static double diffKelvWithCelsiy = 273.15;

    public static double convValyut(Enum val1, Enum val2, double summ){
        if(val1 == Valyuta.BEL_RUBL && val2 == Valyuta.DOLLAR){
            return summ*convBelRubInDollar; }else
        if(val1 == Valyuta.BEL_RUBL && val2 == Valyuta.EURO){
            return summ*convBelRubInEuro;} else
        if(val1 == Valyuta.DOLLAR && val2 == Valyuta.EURO){
            return summ*convDolInEuro;} else
        if(val1 == Valyuta.EURO && val2 == Valyuta.DOLLAR){
            return summ/convDolInEuro;}else
        if(val1 == Valyuta.DOLLAR && val2 == Valyuta.BEL_RUBL){
            return summ/convBelRubInDollar;}else
        if(val1 == Valyuta.EURO && val2 == Valyuta.BEL_RUBL){
            return summ/convBelRubInEuro;}
        else return summ;
    }

    public static double convTemper(Enum temp1, Enum temp2, double value){
        if(temp1 == Temperature.Celsius && temp2 == Temperature.Kelvin){
            return value+diffKelvWithCelsiy;
        }else
        if(temp1 == Temperature.Kelvin && temp2 == Temperature.Celsius){
            return value=diffKelvWithCelsiy;
        }else
            if(temp1 == Temperature.Celsius && temp2 == Temperature.Farengeit) {
                return value*9/5+32;
            }else
                if(temp1 == Temperature.Farengeit && temp2 == Temperature.Celsius){
                    return (32 - value)*5/9;
                }else
                    if(temp1 == Temperature.Farengeit && temp2 == Temperature.Kelvin){
                        return (value-32)*5/9+diffKelvWithCelsiy;}else
                            if(temp1 == Temperature.Kelvin && temp2 == Temperature.Farengeit){
                                return (value-diffKelvWithCelsiy)*9/5+32;
                            }else return value;
    }
}

enum Valyuta{
    EURO, DOLLAR,BEL_RUBL
}

enum Temperature{
    Celsius, Farengeit, Kelvin
}
