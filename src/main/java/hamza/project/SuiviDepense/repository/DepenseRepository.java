package hamza.project.SuiviDepense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hamza.project.SuiviDepense.model.Depense;

@Repository
public interface DepenseRepository extends JpaRepository<Depense,Long> {

}
