public class Concurrency {
    public static void main(String args[]) {
    	
    	Test test = new Test();

        Thread thread1 = new Thread(test);
        Thread thread2 = new Thread(test);

        thread1.start();
        thread2.start();
    }
}
class Test implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}