public class MumbaiInfo extends Thread {
      public void run(){
        info();
    }
    public void info(){
        String s=getName();
        System.out.println(s+"=>Mumbai Is In MH");
        System.out.println(s+"=>Mumbai Is Famous Place");
        System.out.println(s+"=>Mumbai Is Capital Of MH");
        System.out.println(s+"=>Mumbai Is Worst Place To Live");
    }
    
}
