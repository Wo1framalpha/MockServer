package com.example.mockserver.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "code_json", schema = "main")
@ToString
@Data
public class Json {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "headtrcode", nullable = false)
    private String headTrCode;
    @Column(name = "json", nullable = false)
    private String json;
}
