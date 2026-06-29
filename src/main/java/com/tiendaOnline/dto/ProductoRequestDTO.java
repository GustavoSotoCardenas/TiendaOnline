package com.tiendaOnline.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record ProductoRequestDTO (

    String nombre_producto,
    String descripcion,
    BigDecimal precio,
    Integer stock,
    String categoria
){}
