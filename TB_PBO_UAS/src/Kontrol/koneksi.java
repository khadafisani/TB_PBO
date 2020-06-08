package Kontrol;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi 
{
    public Connection con;
    public ResultSet rs;
    public Statement st;
    public koneksi()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_tb", "root", "");
            st = con.createStatement();
            System.out.println("Terhubung kedatabase");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Gagal terhubung ke database"+e);
        }
    }
    
    public void koneksiQuery(String query)
    {
        try
       {
           st.executeUpdate(query);
           System.out.println("Query Berhasil dieksekusi");
       }
       catch(HeadlessException | SQLException e)
       {
           JOptionPane.showMessageDialog(null, "Aksi gagal dieksekusi \n error:"+e);
       } 
    }
    
    public ResultSet execQuery(String sql)throws SQLException
    {
        try
        {
            rs = st.executeQuery(sql);
            System.out.println("Query Berhasil dieksekusi");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Aksi gagal dieksekusi \n error:"+e);
        }       
        return rs;
    }
}