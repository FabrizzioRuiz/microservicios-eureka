package com.fabrizzio.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springbootserviciocommons.models.entiy.Producto;
import com.fabrizzio.springboot.app.productos.models.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements IProductosService{
	
	@Autowired
	private ProductoRepository productoRepository;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoRepository.findAll();
	}


	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Producto save(Producto p) {
		return productoRepository.save(p);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		productoRepository.deleteById(id);
	}

}
