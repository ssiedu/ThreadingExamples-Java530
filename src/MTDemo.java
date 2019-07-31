public class MTDemo extends Thread {
    
    public void run(){
        disp();
    }
    public void disp(){
        System.out.println("Statement-1");
        System.out.println("Statement-2");
        System.out.println("Statement-3");
        System.out.println("Statement-4");
    }
    public static void main(String args[]){

        MTDemo ob1=new MTDemo();    //first thread
        MTDemo ob2=new MTDemo();    //second thread
        MTDemo ob3=new MTDemo();    //third thread
        ob1.start();    //started first thread
        ob2.start();    //started second thread
        ob3.start();    //started third thread
        
        
    }
}

/*
    1) extends the Thread class 
    2) override the run method
    3) create the objects 
    4)
*/