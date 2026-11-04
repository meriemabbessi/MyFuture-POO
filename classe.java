import java.util.Scanner;

public class classe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Nom;
        String Prenom;
        Double note;

        System.out.println("donner votre nom");
        Nom=sc.nextLine();
        System.out.println("donner votre prenom");
        Prenom=sc.nextLine();
        System.out.println("donner votre note");
        note=sc.nextDouble();
        
        int choix;
        do{
            System.out.println("1:Afficher les informations de l'éleve");
            System.out.println("2:Décision (réussit ou bien redoublant");
            choix=sc.nextInt();
            switch(choix){
                case 1:
                    System.out.println("Nom="+Nom);
                    System.out.println("Prenom="+Prenom);
                    System.out.println("Note="+note);
                    break;
                case 2:
                    if(note>=10){
                        System.out.println("Admis");
                    }
                    else{
                        System.out.println("redoublant");
                    }
                    break;
                default:
                    System.out.println("Choix incorrect, veuillez choisir 1 ou 2");
            }
        }
        while(choix==1 || choix==2);

    }
}
