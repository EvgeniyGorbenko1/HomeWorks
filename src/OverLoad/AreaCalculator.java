package OverLoad;

public class AreaCalculator{
    long calculateArea(int side){
        return (long) side * side;
    }

    long calculateArea(int lenght, int width){
        return (long)lenght * width;
    }

    double calculateArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    double calculateArea(double base, double height){
        return  base * height / 2;
    }
}
