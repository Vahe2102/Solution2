package solution;


import static solution.Main.combinations;
import static solution.Main.done;
import static solution.Main.k;

public class CombinationReader implements Runnable {
    public int count = 0;

    @Override
    public void run() {
        while (combinations.size() > 0 || !done.get()) {
            while (combinations.size() > 0) {
                System.out.print(combinations.poll() + " ");
                count++;
                if (count == k) {
                    System.out.println();
                    count = 0;
                }
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println();
        }
    }
}