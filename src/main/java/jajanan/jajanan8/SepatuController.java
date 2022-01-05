/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jajanan.jajanan8;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Isfandiyar
 */
@CrossOrigin
@RestController
@RequestMapping("/datasepatu")
public class SepatuController {

    @Autowired
    private tokosepaturepo toko;

    @GetMapping("/toko")
    public List<Sepatu> getAllSepatu() {
        return toko.findAll();
    }

    @GetMapping("/toko/{idproduct}")
    public Sepatu getSepatubById(@PathVariable String idproduct) {
        return toko.findById(idproduct).get();
    }

    @PostMapping("/toko")
    public Sepatu saveSepatuDetails(@RequestBody Sepatu c) {
        return toko.save(c);
    }

    @PutMapping("/toko")
    public Sepatu updateSepatu(@RequestBody Sepatu c) {
        return toko.save(c);
    }

    @DeleteMapping("/toko/{idproduct}")
    public ResponseEntity<HttpStatus> deleteSepatuById(@PathVariable String idproduct) {
        toko.deleteById(idproduct);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

