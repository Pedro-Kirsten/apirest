package com.api.demo.service;

import com.api.demo.model.Pedido;
import com.api.demo.repository.PedidoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    
    @Override
    public Pedido salvaPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public List<Pedido> listaPedidos() {
        return pedidoRepository.findAll();
    }

    @Override
    public Optional<Pedido> getByIdPedido(Integer codPedido) {
        return pedidoRepository.findById(codPedido);
    }

    @Override
    public Pedido atualizaPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public void deleteByIdPedido(Integer codPedido) {
        pedidoRepository.deleteById(codPedido);
    }
}
