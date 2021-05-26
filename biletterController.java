package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class biletterController {

    @Autowired
    BilettRepository rep;

    @PostMapping("/lagre")
    public void lagreBilett(biletter Biletter){
        rep.lagreBilett(Biletter);
    }

    @GetMapping("/hentAlle")
    public List<biletter> hentAlleBiletter(){
        return rep.hentAlleBiletter();
    }

    @GetMapping("/fjerntabel")
    public void slettAlle(){
        rep.slettAllebiletter();
    }
}
