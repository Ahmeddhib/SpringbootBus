package com.ahmed.miniprojet1.restcontrollers;

import com.ahmed.miniprojet1.entities.Bus;
import com.ahmed.miniprojet1.entities.Marque;
import com.ahmed.miniprojet1.service.MarqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marque")
@CrossOrigin
public class MarqueRESTController {

    @Autowired
    private MarqueService marqueService;

    @RequestMapping(path = "/all",method = RequestMethod.GET)
    public List<Marque> getAllMarques() {
        return marqueService.getAllMarque();
    }

    @RequestMapping(value = "/getbyid/{idMarque}", method = RequestMethod.GET)
    public Marque getMarqueById(@PathVariable("idMarque") Long idMarque) {
        return marqueService.getMarque(idMarque);
    }

    @RequestMapping(path = "/addmar",method = RequestMethod.POST)
    public Marque saveMarque(@RequestBody Marque marque) {
        return marqueService.saveMarque(marque);
    }

    @RequestMapping(path="/updatemar",method = RequestMethod.PUT)
    public Marque updateMarque(@RequestBody Marque marque) {
        return marqueService.updateMarque(marque);
    }

    @RequestMapping(value = "/delbus/{idMarque}", method = RequestMethod.DELETE)
    public void deleteMarque(@PathVariable("idMarque") Long idMarque) {
        marqueService.deleteMarqueById(idMarque);
    }

    @RequestMapping(value = "/nomMarque/{nomMarque}", method = RequestMethod.GET)
    public Marque findByNom(@PathVariable("nomMarque") String nomMarque) {
        return marqueService.findBynomMarque(nomMarque);
    }

    @RequestMapping(value = "/nomMarque/{nomMarque}/idMarque/{idMarque}", method = RequestMethod.GET)
    public Marque findByNomAndIdMarqueNot(@PathVariable("nomMarque") String nomMarque, @PathVariable("idMarque") Long idMarque) {
        return marqueService.findBynomMarqueAndIdMarqueNot(nomMarque, idMarque);
    }





}
