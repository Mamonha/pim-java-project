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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_veiculo", nullable = false)
    private Veiculo veiculo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_motor", nullable = false)
    private Motor motor;

    @OneToMany(mappedBy = "veiculosMotores", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<VeiculosClientesMotores> veiculosClientesMotores;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public List<VeiculosClientesMotores> getVeiculosClientesMotores() {
        return veiculosClientesMotores;
    }

    public void setVeiculosClientesMotores(List<VeiculosClientesMotores> veiculosClientesMotores) {
        this.veiculosClientesMotores = veiculosClientesMotores;
    }
}
