package com.example.mockserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class JsonQuery {
    @Autowired
    private DataSource dataSource;

    public String getJson(String code) {
        String sql = "select * from code_json where headTrCode = ?";

        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement ptmt = conn.prepareStatement(sql);
            ptmt.setString(1, code);
            ResultSet rs = ptmt.executeQuery();
            if (rs.next()) {
                return rs.getString("json");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        JsonQuery jsonQuery = new JsonQuery();
        System.out.println(jsonQuery.getJson("03020101A0006"));
    }
}
