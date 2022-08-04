package solution;

import static solution.Main.combinations;
import static solution.Main.done;
import static solution.Main.k;
import static solution.Main.n;

public class CombinationsCalculator implements Runnable {
    @Override
    public void run() {
        int[] combination = new int[k];

        for (int i = 0; i < k; i++) {
            combination[i] = i + 1;
        }

        while (combination[k - 1] < n) {
            for (int j : combination) {
                combinations.add(j);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            int t = k - 1;
            while (t != 0 && combination[t] == n - k + t) {
                t--;
            }
            combination[t]++;
            for (int i = t + 1; i < k; i++) {
                combination[i] = combination[i - 1] + 1;
            }
        }
        done.set(true);
    }
}
