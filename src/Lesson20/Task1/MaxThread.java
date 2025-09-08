package Lesson20.Task1;

public class MaxThread extends MyThread{

    public MaxThread(int[] array) {
        super(array);
    }

    @Override
    public void run() {
        result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result){
                result = array[i];
            }
        }
    }
}
