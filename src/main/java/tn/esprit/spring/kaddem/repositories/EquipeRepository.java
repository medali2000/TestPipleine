package tn.esprit.spring.kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.kaddem.entities.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
    

}
