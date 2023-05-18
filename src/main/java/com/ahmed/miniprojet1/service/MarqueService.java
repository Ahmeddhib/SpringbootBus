package com.ahmed.miniprojet1.service;

import com.ahmed.miniprojet1.entities.Marque;
import org.springframework.data.domain.Page;

import java.util.List;

public interface MarqueService {

    Marque saveMarque(Marque marque);
    Marque updateMarque(Marque marque);
    void deleteMarque(Marque marque);
    void deleteMarqueById(Long idMarque);
    Marque getMarque(Long idMarque);
    List<Marque> getAllMarque();
    Page<Marque> getAllMarqueParPage(int page, int size);


    Marque findBynomMarqueAndIdMarqueNot(String nomMarque, Long idMarque);

    Marque findBynomMarque(String nomMarque);
}
