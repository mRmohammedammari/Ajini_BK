package ma.ajini.Ajinibk.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professionnel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfessionnel;
    @Column(length =20)
    private String nomPrf;
    @Column(length =20)
    private String prenomPrf;
    @Column(length =15)
    private String sunomPrf;
    @Column(length =5)
    private String sexe;
    private String photoPrf;
    @Column(length =50)
    private String emailPrf;
    @Column(length =15)
    private String telephone1;
    @Column(length =15)
    private String telephone2;
    @Column(length =150)
    private String adresse;
    private String description;
    private int idcompte;
    private int idville;
    private int idmetier;





}
