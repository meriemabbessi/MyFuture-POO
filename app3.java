import java.util.Scanner;
public class app3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("donner un nombre");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("n est pair");
        }
        else{
            System.out.println("n est impair");
        }
    }
}
