package com.api.demo.service;

import com.api.demo.model.Pessoa;
import java.util.List;
import java.util.Optional;

public interface PessoaService {
    
    public Pessoa salvaPessoa(Pessoa pessoa);
    
    public List<Pessoa> listaPessoa();
    
    public Optional<Pessoa> getByIdPessoa(Integer idpessoa);
    
    public Pessoa atualizaPessoa(Pessoa pessoa);
    
    public void deleteByIdPessoa(Integer idpessoa);    
}
