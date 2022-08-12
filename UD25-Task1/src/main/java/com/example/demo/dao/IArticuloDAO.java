package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Integer>{

}
