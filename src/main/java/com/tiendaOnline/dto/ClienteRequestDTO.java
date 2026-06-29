package com.tiendaOnline.dto;
import lombok.Builder;

@Builder
public record ClienteRequestDTO(
    Long id,
    String nombre,
    String apellido,
    String correo,
    String telefono,
    String direccion)
{}
