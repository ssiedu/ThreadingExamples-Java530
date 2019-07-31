public class JaiPurInfo extends Thread {
      public void run(){
        info();
    }
    public void info(){
        String s=getName();
        System.out.println(s+"=>Jaipur Is In RJ");
        System.out.println(s+"=>Jaipur Is Historical Place");
        System.out.println(s+"=>Jaipur Is Capital Of RJ");
    }
    
}
