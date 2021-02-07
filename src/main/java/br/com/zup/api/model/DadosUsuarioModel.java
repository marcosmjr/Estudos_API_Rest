package br.com.zup.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "DadosUsuario")
public class DadosUsuarioModel {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false,length = 50)
    private String email;
    @Column(nullable = false,length = 50)
    private String numeroLoteria;


    public void setNumeroLoteria(String numeroLoteria) {
        this.numeroLoteria = numeroLoteria;
    }
}
