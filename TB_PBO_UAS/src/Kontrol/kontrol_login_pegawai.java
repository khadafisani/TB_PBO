package Kontrol;

import java.sql.*;
import javax.swing.JOptionPane;

public class kontrol_login_pegawai extends koneksi 
{
    public kontrol_login_pegawai()
    {
        super();
    }

    
    public void add_login_pegawai(Tabel.login_pegawai login)
    {
        String query = "insert into login_pegawai values "
                +"("+login.get_id_login_pegawai()+","
                +"'"+login.get_username_login_pegawai()+"',"
                +"'"+login.get_password_login_pegawai()+"',"
                +"'"+login.get_kategori_login_pegawai()+"')";
        
        koneksiQuery(query);
    }
    
    public void update_login_pegawai(Tabel.login_pegawai login)
    {
        String query ="update login_pegawai set "
                +"username = '"+login.get_username_login_pegawai()+"',"
                +"password = '"+login.get_password_login_pegawai()+"', "
                +"kategori = '"+login.get_kategori_login_pegawai()+"' "
                +"where id ="+login.get_id_login_pegawai()+"";
        
        koneksiQuery(query);
    }
    
    public void delete_login_pegawai(Tabel.login_pegawai login)
    {
        String query = "delete from login_pegawai where id = "+login.get_id_login_pegawai()+"";
        koneksiQuery(query);
    }
    
    public ResultSet select_login_pegawai(Tabel.login_pegawai login)
    {    
        try
        {
            String query = "select * from login_pegawai where "
                + "username ='"+login.get_username_login_pegawai()+"' "
                + "and password = '"+login.get_password_login_pegawai()+"'";
       
            rs = execQuery(query);  
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Username atau password salah "+e);
        }
        
        return rs;
    }
    
    public ResultSet ganti_password_login_pegawai(Tabel.login_pegawai ganti)
    {
        try
        {
            String query = "select * from login_pegawai where username = '"+ganti.get_username_login_pegawai()+"'";
            rs = execQuery(query);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Password lama salah "+ex);
        }
        return rs;
    }
}
