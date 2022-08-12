package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricanteDAO;
import com.example.demo.dto.Fabricante;

@Service
public class FabricanteServiceImpl {
	@Autowired
	IFabricanteDAO iFabricanteDAO;
	
	
	public List<Fabricante> listarFabricantes() {
		
		return iFabricanteDAO.findAll();
	}

	
	public Fabricante guardarFabricante(Fabricante fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	
	public Fabricante fabricanteXID(int id) {
		
		return iFabricanteDAO.findById(id).get();
	}

	
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	
	public void eliminarFabricante(int id) {
		
		iFabricanteDAO.deleteById(id);
		
	}
}
