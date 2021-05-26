package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
public class BilettRepository {

    @Autowired
    private JdbcTemplate db;

    private Logger logger = LoggerFactory.getLogger(BilettRepository.class);
    
    // Alle objekter skal ha liten forbokstav, ellers ser det ut som en klasse med statiske metoder.
    public void lagreBilett(biletter Biletter) {
        String sql = "INSERT INTO Bilett (film, antall, fnavn, enavn, tlfnr, epost) VALUES(?,?,?,?,?,?)";

        db.update(sql,
                Biletter.getFilm(), // Ser ut som en statisk metode
                Biletter.getAntall(),
                Biletter.getfnavn(),
                Biletter.getEnavn(),
                Biletter.getTlfnr(),
                Biletter.getEpost());
    }

    public List<biletter> hentAlleBiletter(){
        String sql = "SELECT * FROM Bilett";
        List<biletter> alleBiletter = db.query(sql, new BeanPropertyRowMapper(biletter.class));

        Collections.sort(alleBiletter, new BillettComparator());

        return alleBiletter;
    }

    public void slettAllebiletter() {
        String sql = "DELETE FROM Bilett";
        db.update(sql);
    }
}
