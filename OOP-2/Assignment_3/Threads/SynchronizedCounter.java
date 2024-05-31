package Threads;

public class SynchronizedCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }

    public static void main(String[] args) {
        SynchronizedCounter counter = new SynchronizedCounter();

        // Creating two threads that increment the counter
        Thread thread1 = new Thread(new Runnable (){
            @Override
            public void run(){
                for(int i = 0; i < 1000; i++){
                    counter.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 1000; i++){
                    counter.increment();
                }
            }
        });
        
        thread1.start();
        thread2.start();

        // wait for threads to finish

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " +counter.getCount());

    }
}