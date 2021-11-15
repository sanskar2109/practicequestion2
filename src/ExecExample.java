import java.util.Scanner;

public class ExecExample {
    public static void main(String[] args) {
        try (Scanner S = new Scanner(System.in)){
            int a =S.nextInt();
        }
        catch (Exception obj){
            System.out.println(obj);
        }
    }
}
