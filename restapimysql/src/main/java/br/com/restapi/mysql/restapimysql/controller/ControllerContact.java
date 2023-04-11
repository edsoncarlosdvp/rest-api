package br.com.restapi.mysql.restapimysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.restapi.mysql.restapimysql.Repository.RepositoryContact;
import br.com.restapi.mysql.restapimysql.entity.Contact;

@RestController
@RequestMapping("/contato")
public class ControllerContact {
    
    @Autowired
    private RepositoryContact repository;

    @GetMapping
    public List<Contact> list() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Contact contact) {
        repository.save(contact);
    }

    @PutMapping
    public void edit(@RequestBody Contact contact) {
        if (contact.getId() > 0)
            repository.save(contact);
    }
    
    @DeleteMapping
    public void delete(@RequestBody Contact contact) {
        repository.delete(contact);
    }
}
