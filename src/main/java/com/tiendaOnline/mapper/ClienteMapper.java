package com.tiendaOnline.mapper;

import com.tiendaOnline.dto.ClienteRequestDTO;
import com.tiendaOnline.dto.ClienteResponseDTO;
import com.tiendaOnline.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public Cliente toModel(ClienteRequestDTO request){

        Cliente cliente = new Cliente();

        cliente.setNombre(request.nombre());
        cliente.setApellido(request.apellido());
        cliente.setCorreo(request.correo());
        cliente.setTelefono(request.telefono());
        cliente.setDireccion(request.direccion());
        return  cliente;
    }

    public ClienteResponseDTO toDTO(Cliente cliente){
        return ClienteResponseDTO.builder()
                .id_cliente(cliente.getId())
                .nombre(cliente.getNombre())
                .correo(cliente.getCorreo())
                .build();
    }
}
