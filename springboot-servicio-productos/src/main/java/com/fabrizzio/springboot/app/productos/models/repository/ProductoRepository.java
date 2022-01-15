package com.fabrizzio.springboot.app.productos.models.repository;

import org.springframework.data.repository.CrudRepository;

import springbootserviciocommons.models.entiy.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
