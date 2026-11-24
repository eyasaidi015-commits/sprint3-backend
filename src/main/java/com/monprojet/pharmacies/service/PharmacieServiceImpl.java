package com.monprojet.pharmacies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monprojet.pharmacies.entities.Pharmacie;
import com.monprojet.pharmacies.repos.PharmacieRepository;

@Service
public class PharmacieServiceImpl implements PharmacieService {

    @Autowired
    PharmacieRepository pharmacieRepository;

    @Override
    public Pharmacie savePharmacie(Pharmacie p) {
        return pharmacieRepository.save(p);
    }

    @Override
    public Pharmacie updatePharmacie(Pharmacie p) {
        return pharmacieRepository.save(p);
    }

    @Override
    public void deletePharmacie(Pharmacie p) {
        pharmacieRepository.delete(p);
    }

    @Override
    public void deletePharmacieById(Long id) {
        pharmacieRepository.deleteById(id);
    }

    @Override
    public Pharmacie getPharmacie(Long id) {
        return pharmacieRepository.findById(id).get();
    }

    @Override
    public List<Pharmacie> getAllPharmacies() {
        return pharmacieRepository.findAll();
    }

    @Override
    public List<Pharmacie> findByNomPharmacieContains(String nom) {
        return pharmacieRepository.findByNomPharmacieContains(nom);
    }

    @Override
    public List<Pharmacie> findByTypePharmacieIdType(Long id) {
        return pharmacieRepository.findByTypePharmacieIdType(id);
    }
}