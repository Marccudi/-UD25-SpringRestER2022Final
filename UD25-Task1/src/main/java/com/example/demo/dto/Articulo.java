package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="articulos")
public class Articulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int codigo;
	@Column
	public String nombre;
	@Column
	public int precio;
	
	@ManyToOne
	@JoinColumn(name="fab_id")
	public Fabricante fabricante;

	public Articulo() {
	}

	public Articulo(int codigo, String nombre, int precio, Fabricante fabricante) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante
				+ "]";
	}
	
	

	
	
	
}
