
public class TablePrinter {
    
    public void tableTwo(){
        for(int i=1; i<=10;i++){
            System.out.println(i+" x 2 =>" + i*2);
        }
    }
    public void tableThree(){
        for(int i=1; i<=10;i++){
            System.out.println(i+" x 3 =>" + i*3);
        }
    }
    
    public static void main(String[] args) {
        
        TablePrinter ob=new TablePrinter();
        ob.tableTwo();
        ob.tableThree();
        
        
    }
}
