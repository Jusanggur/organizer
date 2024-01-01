package com.my.project.organizer.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataConclusao;
    private boolean isConcluida;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
}
