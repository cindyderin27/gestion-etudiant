package com.gestion.etudiant.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository repository;


    public List<Etudiant> getEtudiant(){

        return repository.findAll();

    }

    public void addEtudiant(Etudiant etudiant){
        repository.save(etudiant);
    }

    public  void updateEtudiant(Etudiant etudiant){
    repository.save(etudiant);
    }

    public void deleteEtudiant(Integer id){
    repository.deleteById(id);
    }
}

