package com.api.demo.service;

import com.api.demo.model.Pedido;
import java.util.List;
import java.util.Optional;

public interface PedidoService {
    public Pedido salvaPedido(Pedido pedido);
    
    public List<Pedido> listaPedidos();
    
    public Optional<Pedido> getByIdPedido(Integer codPedido);
    
    public Pedido atualizaPedido(Pedido pedido);
    
    public void deleteByIdPedido(Integer codPedido);    
}
