package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticuloDAO;
import com.example.demo.dto.Articulo;

@Service
public class ArticuloServiceImpl {
	@Autowired
	static
	IArticuloDAO iArticuloDAO;
	
	
	public static List<Articulo> listarArticulos() {
		
		return iArticuloDAO.findAll();
	}
	
	
	public static Articulo guardarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	
	public static Articulo articuloXID(int id) {
		
		return iArticuloDAO.findById(id).get();
	}

	
	public static Articulo actualizarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	
	public static void eliminarArticulo(int id) {
		
		iArticuloDAO.deleteById(id);
		
	}
}
