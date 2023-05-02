package com.api.demo.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpedido")
    private Integer idpedido;
    
    @ManyToOne
    @JoinColumn(name = "idpessoa", referencedColumnName = "idpessoa")
    private Pessoa pessoa;
    
    @Column(name = "valortotal")
    private double valortotal;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idpedido")
    private List<PedidoProduto> itensPedido;

    public Pedido() {
    }

    public Pedido(Integer id, Pessoa pessoa, double valortotal, List<PedidoProduto> itensPedido) {
        this.idpedido = idpedido;
        this.pessoa = pessoa;
        this.valortotal = valortotal;
        this.itensPedido = itensPedido;
    }

    public Integer getIdProduto() {
        return idpedido;
    }

    public void setIdProduto(Integer idpedido) {
        this.idpedido = idpedido;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public List<PedidoProduto> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<PedidoProduto> itensPedido) {
        this.itensPedido = itensPedido;
    }


    

}
