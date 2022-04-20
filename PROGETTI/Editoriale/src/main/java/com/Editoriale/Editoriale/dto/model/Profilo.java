package com.Editoriale.Editoriale.dto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.FetchType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Profilo {
    public enum Usertype {
        ADMIN, USER
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = true)
    private String nome;

    @Column(nullable = true)
    private String cognome;

    @Column(nullable = true)
    private String indirizzo;

    @Column(nullable = true)
    private String Stelle;

    @Enumerated(EnumType.STRING)
    private Usertype usertype;
    // carico io dati solo se richiesti
    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "idProfilo", referencedColumnName = "id")
    // creo una colonna di nome idProfilo e la collego allid della seconda tab
    private Profilo profilo;

}
