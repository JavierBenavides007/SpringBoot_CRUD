package com.entrenamientospring.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.entrenamientospring.models.Cliente;


public interface ClienteInterface extends CrudRepository<Cliente, Integer>{

}
