package org.example.model.entities;

import lombok.*;

import javax.persistence.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class VeiculosClientesMotores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_veiculo_cliente", nullable = false)
    private VeiculosClientes veiculosClientes;

    @ManyToOne
    @JoinColumn(name = "id_veiculo_motor", nullable = false)
    private VeiculosMotores veiculosMotores;

}
