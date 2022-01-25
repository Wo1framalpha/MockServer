package com.example.mockserver.dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "code_json", schema = "main")
@ToString
@Data
public class Json {
    @Id
    private int id;
    @Column(name = "headtrcode")
    private String headTrCode;
    @Column(name = "json")
    private String json;
}
