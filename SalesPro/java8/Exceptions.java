import java.io.FileNotFoundException;
import java.io.IOException;

class Exceptions{

    private void method1(){
        try{
            throw new FileNotFoundException();
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("IOException");
        }finally{
            System.out.println("Finally");
        }
        
    }
    public static void main(String...args){
        Exceptions exceptions=new Exceptions();
        exceptions.method1();        
    }
}