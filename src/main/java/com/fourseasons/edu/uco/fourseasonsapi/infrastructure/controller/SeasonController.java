package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.controller;
import com.fourseasons.edu.uco.fourseasonsapi.application.dto.SeasonDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/inventory")
public class SeasonController {

    @GetMapping("/season/{id}")
    public ResponseEntity<SeasonDTO> findSeasonById(@RequestParam("id") Long id) {
        return ok(new SeasonDTO());
    }

    @DeleteMapping("/season/{id}")
    public ResponseEntity<SeasonDTO> deleteSeasonById(@RequestParam("id") Long id) {
        return ok(new SeasonDTO());
    }

    @PostMapping("/season")
    public ResponseEntity<SeasonDTO> createSeason() {
        return ok(new SeasonDTO());
    }

    @PutMapping("/season")
    public ResponseEntity<SeasonDTO> updateSeason() {
        return ok(new SeasonDTO());
    }

    @DeleteMapping("/seasons")
    public ResponseEntity<SeasonDTO> deleteAllSeasons() {
        return ok(new SeasonDTO());
    }

    @GetMapping("/seasons")
    public ResponseEntity<List<SeasonDTO>> getAllSeasons() {
        return ok(new ArrayList<>());
    }

}
