package Threads;

public class SleepThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <=5; i++) {
                Thread.sleep(1000);
                System.out.println("Current thread-"+i);

            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        SleepThread sleepThread = new SleepThread();
        sleepThread.start();

    }
}
