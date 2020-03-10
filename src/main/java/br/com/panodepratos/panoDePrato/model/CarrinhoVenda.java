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
@Table(name = "tb_carrinho")
public class CarrinhoVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vl_frete")
    private BigDecimal vlFrete;

    @ManyToOne
    @JoinColumn(name = "cd_cliente")
    private Cliente cliente;

    private String endereco;

}
