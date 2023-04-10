package br.com.restapi.mysql.restapimysql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.restapi.mysql.restapimysql.entity.Contact;

public interface RepositoryContact extends JpaRepository<Contact, Long>{
    
}
