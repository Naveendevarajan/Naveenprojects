package Threads;

public class ThreadTask1 extends Thread {
    int number;

    public ThreadTask1(int number){
        this.number=number;
    }
    @Override
    public void run() {
        System.out.println("Welcome to Thread - "+number);
    }

    public static void main(String[] args)
    {
        for (int i = 1; i <=5; i++) {
            ThreadTask1 threadTask1 = new ThreadTask1(i);
            threadTask1.start();

        }
    }
}
