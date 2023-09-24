package com.gestion.etudiant.backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EtudiantController {

    @Autowired
    private EtudiantService service;

    @GetMapping("/etudiant")
    public List<Etudiant> getEtudiants(){

       return service.getEtudiant();
    }

    @PostMapping("etudiant/addEtudiant")
    public void addEtudiant(@RequestBody Etudiant etudiant){
        service.addEtudiant(etudiant);
    }

    @PutMapping("/etudiant/{id}/edit")
    public void updateEtudiant(@PathVariable("id") Integer id, @RequestBody Etudiant etudiant){
        service.updateEtudiant(etudiant);
    }

    @DeleteMapping("etudiant/{id}/delete")
    public void deleteEtudiant(@PathVariable("id") Integer id){
        service.deleteEtudiant(id);

    }
}
