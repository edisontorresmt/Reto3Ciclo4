package com.example.demo.servicio;

import com.example.demo.repositorio.Crud.UserCrudRepository;
import com.example.demo.repositorio.UserRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserRepositorio userRepositorio;


    public List<User> getAll()
}
