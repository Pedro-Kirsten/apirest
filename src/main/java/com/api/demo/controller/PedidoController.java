package com.api.demo.controller;

import com.api.demo.model.Pedido;
import com.api.demo.service.PedidoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
    @CrossOrigin
    @GetMapping("/pedidos")
    public ResponseEntity<List<Pedido>> listaPedidos(){
        return ResponseEntity.status(HttpStatus.OK).body(pedidoService.listaPedidos());
    }
    @CrossOrigin
    @GetMapping("pedido/{codpedido}")
    public ResponseEntity<Optional<Pedido>> getByIdPedido(@PathVariable Integer codpedido){
        return ResponseEntity.status(HttpStatus.OK).body(pedidoService.getByIdPedido(codpedido));
    }
    @CrossOrigin
    @PostMapping("pedido")
    public ResponseEntity<Object> salvaPedido(@RequestBody Pedido pedido){
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoService.salvaPedido(pedido));
    }
    @CrossOrigin
    @PutMapping("pedido")
    public ResponseEntity<Object> atualizaPedido(@RequestBody Pedido pedido){
        return ResponseEntity.status(HttpStatus.OK).body(pedidoService.atualizaPedido(pedido));
    }
    @CrossOrigin
    @DeleteMapping("pedido/{codpedido}")
    public ResponseEntity<String> deleteByIdPedido(@PathVariable Integer codpedido){
        pedidoService.deleteByIdPedido(codpedido);
        return ResponseEntity.status(HttpStatus.OK).body("Pedido removido com sucesso");
    }
}
