package hamza.project.SuiviDepense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hamza.project.SuiviDepense.model.Depense;
import hamza.project.SuiviDepense.service.DepenseService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class DepenseController {
	
	@Autowired
	DepenseService depenseService;
	
	@GetMapping("/depenses")
	public ResponseEntity<List<Depense>> get() {
		List<Depense> depenses = depenseService.findAll();
		return new ResponseEntity<List<Depense>>(depenses, HttpStatus.OK);
	}
	
	@PostMapping("/depenses/add")
	public ResponseEntity<Depense> save(@RequestBody Depense depense) {
		Depense depenseOne = depenseService.save(depense);
		return new ResponseEntity<Depense>(depenseOne, HttpStatus.OK);
	}
	
	@GetMapping("/depenses/{id}")
	public ResponseEntity<Depense> get(@PathVariable("id") Long id) {
		Depense depense = depenseService.findById(id);
		return new ResponseEntity<Depense>(depense, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/depenses/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		depenseService.delete(id);
		return new ResponseEntity<String>("Depense is deleted successfully!", HttpStatus.OK);
	}

}
