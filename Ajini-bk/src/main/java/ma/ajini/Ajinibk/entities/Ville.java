//package ma.ajini.Ajinibk.entities;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.io.*;
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Ville implements Serializable {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long idville;
//     private String ville;
//     @ManyToOne
//     private  Long idregion;
//
//}
package ma.ajini.Ajinibk.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "villes")
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identifiant unique pour la ville

    private String nom; // Nom de la ville

    // Relation ManyToOne avec Region
    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false) // Clé étrangère vers la région
    private Region region; // Référence à l'entité Region, remplacez "idregion" par "region"
}

