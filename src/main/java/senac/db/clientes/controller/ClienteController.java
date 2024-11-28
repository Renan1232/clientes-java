package senac.db.clientes.controller;

import org.springframework.web.bind.annotation.*;
import senac.db.clientes.model.Cliente;
import senac.db.clientes.repository.ClienteRepository;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository repository){
        this.clienteRepository = repository;
    }


    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
}