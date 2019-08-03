public class ATMCard extends Thread
{
	Account ac;

public void run()
{
	ac.withdraw(8000);
}


public static void main(String args[])
{
	Account ac1=new Account(111,10000);
	Account ac2=new Account(112,20000);
	Account ac3=new Account(113,30000);

	ATMCard c1=new ATMCard(); c1.setName("AA");
	ATMCard c2=new ATMCard(); c2.setName("BB");
	ATMCard c3=new ATMCard(); c3.setName("CC");

	c1.ac=ac1;
	c2.ac=ac2;
	c3.ac=ac1;

	c1.start();
	c2.start();
	c3.start();




}
}