package Lesson20.Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива:");
        int size = scanner.nextInt();
        if (size == 0){
            throw new ArithmeticException("Размер массива не должен быть равен 0");
        }
        int [] array = new int[size];
        System.out.println("Введите элементы массива по одному  через Enter");
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            array[i] = num;
        }
        MinThread minThread = new MinThread(array);
        MaxThread maxThread = new MaxThread(array);
        maxThread.start();
        minThread.start();
        maxThread.join();
        minThread.join();
        System.out.println(maxThread.getResult() + " - максимальное,  " + minThread.getResult() + " - минимальное");
    }
}
