package Lesson9Task2;

class Circle extends Figure {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * 2;
    }



}
