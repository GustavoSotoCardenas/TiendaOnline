package com.tiendaOnline.service;

import com.tiendaOnline.dto.ProductoRequestDTO;
import com.tiendaOnline.dto.ProductoResponseDTO;
import lombok.AllArgsConstructor;
import com.tiendaOnline.mapper.ProductoMapper;
import com.tiendaOnline.model.Producto;
import org.springframework.stereotype.Service;
import com.tiendaOnline.repository.ProductoRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductoServiceImpl implements ProductoService{

    private final ProductoRepository repository;
    private final ProductoMapper mapper;

    //Metodos
    @Override
    public ProductoResponseDTO crearProducto(ProductoRequestDTO request){
        Producto producto = mapper.toModel(request);
        repository.save(producto);
        return mapper.toDTO(producto);
    }

    @Override
    public List<ProductoResponseDTO> obtenerProducto(){
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public ProductoResponseDTO buscarProducto(Long id_producto){
        Producto producto = repository.findById(id_producto)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        return mapper.toDTO(producto);
    }

    @Override
    public ProductoResponseDTO eliminarProducto(Long id_producto){
        Producto producto = repository.findById(id_producto)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        repository.delete(producto);
        return mapper.toDTO(producto);
    }
}
