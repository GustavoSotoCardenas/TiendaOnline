package com.tiendaOnline.service;

import com.tiendaOnline.dto.ClienteRequestDTO;
import com.tiendaOnline.dto.ClienteResponseDTO;
import lombok.AllArgsConstructor;
import com.tiendaOnline.mapper.ClienteMapper;
import com.tiendaOnline.model.Cliente;
import org.springframework.stereotype.Service;
import com.tiendaOnline.repository.ClienteRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService{

    private final ClienteRepository repository;
    private final ClienteMapper mapper;

    //Metodos
    @Override
    public ClienteResponseDTO crearCliente(ClienteRequestDTO request) {
        Cliente cliente = mapper.toModel(request);
        repository.save(cliente);
        return mapper.toDTO(cliente);
    }

    @Override
    public List<ClienteResponseDTO> obtenerCliente(){
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public ClienteResponseDTO obtenerCliente(Long id){
        Cliente cliente = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        return mapper.toDTO(cliente);

    }
}
