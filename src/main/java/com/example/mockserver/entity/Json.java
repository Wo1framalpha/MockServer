package com.example.mockserver.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "json", schema = "main")
@ToString
@Data
public class Json {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "code", nullable = false)
    private String code;
    @Column(name = "json", nullable = false)
    private String json;
    @CreatedDate
    private Timestamp createTime;
    @LastModifiedDate
    private Timestamp updateTime;
}
