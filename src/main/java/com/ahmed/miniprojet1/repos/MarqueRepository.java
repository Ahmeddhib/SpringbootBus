package com.ahmed.miniprojet1.repos;

import com.ahmed.miniprojet1.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path= "rest")
@CrossOrigin("http://localhost:4200")
public interface MarqueRepository extends JpaRepository<Marque, Long> {

    Marque findBynomMarqueAndIdMarqueNot(String nomMarque, Long idMarque);

    Marque findBynomMarque(String nomMarque);
}
