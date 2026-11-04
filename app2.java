import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        System.out.println("donner le 1er nombre");
        a=sc.nextInt();
        System.out.println("donner le 2eme nombre");
        b=sc.nextInt();
        if(a>b){
             System.out.println("a est le plus grand");
        }
        else{
            System.out.println("b est le plus grand");
        }
        

    }
}
