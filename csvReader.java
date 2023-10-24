import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class csvReader 
{
    public void run() throws FileNotFoundException{
        File doc = new File();
        Scanner scanner = new Scanner(doc);
        
        while (true){
            if(scanner.hasNext()){
                String str = scanner.next();
                System.out.println(str);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}

