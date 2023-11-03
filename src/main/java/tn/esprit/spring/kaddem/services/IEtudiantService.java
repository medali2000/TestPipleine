package tn.esprit.spring.kaddem.services;

import org.springframework.data.repository.query.Param;
import tn.esprit.spring.kaddem.entities.Etudiant;
import tn.esprit.spring.kaddem.entities.Niveau;
import tn.esprit.spring.kaddem.entities.Specialite;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    Etudiant retrieveEtudiant(Integer idEtudiant);
    void removeEtudiant(Integer idEtudiant);

    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) ;

    List<Etudiant> findByDepartementIdDepartement(Integer idDepartement);

    List<Etudiant> findByEquipesNiveau(Niveau niveau);

    //JPQL
    List<Etudiant> retrieveEtudiantsByContratSpecialite(Specialite specialite);

    List<Etudiant> retrieveEtudiantsByContratSpecialiteSQL(String specialite);

    Etudiant addAndAssignEtudiantToEquipeAndContract (Etudiant e, Integer idContrat , Integer idEquipe);

    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);

}
