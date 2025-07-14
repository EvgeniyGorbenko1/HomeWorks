package Lesson9Task2;

class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int c, int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }


    @Override
    public double calculateArea() {
        return a + b + c;
    }

}
