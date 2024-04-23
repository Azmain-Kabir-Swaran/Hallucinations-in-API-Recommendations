package org.example;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.sql.SqlRowSetResultSetExtractor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ResultSet rs = null;
        ResultSetExtractor<Object> extractor = new SqlRowSetResultSetExtractor();
        try {
            Object result = extractor.extractData(rs);
            System.out.println(result);
        } catch (DataAccessException e) {
            e.printStackTrace();
        } finally {
            // handle rs if necessary
        }
    }
}