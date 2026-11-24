package com.monprojet.pharmacies.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.monprojet.pharmacies.entities.Pharmacie;

@RepositoryRestResource(path = "rest")
@CrossOrigin("http://localhost:4200")
public interface PharmacieRepository extends JpaRepository<Pharmacie, Long> {

    List<Pharmacie> findByNomPharmacieContains(String nom);

    List<Pharmacie> findByTypePharmacieIdType(Long id);
}