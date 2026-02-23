public class CurrencyConverter {
    double dollarPrice, dollarBought;

    double converter(){
        double dollarTotal = dollarPrice * dollarBought;
        return dollarTotal * 1.06;
    };
}
