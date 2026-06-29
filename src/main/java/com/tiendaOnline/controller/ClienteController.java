package com.tiendaOnline.controller;


import com.tiendaOnline.dto.ClienteRequestDTO;
import com.tiendaOnline.dto.ClienteResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.tiendaOnline.service.ClienteService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService service;

    @PostMapping
    public ClienteResponseDTO crearCliente(@RequestBody ClienteRequestDTO request){
        return service.crearCliente(request);
    }

    @GetMapping
    public List<ClienteResponseDTO> obtenerClientes(){
        return service.obtenerCliente();
    }

    @GetMapping("/{id_cliente}")
    public ClienteResponseDTO obtenerCliente(@PathVariable Long id){
        return service.obtenerCliente(id);
    }

}
