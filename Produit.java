import java.util.Scanner;

public class Produit {
    
    //Definition des attributs

    String reference;
    String designation;
    Double PrixHT;
    int quantiteStock;

    //constructeur
    public Produit(String a,String b,Double c,int d){
        reference=a;
        designation=b;
        PrixHT=c;
        quantiteStock=d;
    }
    public double getterPrix(){
        return PrixHT;
    }
    public String getterRef(){
        return reference;
    }
    public String getterDesignation(){
        return designation;
    }
    public int getterQuantite(){
        return quantiteStock;
    }
    public void setterRef(String Ref){
        reference=Ref;
    }
    public void setterDes(String Des){
        designation=Des;
    }
    public void setterPrix(double prix){
        if(prix>0){
            PrixHT=prix;
        }

    }
    public void setterQuantite(int q){
        if(q>0){
            quantiteStock=q;
        }

    }
    
    public double CalculerValeurStock(){
        Scanner sc=new Scanner(System.in);
        double prixHT;
        int qte;
        prixHT=sc.nextDouble();
        qte=sc.nextInt();
        return prixHT*qte;

    }
    void afficher1(){
        System.out.println("la réference du produit:"+reference);
        System.out.println("la designation du produit:"+designation);
        System.out.println("le prixHt:"+PrixHT);
        System.out.println("la quantité du produit:"+quantiteStock);
        
    }
    void afficher2(){
        System.out.println("la réference du produit:"+reference);
        System.out.println("la designation du produit:"+designation);
        System.out.println("le prixHt:"+PrixHT);
        System.out.println("la quantité du produit:"+quantiteStock);
        System.out.println("valeur total du stock:"+CalculerValeurStock());
    }
    void appliquerRemise(double pourcentage){
        PrixHT=(PrixHT*pourcentage)/100;
    }
    
public static void main(String[] args) {
        Produit p=new Produit("Ref1","ordinateur",850.000,7);
        /*p.afficher();
        p.appliquerRemise(20);
        System.out.println("Aprés remise:");
        p.afficher();*/
        int choix;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("1. Afficher les détails du Produit");
            System.out.println("2. calculer valeur stock");
            System.out.println("3. Remise");
            System.out.print("donner un choix : ");

            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    p.afficher1();
                    break;

                case 2:
                    p.afficher2();
                    break;

                case 3:
                    p.appliquerRemise(choix);
                    p.afficher1();
                    break;

                default:
                    System.out.println("Choix incorrect, veuillez choisir entre 1 et 3.");
            }

        } while (choix==1 || choix==2 || choix==3);

}

}
