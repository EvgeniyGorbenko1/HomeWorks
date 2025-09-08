package Lesson20.Task1;

public class MinThread extends MyThread{
    public MinThread(int[] array) {
        super(array);
    }

    @Override
    public void run() {
        result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result){
                result = array[i];
            }
        }
    }
}
