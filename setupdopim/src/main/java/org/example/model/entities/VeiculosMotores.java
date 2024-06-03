package org.example.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "id_veiculo", nullable = false)
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "id_motor", nullable = false)
    private Motor motor;

    @OneToMany(mappedBy = "veiculosMotores", cascade = CascadeType.ALL)
    private List<VeiculosClientesMotores> veiculosClientesMotores;

}
