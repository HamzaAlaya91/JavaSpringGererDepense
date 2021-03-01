package hamza.project.SuiviDepense.service;

import java.util.List;

import hamza.project.SuiviDepense.model.Depense;

public interface DepenseService {
	
	
	List<Depense> findAll();
	
	Depense save(Depense depense);
	
	Depense findById(Long Id);
	
	void delete(Long id);

}
