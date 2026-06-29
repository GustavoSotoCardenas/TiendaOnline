package com.tiendaOnline.controller;

import com.tiendaOnline.dto.ProductoRequestDTO;
import com.tiendaOnline.dto.ProductoResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.tiendaOnline.service.ProductoService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/producto")
public class ProductoController {
    private final ProductoService service;

    @PostMapping
    public ProductoResponseDTO crearProducto(@RequestBody ProductoRequestDTO request){
        return service.crearProducto(request);
    }

    @GetMapping
    public List<ProductoResponseDTO> obtenerProductos(){
        return service.obtenerProducto();
    }

    @GetMapping("/{id_producto}")
    public ProductoResponseDTO buscarProducto(@PathVariable Long id_producto){
        return service.buscarProducto(id_producto);
    }

    @DeleteMapping("/id_producto")
    public ProductoResponseDTO eliminarProducto(@PathVariable Long id_producto){
        return service.eliminarProducto(id_producto);

    }
}
