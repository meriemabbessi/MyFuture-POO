import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nb;
        System.out.println("saisir un nombre entier:");
        nb=sc.nextInt();
        /*avec la boucle pour 
        boolean test;
        test=true;
        String ch=String.valueOf(nb);
        for( int i=0;i<ch.length();i++){
            if(((ch.charAt(i) != '0') && (ch.charAt(i) != '1'))){
                test=false;
                break;
            }
        };
        System.out.println(test);
        if(test==true){
            System.out.println("len nombre "+nb+" est binaire");
        }
        else{
             System.out.println("len nombre "+nb+" n'est pas binaire");
        }
             */
        /*avec la boucle while */
        boolean test;
        test=true;
        String ch=String.valueOf(nb);
        int i=ch.length()-1;
        while(i>=0 && test==true){
            if((ch.charAt(i) != '0') && (ch.charAt(i) != '1')){
                test=false;
            }
            else{
                i=i-1;
            }
        }
        if(test==true){
            System.out.println("len nombre "+nb+" est binaire");
        }
        else{
             System.out.println("len nombre "+nb+" n'est pas binaire");
        }
        



    }
}
