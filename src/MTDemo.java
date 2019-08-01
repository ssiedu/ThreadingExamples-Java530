import java.util.Scanner;
public class MTDemo extends Thread {
    
    public void run(){
	String s=getName();//running thread
      	System.out.println(s+"=>Statement-1");
	if(s.equals("BBB"))
	{
		System.out.println(10/0);
		//stop();
		try{
		//Thread.sleep(25000);//milli-seconds
		}catch(Exception e){}
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Some Data For BBB");
		//int data=sc.nextInt();
	}
	System.out.println(s+"=>Statement-2");
        	System.out.println(s+"=>Statement-3");
        	System.out.println(s+"=>Statement-4");
    }
    public static void main(String args[]) throws Exception{
	System.out.println("Main-Method-Started");
	MTDemo t1=new MTDemo(); t1.setName("AAA");
	MTDemo t2=new MTDemo(); t2.setName("BBB");
	MTDemo t3=new MTDemo(); t3.setName("CCC");
	MTDemo t4=new MTDemo(); t4.setName("DDD");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	//Thread.sleep(50000);
	System.out.println("Main-Method-Completed");
    }
}



