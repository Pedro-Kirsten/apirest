package com.api.demo.service;

import com.api.demo.model.Pessoa;
import com.api.demo.repository.PessoaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService{
    
    @Autowired
    private PessoaRepository pessoaRepository;
    
    @Override
    public Pessoa salvaPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public List<Pessoa> listaPessoa() {
        return pessoaRepository.findAll();
    }

    @Override
    public Optional<Pessoa> getByIdPessoa(Integer id) {
        return pessoaRepository.findById(id)
                ;
    }

    @Override
    public Pessoa atualizaPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public void deleteByIdPessoa(Integer idpessoa) {
        pessoaRepository.deleteById(idpessoa);
    }
    
}
