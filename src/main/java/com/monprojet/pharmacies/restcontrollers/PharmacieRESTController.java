package com.monprojet.pharmacies.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monprojet.pharmacies.entities.Pharmacie;
import com.monprojet.pharmacies.service.PharmacieService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PharmacieRESTController {

    @Autowired
    PharmacieService pharmacieService;

    @GetMapping()
    public List<Pharmacie> getAllPharmacies() {
        return pharmacieService.getAllPharmacies();
    }

    @GetMapping("/{id}")
    public Pharmacie getPharmacieById(@PathVariable("id") Long id) {
        return pharmacieService.getPharmacie(id);
    }

    @PostMapping()
    public Pharmacie createPharmacie(@RequestBody Pharmacie pharmacie) {
        return pharmacieService.savePharmacie(pharmacie);
    }

    @PutMapping()
    public Pharmacie updatePharmacie(@RequestBody Pharmacie pharmacie) {
        return pharmacieService.updatePharmacie(pharmacie);
    }

    @DeleteMapping("/{id}")
    public void deletePharmacie(@PathVariable("id") Long id) {
        pharmacieService.deletePharmacieById(id);
    }

    @GetMapping("/pharmaciestype/{idType}")
    public List<Pharmacie> getPharmaciesByTypeId(@PathVariable("idType") Long idType) {
        return pharmacieService.findByTypePharmacieIdType(idType);
    }
}