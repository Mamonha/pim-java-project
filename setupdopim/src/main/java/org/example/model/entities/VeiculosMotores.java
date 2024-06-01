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
public class VeiculosMotores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_veiculo")
    private Veiculo veiculo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_motor")
    private Motor motor;

    @ManyToOne
    @JoinColumn(name = "id_veiculo_cliente")
    private VeiculosClientes veiculosClientes;

}
