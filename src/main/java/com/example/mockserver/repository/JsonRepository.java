package com.example.mockserver.repository;

import com.example.mockserver.entity.Json;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JsonRepository extends CrudRepository<Json, Integer> {
    @Query(value = "SELECT id, headTrCode, json FROM code_json WHERE headTrCode = ?1", nativeQuery = true)
    Json findByHeadTrCode(String headTrCode);
}
