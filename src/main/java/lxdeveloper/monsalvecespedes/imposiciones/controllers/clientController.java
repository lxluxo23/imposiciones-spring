package lxdeveloper.monsalvecespedes.imposiciones.controllers;

import lxdeveloper.monsalvecespedes.imposiciones.dtos.ClienteDTO;
import lxdeveloper.monsalvecespedes.imposiciones.models.Cliente;
import lxdeveloper.monsalvecespedes.imposiciones.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api")
public class clientController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/clients")
    public List<ClienteDTO> getClients() {
        return StreamSupport.stream(clienteRepository.findAll().spliterator(), false)
                .map(ClienteDTO::new)
                .collect(Collectors.toList());
    }
}
