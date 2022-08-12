package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="fabricantes")
public class Fabricante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int codigo;
	@Column
	public String nombre;
	
	 @OneToMany
	    @JoinColumn(name="id")
	    private List<Articulo> articulo;

		public Fabricante() {
			
		}
		
		public Fabricante(int codigo, String nombre, List<Articulo> articulo) {
			this.codigo = codigo;
			this.nombre = nombre;
			this.articulo = articulo;
		}
		public int getCodigo() {
			return codigo;
		}
		public String getNombre() {
			return nombre;
		}
		
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
		public List<Articulo> getArticulo() {
			return articulo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setArticulo(List<Articulo> articulo) {
			this.articulo = articulo;
		}
		@Override
		public String toString() {
			return "Fabricante [codigo=" + codigo + ", nombre=" + nombre + ", articulo=" + articulo + "]";
		}
	 
	 
}
