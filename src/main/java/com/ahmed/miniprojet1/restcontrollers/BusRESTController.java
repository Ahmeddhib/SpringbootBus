package com.ahmed.miniprojet1.restcontrollers;

import com.ahmed.miniprojet1.dto.BusDTO;
import com.ahmed.miniprojet1.entities.Bus;
import com.ahmed.miniprojet1.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BusRESTController {

        @Autowired
        BusService busService;

        @RequestMapping(path="all" ,method = RequestMethod.GET)
        public List<Bus> getAllBus() {
            return busService.getAllBus();
        }

        @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
        public BusDTO getBusById(@PathVariable("id") Long id) {
            return busService.getBus(id);
        }

        @RequestMapping(path="/addbus",method = RequestMethod.POST)
         public BusDTO saveBus(@RequestBody BusDTO busDTO) {
        return busService.saveBus(busDTO);
    }

        @RequestMapping(path="/updatebus",method = RequestMethod.PUT)
        public BusDTO updateBus(@RequestBody BusDTO busDTO) {
        return busService.updateBus(busDTO);
    }

    @RequestMapping(value = "/delbus/{id}", method = RequestMethod.DELETE)
    public void deleteBus(@PathVariable("id") Long id) {
        busService.deleteBusById(id);
    }

    @RequestMapping(value = "/busmarque/{idMarque}", method = RequestMethod.GET)
    public List<Bus> findByMarqueIdMarque(@PathVariable("idMarque") Long idMarque) {
        return busService.findByMarqueIdMarque(idMarque);
    }

}



