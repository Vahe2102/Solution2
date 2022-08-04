package solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static Queue<Integer> combinations = new LinkedList<>();
    public static int n;
    public static int k;
    public static AtomicBoolean done;

    public static void main(String[] args) throws InterruptedException {
        CombinationReader reader = new CombinationReader();
        Thread readerThread = new Thread(reader);

        CombinationsCalculator calculator = new CombinationsCalculator();
        Thread calculatorThread = new Thread(calculator);


        int N = 5;
        int K = 3;
        done = new AtomicBoolean(false);
        n = N + 1;
        k = K;

        calculatorThread.start();
        readerThread.start();
        readerThread.join();
        calculatorThread.join();
    }
}

