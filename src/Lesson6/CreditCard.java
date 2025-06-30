package Lesson6;

class CreditCard {
    String accnumber;
    double curmoney;

    CreditCard(String accnumber, double curmoney) {
        this.accnumber = accnumber;
        this.curmoney = curmoney;
    }

    void deposit(double amount) {
        if (amount > (double)0.0F) {
            this.curmoney += amount;
            System.out.println("Счёт " + this.accnumber + " пополнен на " + amount);
        } else {
            System.out.println("Недостаточно средств");
        }

    }

    void withdraw(double amount) {
        if (this.curmoney > amount) {
            this.curmoney -= amount;
            System.out.println("Со счёта " + this.accnumber + " снято " + amount);
        } else {
            System.out.println("Недостаточно средств на карте");
        }

    }

    void info() {
        System.out.println("Баланс " + this.accnumber + " cоставляет: " + this.curmoney);
    }
}

