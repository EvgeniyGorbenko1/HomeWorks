package Project.Models;

public class Account {
    private String num;
    private int amount;

    public Account(String num, int amount) {
        this.num = num;
        this.amount = amount;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return num + '|' +
                +amount + '\n';
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
