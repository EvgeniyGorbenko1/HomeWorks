package Lesson20.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
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
        BubbleThread bubbleThread = new BubbleThread(array);
        bubbleThread.start();
        bubbleThread.join();
        int [] sortedArray = bubbleThread.getResult();
        System.out.println(Arrays.toString(sortedArray));

    }
}
