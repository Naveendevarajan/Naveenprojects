package Threads;

public class ThreadTask2 implements  Runnable{
 int initialValue;
 int finalValue;
  public ThreadTask2 ( int initialValue, int finalValue){
      this.initialValue = initialValue;
      this.finalValue = finalValue;

  }
    @Override
    public void run() {
        for (int i = initialValue; i <= finalValue ; i++) {
            System.out.println("Numbers "+i);

        }
    }

    public static void main(String[] args) {
        Runnable runnable=new ThreadTask2(1,5);
        Runnable runnable2 =new ThreadTask2(6,10);
        Thread thread=new Thread(runnable);
        Thread thread2 =new Thread(runnable2);
        thread.start();
        thread2.start();
    }
}
