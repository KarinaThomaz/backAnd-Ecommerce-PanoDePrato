package br.com.panodepratos.panoDePrato.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_carrinho_item")
public class ItemCarrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String produto;


    private CarrinhoVenda carrinhoVenda;

    @Column(name = "qtd_produto")
    private Integer qtdProduto;

    @Column(name = "vl_produto")
    private BigDecimal vlProduto;

}
