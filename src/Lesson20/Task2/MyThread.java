package Lesson20.Task2;

public class MyThread extends Thread{
    int[] array;
    int[] result;

    public MyThread(int[] array) {
        this.array = array;
    }

    public int[] getResult() {
        return result;
    }
}
