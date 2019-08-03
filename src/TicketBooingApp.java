
import static java.lang.System.out;

class Bus {

    private static int seats = 10;

    public synchronized void bookSeat(int seat) {
        if (seat < seats) {
            out.println("Booing Success for seat : " + seat);
            seats = seats - seat;
            out.println("Remaining Seats : " + seats);
        } else {
            out.println("Cant Book " + seat + " seats ");
            out.println("Only " + seats + " seats available");
        }
    }

}

public class TicketBooingApp {

    public static void main(String[] args) {
       Bus bus=new Bus();
       Thread t1=new Thread(new Runnable(){
            public void run(){
                bus.bookSeat(8);
            }
        });
        Thread t2=new Thread(new Runnable(){
            public void run(){
                bus.bookSeat(4);
            }
        });
        
        t1.start();
        t2.start();
    }
}
