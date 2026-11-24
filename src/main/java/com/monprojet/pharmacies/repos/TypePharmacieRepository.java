package com.monprojet.pharmacies.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.monprojet.pharmacies.entities.TypePharmacie;

@RepositoryRestResource(path = "types", collectionResourceRel = "types")
@CrossOrigin("http://localhost:4200")
public interface TypePharmacieRepository extends JpaRepository<TypePharmacie, Long> {
}