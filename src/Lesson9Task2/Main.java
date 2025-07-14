package Lesson9Task2;

public class Main {
    //Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
    //функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
    //абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
    //периметра всех фигур в массиве.
    public static void main(String[] args) {
       Figure[] figure = new Figure[3];
       figure[0]= new Circle(13.2);
       figure[1]= new Rectangle(1, 2);
       figure[2] = new Triangle(4, 2,7);

        double totalPerimeter = 0;
        for (Figure figures : figure) {
            totalPerimeter += figures.calculateArea();
        }
        System.out.println("Сумма периметров: " + totalPerimeter);
    }
}
