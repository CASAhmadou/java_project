package view;
import java.util.Scanner;

import models.Pavillon;
import services.IService;
import services.ServiceTableau;

public class View {
    public static void main(String[] args) throws Exception {

       // System.out.println("Hello, World!");
        IService service = new ServiceTableau();
        int choix=1;
        Scanner scan= new Scanner (System.in);
        do
        {
            System.out.println("Veuillez choisir");
            System.out.println("--------------------------------\n");
            System.out.println("1- Ajouter Pavillon");
            System.out.println("2- Lister Pavillon");
            System.out.println("3- Ajouter Chambre");
            System.out.println("4- Lister Chambre");
            System.out.println("5- archiver Chambre");
            System.out.println("6- Ajouter Etudiant");
            System.out.println("0- Quitter");
            choix= scan.nextInt();

        
        switch(choix)
        {
            case 1: 
                Pavillon pavillon = new Pavillon();
                System.out.println("Veuillez saisir le nombre d'etage");
                int etage= scan.nextInt();
                pavillon.setNbrEtages(etage);
                System.out.println("Veuillez saisir le numero du pavillon");
                int num= scan.nextInt();
                pavillon.setNumero(num);
                service.ajouterPavillon( pavillon);
            break;
            case 2: 
            service.listerPavillon();
            break;
            case 3: System.out.println("1- Chambre");
            break;
            case 4: System.out.println("1- Chambre");
            break;
            case 5: System.out.println("1- Chambre");
            break;
            case 6: System.out.println("1- Chambre");
            break;
            case 0: System.out.println("1- Chambre");
            break;
        }
    } 
    while(choix!=0);
}
}
