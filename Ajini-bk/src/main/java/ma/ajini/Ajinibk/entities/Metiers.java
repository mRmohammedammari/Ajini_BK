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
@AllArgsConstructor
@ToString
public class Metiers implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(length = 35)
    private String Labelle;

}
