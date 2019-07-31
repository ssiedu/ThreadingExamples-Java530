class TaskOne extends Thread { 
    public void run(){
        for(int i=1; i<=10;i++){
            System.out.println(i+" x 2 =>" + i*2);
        }
    }
}

class TaskTwo extends Thread {
    public void run(){
         for(int i=1; i<=10;i++){
            System.out.println(i+" x 3 =>" + i*3);
        }
    }
}
        

public class TablePrinterMT {
    public static void main(String[] args) {
        TaskOne t1=new TaskOne();
        TaskTwo t2=new TaskTwo();
        t1.start();
        t2.start();
        
    }
}
