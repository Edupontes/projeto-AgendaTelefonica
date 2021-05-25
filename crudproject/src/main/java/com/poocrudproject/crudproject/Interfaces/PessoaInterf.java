package com.poocrudproject.crudproject.Interfaces;

import com.poocrudproject.crudproject.Model.Pessoa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * PessoaInterf
 */
@Repository
public interface PessoaInterf extends CrudRepository<Pessoa, Integer>{

}
