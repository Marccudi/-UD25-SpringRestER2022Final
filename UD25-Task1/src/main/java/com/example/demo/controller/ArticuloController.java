package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Articulo;
import com.example.demo.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	@Autowired
	ArticuloServiceImpl clienteServideImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return ArticuloServiceImpl.listarArticulos();
	}
	
	@GetMapping("/articulos/{id}")
	public Articulo listarArticulosXID(@PathVariable(name="id") int id){
		Articulo artxid= new Articulo();
		artxid=ArticuloServiceImpl.articuloXID(id);
		return artxid;
	}

	@PostMapping("/articulos")
	public Articulo salvararticulo(@RequestBody Articulo articulo) {
		
		return ArticuloServiceImpl.guardarArticulo(articulo);
	}
	
	
	@PutMapping("/articulos/{id}")
	public Articulo actualizarArticulo(@PathVariable(name="id")int id,@RequestBody Articulo articulo) {
		
		Articulo articulo_seleccionado= new Articulo();
		Articulo articulo_actualizado= new Articulo();
		
		articulo_seleccionado= ArticuloServiceImpl.articuloXID(id);
		
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		
		articulo_actualizado = ArticuloServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarArticulo(@PathVariable(name="id")int id) {
		ArticuloServiceImpl.eliminarArticulo(id);
	}
}
