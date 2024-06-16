package com.edvaldo.dev.projeto.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository ClienteRepository;

    //Metodo salvar
    public ClienteEntidade salvar(ClienteEntidade cliente ){
        return ClienteRepository.save(cliente);
    }

    //Listar todos os clientes
    public List<ClienteEntidade> listar(){
        return ClienteRepository.findAll();
    }

    //Buscar por Id
    public Optional<ClienteEntidade> buscarPorID(long id) {
        return ClienteRepository.findById(id);
    }

    //Deletar um cliente
    public void deletarPorId(Long id) {
        ClienteRepository.deleteById(id);
    }
}
