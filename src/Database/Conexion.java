/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.*;

/**
 *
 * @author PC
 */
public class Conexion {
    public static Connection SQLSERVER2017() throws ClassNotFoundException, SQLException 
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");        
        String url = "jdbc:sqlserver:// localhost:1433; databaseName = DBCINE";       
        return DriverManager.getConnection(url,"sa","db_data_123");
    } 
}
