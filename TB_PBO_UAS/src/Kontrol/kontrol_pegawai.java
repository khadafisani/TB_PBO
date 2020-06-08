package Kontrol;

public class kontrol_pegawai extends koneksi
{
    public kontrol_pegawai()
    {
        super();
    }
    
    public void add_pegawai(Tabel.pegawai pegawai)
    {
        String query = "insert into pegawai values "
               +"("+pegawai.get_id_pegawai()+","
               +"'"+pegawai.get_nama_pegawai()+"',"
               +"'"+pegawai.get_gender_pegawai()+"',"
               +"'"+pegawai.get_alamat_pegawai()+"',"
               +"'"+pegawai.get_email_pegawai()+"',"
               +"'"+pegawai.get_no_hp_pegawai()+"')";
       
        koneksiQuery(query);
    }
    
    public void update_pegawai(Tabel.pegawai pegawai)
    {
        String query = "update pegawai set "
                +"nama = '"+pegawai.get_nama_pegawai()+"',"
                +"gender = '"+pegawai.get_gender_pegawai()+"',"
                +"alamat = '"+pegawai.get_alamat_pegawai()+"',"
                +"email = '"+pegawai.get_email_pegawai()+"',"
                +"no_hp = '"+pegawai.get_no_hp_pegawai()+"' "
                +"where id = '"+pegawai.get_id_pegawai()+"'";
        
        koneksiQuery(query);
    }
    
    public void delete_pegawai(Tabel.pegawai pegawai)
    {
        String query = "delete from pegawai where id ="+pegawai.get_id_pegawai()+"";
        koneksiQuery(query);
    }
}