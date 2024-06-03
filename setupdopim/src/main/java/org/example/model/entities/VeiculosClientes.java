package org.example.model.entities;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class VeiculosClientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String kilometragem;
    private LocalDate ultimaTroca;

    @OneToMany(mappedBy = "veiculosClientes", cascade = CascadeType.ALL)
    private List<VeiculosClientesMotores> veiculosClientesMotores;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;


}
