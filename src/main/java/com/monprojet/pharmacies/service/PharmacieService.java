package com.monprojet.pharmacies.service;

import java.util.List;

import com.monprojet.pharmacies.entities.Pharmacie;

public interface PharmacieService {
    Pharmacie savePharmacie(Pharmacie p);
    Pharmacie updatePharmacie(Pharmacie p);
    void deletePharmacie(Pharmacie p);
    void deletePharmacieById(Long id);
    Pharmacie getPharmacie(Long id);
    List<Pharmacie> getAllPharmacies();
    List<Pharmacie> findByNomPharmacieContains(String nom);
    List<Pharmacie> findByTypePharmacieIdType(Long id);
}