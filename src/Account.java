public class Account
{
	int ano, bal;
	
	public Account(int x, int y){ano=x;bal=y;}

	public synchronized void withdraw(int amt)
	{
		Thread tmp=Thread.currentThread();
		String s=tmp.getName();
		if(bal>=amt)
		{
		System.out.println("Transaction Allowed For "+s);
		System.out.println("Collect Cash "+amt+" From Account of "+s);
		bal=bal-amt;
		System.out.println("Remaining Balance In Account Of "+s+" Is "+bal);
		}
		else
		{
		System.out.println("Insufficient Balance In Account Of "+s);
		}
	}
}