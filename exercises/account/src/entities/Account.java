package entities;

public class Account {

    private int numberAccount;
    private String holderAccount;
    private double balanceAccount;

    public Account() {
    }

    public void depositValue(double value){
        balanceAccount += value;
    }

    public void withdrawValue(double value){
        balanceAccount -= (value + 5);
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public void setHolderAccount(String holderAccount) {
        this.holderAccount = holderAccount;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

}
