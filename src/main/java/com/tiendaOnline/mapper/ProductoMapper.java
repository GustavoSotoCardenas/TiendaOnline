package com.tiendaOnline.mapper;

import com.tiendaOnline.dto.ProductoRequestDTO;
import com.tiendaOnline.dto.ProductoResponseDTO;
import com.tiendaOnline.model.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {

    public Producto toModel(ProductoRequestDTO request){

        Producto producto = new Producto();
        producto.setNombre_producto(request.nombre_producto());
        producto.setDescripcion(request.descripcion());
        producto.setPrecio(request.precio());
        producto.setCategoria(request.categoria());
        producto.setStock(request.stock());
        return producto;
    }

    public ProductoResponseDTO toDTO(Producto producto){
        return ProductoResponseDTO.builder()
                .id_producto(producto.getId_producto())
                .nombre_producto(producto.getNombre_producto())
                .stock(producto.getStock())
                .build();
    }
}
