package com.tiendaOnline.service;

import com.tiendaOnline.dto.ClienteRequestDTO;
import com.tiendaOnline.dto.ClienteResponseDTO;
import java.util.List;

public interface ClienteService {

    ClienteResponseDTO crearCliente(ClienteRequestDTO request);
    List<ClienteResponseDTO> obtenerCliente();
    ClienteResponseDTO obtenerCliente(Long id);

}
