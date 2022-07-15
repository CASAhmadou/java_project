package services;

import models.Pavillon;
import models.Etudiant;
import models.Chambre;
public interface IService {

    public void ajouterPavillon(Pavillon pavillon);
    public void supprimerPavillon(int id);
    public Pavillon getPavillonById(int id);
    public void affecterChambrePav();
    public void listerPavillon();

    public void ajouterEtudiant(Etudiant etudiant);
    public void listerEtudiant();
    public void affecterChambreBoursier();

    public void ajouterChambre(Chambre Chambre);
    public void listerChambre();
    public void archiverChambre(int id);


}