import java.util.Scanner;

public class MyScanner 
{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            if(scanner.hasNext()){
                String str = scanner.next();
                System.out.println(str);
            }
        }
    }
    public static void main(String[] args) {
        MyScanner changema1n = new MyScanner();
        changema1n.run();
    }
}

