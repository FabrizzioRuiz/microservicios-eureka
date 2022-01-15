package com.fabrizzio.springboot.app.productos.models.service;

import java.util.List;

import springbootserviciocommons.models.entiy.Producto;


public interface IProductosService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
	
	public Producto save(Producto p);
	
	public void deleteById(Long id);
	
}
