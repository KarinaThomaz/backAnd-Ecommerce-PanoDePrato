package br.com.panodepratos.panoDePrato.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_cliente")
    private Long idCliente;

    @Column(name = "ds_nome")
    private String nome;

    @Column(name = "nr_cpf")
    private Long numCpf;

    @Column(name = "ds_email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "dt_nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNasc;

    @Column(name = "ds_genero")
    private Character genero;

}
