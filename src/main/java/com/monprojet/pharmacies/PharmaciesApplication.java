package com.monprojet.pharmacies;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.monprojet.pharmacies.entities.Pharmacie;
import com.monprojet.pharmacies.entities.TypePharmacie;
import com.monprojet.pharmacies.repos.PharmacieRepository;
import com.monprojet.pharmacies.repos.TypePharmacieRepository;

@SpringBootApplication
public class PharmaciesApplication implements CommandLineRunner {

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    @Autowired
    private TypePharmacieRepository typeRepository;

    @Autowired
    private PharmacieRepository pharmacieRepository;

    public static void main(String[] args) {
        SpringApplication.run(PharmaciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Pharmacie.class, TypePharmacie.class);

        if (typeRepository.count() == 0) {
            TypePharmacie jour = typeRepository.save(new TypePharmacie(null, "Pharmacie de jour", null));
            TypePharmacie nuit = typeRepository.save(new TypePharmacie(null, "Pharmacie de nuit", null));
            TypePharmacie para = typeRepository.save(new TypePharmacie(null, "Parapharmacie", null));

            pharmacieRepository.save(new Pharmacie(null, "Pharmacie dr. Hajer Missaoui",
                    "En face clinique Les Violettes, résidence Ines Av. Dali Jazi, Nabeul",
                    "50 930 930", Date.valueOf("2015-03-12"), jour));
            pharmacieRepository.save(new Pharmacie(null, "Pharmacie De Nuit AMIRA BEN JANNET",
                    "Avenue Elgarci, Boucharray, Nabeul",
                    "70 314 335", Date.valueOf("2018-09-01"), nuit));
            pharmacieRepository.save(new Pharmacie(null, "Pharmacie Les Jasmins",
                    "Centre Médical Eya, près Clinique el Amen, Av. Hédi Nouira, Nabeul",
                    "72 270 840", Date.valueOf("2021-06-20"), jour));
            pharmacieRepository.save(new Pharmacie(null, "Parapharmacie ...",
                    "..., Nabeul",
                    "72 000 000", Date.valueOf("2019-11-05"), para));
        }
    }
}