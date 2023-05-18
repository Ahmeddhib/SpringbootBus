package com.ahmed.miniprojet1.service;

import com.ahmed.miniprojet1.dto.BusDTO;
import com.ahmed.miniprojet1.entities.Bus;
import com.ahmed.miniprojet1.entities.Marque;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BusService {

    BusDTO saveBus(BusDTO bus);
    BusDTO updateBus(BusDTO bus);
    void deleteBus(Bus bus);
    void deleteBusById(Long id);
    BusDTO getBus(Long id);
    List<BusDTO> getAllBuses();
    Page<Bus> getAllBusParPage(int page, int size);

    List<Bus> getAllBus();
    List<Bus> findByTypeBus(String typeBus);
    List<Bus> findByTypeBusContains(String typeBus);

    List<Bus> findByTypeBusCouleur (String typeBus, String couleur);

    List<Bus> findByMarque (Marque marque);
    List<Bus> findByMarqueIdMarque(Long id);

    List<Bus> findByOrderByTypeBusAsc();

    List<Bus> trierBusTypeBusCouleur ();

    List<Marque> getAllMarque();
    BusDTO convertEntityToDto (Bus bus);
    Bus convertDtoToEntity(BusDTO busDTO);
}
