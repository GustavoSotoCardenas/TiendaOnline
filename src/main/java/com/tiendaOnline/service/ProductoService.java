package com.tiendaOnline.service;


import com.tiendaOnline.dto.ProductoRequestDTO;
import com.tiendaOnline.dto.ProductoResponseDTO;
import java.util.List;

public interface ProductoService {

    ProductoResponseDTO crearProducto(ProductoRequestDTO request);
    List<ProductoResponseDTO> obtenerProducto();
    ProductoResponseDTO buscarProducto(Long id_producto);
    ProductoResponseDTO eliminarProducto(Long id_producto);
}
