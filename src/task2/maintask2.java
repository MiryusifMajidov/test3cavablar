package task2;


public class maintask2 {
    public static void main(String[] args) {
       try{
           int result = ExceptionTask.divide(10,0);
           System.out.println(result);
       }
       catch (DivisionByZeroException e){
           System.out.println("Error:"+e.getMessage());
           throw new RuntimeException(e);
       }
    }
}
