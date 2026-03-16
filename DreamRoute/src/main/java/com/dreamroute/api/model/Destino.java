package com.dreamroute.api.model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String pais;
    private String tipo; // praia, montanha, cidade
    private double preco;
    private String imagem;
}