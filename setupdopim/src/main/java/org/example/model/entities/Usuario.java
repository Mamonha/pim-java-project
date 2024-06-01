package org.example.model.entities;



import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(indexes = {
        @Index(name = "idx_login", columnList = "login")
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String login;
    private String senha;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Cliente> clientes;
}
