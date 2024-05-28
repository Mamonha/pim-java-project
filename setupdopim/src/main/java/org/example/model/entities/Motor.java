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
public class Motor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "motor")
    List<VeiculosMotores> veiculosMotores;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_oleo")
    Oleo oleo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_filtro")
    Filtro filtro;


}