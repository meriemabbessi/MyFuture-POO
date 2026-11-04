import java.util.Scanner;

public class matiere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Nom;
        String Prenom;
        String matiere;
        System.out.println("donner votre nom");
        Nom=sc.nextLine();
        System.out.println("donner votre prenom");
        Prenom=sc.nextLine();
        System.out.println("donner votre matiere");
        matiere=sc.nextLine();
    
    int choix;
    do{
        System.out.println("1:consulter");
        choix=sc.nextInt();
        switch(choix){
        case 1:
            System.out.println("Nom="+Nom);
            System.out.println("Prenom="+Prenom);
            System.out.println("matiere="+matiere);
            break;
        default:
            System.out.println("Choix incorrect, veuillez choisir 1 ");
        }
        }
        while(choix==1);

    
    
}}