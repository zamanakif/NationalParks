package edu.mongodb.nps.NationalParks.controller;


import edu.mongodb.nps.NationalParks.model.NP;
import edu.mongodb.nps.NationalParks.model.NPList;
import edu.mongodb.nps.NationalParks.service.NPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping("/nps")
public class NPController {

    @Autowired
    private NPService npService;

    @GetMapping("/hello")
    public String testHello() {
        return "Hello MongoDB NPs";
    }

    @GetMapping("/{id}")
    public NP getParkWithId(@PathVariable("id") String number) {
        return npService.getNPWithId(number);
    }

    /*
    @GetMapping("/{number}")
    public NP getParkByChrono(@PathVariable("number") Integer num) {
        System.out.println("Number passed is " + num);
        return npService.getNPsByNumber(num);
    }
    */

    @GetMapping("/")
    public List<NP> getAllNPs() {
        return npService.getAllNPs();
    }

    @GetMapping("/list/states/{stateCd}")
    public NPList getNPsInState(@PathVariable("stateCd") String stateCd) {
        return npService.getNPsInState(stateCd);
    }

    @PostMapping("/")
    public NP createNewNP(@RequestBody NP newNP) {
        return npService.createNewNP(newNP);
    }

}
