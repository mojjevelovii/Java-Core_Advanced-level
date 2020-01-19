package HW5;

public class Methods {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public void methodOne() {
        float[] arr = new float[SIZE];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long finishTime = System.currentTimeMillis();

        System.out.println(finishTime - startTime);


    }

    public void methodTwo() {
        float[] arr = new float[SIZE];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long startTime = System.currentTimeMillis();

        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        ArrayCalcRunnable calcOne = new ArrayCalcRunnable(arr1);
        ArrayCalcRunnable calcTwo = new ArrayCalcRunnable(arr2);

        Thread threadOne = new Thread(calcOne);
        Thread threadTwo = new Thread(calcTwo);
        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);

        long finishTime = System.currentTimeMillis();

        System.out.println(finishTime - startTime);
    }
}
