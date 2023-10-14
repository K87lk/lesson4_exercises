package warehouse;

public class Task {
    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.payBonus();

        }
    }
