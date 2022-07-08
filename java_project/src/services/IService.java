package services;

import models.Pavillon;
import models.Etudiant;
import models.Chambre;
public interface IService {

    public void ajouterPavillon(Pavillon pavillon);
    public int getPositionPavillon(int id);
    public void listerPavillon();
    //public void listerChambrePavillon (int id);
    public void supprimerPavillon(int id);

    public void ajouterEtudiant(Etudiant etudiant);
    public void ajouterChambre(Chambre Chambre);
    //public void archiverChambre(Chambre chambre);
    public void listerChambre();
}
