package Lesson6;

class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("234321", 2004.12);
        CreditCard creditCard2 = new CreditCard("234322", 2333.43);
        CreditCard creditCard3 = new CreditCard("234323", 134.36);
        creditCard1.deposit((double)250.0F);
        creditCard2.deposit((double)121.0F);
        creditCard3.withdraw((double)130.0F);
        System.out.println("Текущее состояние счетов:");
        creditCard1.info();
        creditCard2.info();
        creditCard3.info();
    }
}