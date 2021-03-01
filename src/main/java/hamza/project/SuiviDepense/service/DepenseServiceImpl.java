package hamza.project.SuiviDepense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hamza.project.SuiviDepense.model.Depense;
import hamza.project.SuiviDepense.repository.DepenseRepository;

@Service
public class DepenseServiceImpl implements DepenseService {
	
	@Autowired
	DepenseRepository depenseRepository;

	@Override
	public List<Depense> findAll() {
		return depenseRepository.findAll();
	}

	public Depense save(Depense depense) {
		depenseRepository.save(depense);
		return depense;
	}

	@Override
	public Depense findById(Long id) {
		if(depenseRepository.findById(id).isPresent()){
			return depenseRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		Depense depense = findById(id);
		depenseRepository.delete(depense);
		
	}

}
