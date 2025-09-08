package Lesson20.Task2;

public class BubbleThread extends MyThread {
    public BubbleThread(int[] array) {
        super(array);
    }

    @Override
    public void run() {
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j] > result[j + 1]) {
                    int num = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = num;
                }
            }
        }

    }
}
