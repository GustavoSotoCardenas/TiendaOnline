package com.tiendaOnline.dto;

import lombok.Builder;

@Builder
public record ProductoResponseDTO (

    Long id_producto,
    String nombre_producto,
    Integer stock
){}
