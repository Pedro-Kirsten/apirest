package com.api.demo.service;

import com.api.demo.model.Produto;
import com.api.demo.repository.ProdutoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    
    @Override
    public Produto salvaProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> getByIdProduto(Integer id) {
        return produtoRepository.findById(id);
    }

    @Override
    public Produto atualizaProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void deleteByIdProduto(Integer id) {
        produtoRepository.deleteById(id);
    }    
}
