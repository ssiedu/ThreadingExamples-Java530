class A implements Runnable
{
    public void run(){
         for(int i=1; i<=10;i++){
            System.out.println("2 x "+i+"="+(2*i));
        }
    }
}
class B implements Runnable
{
    public void run(){
        for(int i=1; i<=10;i++){
            System.out.println("3 x "+i+"="+(3*i));
        }        
    }
}
class C implements Runnable
{
    public void run(){
        for(int i=1; i<=10;i++){
            System.out.println("4 x "+i+"="+(4*i));
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
       
        Thread t1=new Thread(new A());
        Thread t2=new Thread(new B());
        Thread t3=new Thread(new C());
        t1.start();
        t2.start();
        t3.start();
        
    }
}
