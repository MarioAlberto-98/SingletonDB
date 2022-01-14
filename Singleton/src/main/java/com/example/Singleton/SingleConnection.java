package com.example.Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingleConnection {

    // Propiedades
    private static Connection conn = null;
    private String driver;
    private String url;
    private String usuario;
    private String password;

    // Constructor
    private SingleConnection(){

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String driver = " oracle.jdbc.driver.OracleDriver";
        String usuario = "system";
        String password = "12345";

        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, password);
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    } // Fin constructor

    // Métodos
    public static Connection getConnection(){

        if (conn == null){
            new SingleConnection();
        }

        return conn;
    } // Fin getConnection




}
