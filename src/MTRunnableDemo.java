
public class MTRunnableDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("2 x " + i + "=" + (2 * i));
                }
            }

        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("3 x " + i + "=" + (3 * i));
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("4 x " + i + "=" + (4 * i));
                }
            }
        });
        
        t1.start();
        t2.start();
        t3.start();

    }
}
