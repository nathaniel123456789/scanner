import java.util.Scanner;

public class MyScanner
{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String word = scanner.next();
            System.out.println(word);
        }
    }
        
    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}
