package Lesson9Task2;

class Rectangle extends Figure{
    private int a;
    private int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return 2 * (a + b) ;
    }

}
