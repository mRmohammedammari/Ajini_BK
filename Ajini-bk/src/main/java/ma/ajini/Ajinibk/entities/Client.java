package ma.ajini.Ajinibk.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor @ToString
public class Client implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length =20)
    private String nom;
    @Column(length =20)
    private String prenom;
    @Column(length =150)
    private String adresse;
    @Column(length =50)
    private String email;
    @Column(length =20)
    private String surnom;
    private String description;
    @Column(length =15)
    private String telephone1;
    @Column(length =15)
    private String telephone2;
    @Column(length =5)
    private String sexe;
    private int idcompte;
    private int idmetier;
    private int idville;
    private String photos;

}
