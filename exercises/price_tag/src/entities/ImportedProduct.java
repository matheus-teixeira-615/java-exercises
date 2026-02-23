package entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, Double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return getName()
                + String.format(" %.2f", totalPrice());
    }
}
