
import java.util.Scanner;

public class Appbanque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cin;
        String Nom;
        String Prenom;
        int NCompte;
        final double plafond_retrait = 500.000;
        System.out.println("Veuillez saisir le CIN :");
        cin = scanner.nextInt();
        scanner.nextLine();
        /* System.out.println("CIN : " + cin); */
        System.out.println("Veuillez saisir le Nom :");
        Nom = scanner.nextLine();
        /* System.out.println("Nom : " + Nom); */
        System.out.println("Veuillez saisir le Prenom :");
        Prenom = scanner.nextLine();
        /* System.out.println("Prenom : " + Prenom); */
        System.out.println("Veuillez saisir le Numero de Compte :");
        NCompte = scanner.nextInt();
        /* System.out.println("Numero de Compte : " + NCompte); */
        int choix;
        do{
            System.out.println("1:consulter compte");
            System.out.println("2:deposer montant");
            System.out.println("3:Retirer montant");
            System.out.println("4:quitteer");
           
        
            choix=scanner.nextInt();
            switch(choix){
                case 1:
                    System.out.println("Nom : " + Nom); 
                    System.out.println("Prenom : " + Prenom); 
                    System.out.println("CIN : " + cin); 
                    System.out.println("Numero de compte : " + NCompte); 
                    System.out.println("Plafond de retrait : " + plafond_retrait);
                    break;
                default :
                    System.out.println("erreur"); 

            


        }
        
    }
       while(!(choix>=1 && choix<=4));
       scanner.close();
    
    }
}


