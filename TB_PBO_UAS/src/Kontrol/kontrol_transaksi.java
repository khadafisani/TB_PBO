package Kontrol;

public class kontrol_transaksi extends koneksi
{
    public kontrol_transaksi()
    {
        super();
    }
    
    public void add_transaksi(Tabel.transaksi transaksi)
    {
        String query = "insert into transaksi values"
                +"('"+transaksi.get_id_transaksi()+"',"
                +"'"+transaksi.get_tanggal_transaksi()+"',"
                +transaksi.get_total_transaksi_transaksi()+","
                +transaksi.get_total_bayar_transaksi()+","
                +"'"+transaksi.get_pegawai_transaksi()+"')";
        
        koneksiQuery(query);
    }
    
    public void update_transaksi(Tabel.transaksi transaksi)
    {
        String query = "update transaksi set "
                +"tanggal ='"+transaksi.get_tanggal_transaksi()+"',"
                +"total_transaksi="+transaksi.get_total_transaksi_transaksi()+","
                +"total_bayar="+transaksi.get_total_bayar_transaksi()+","
                +"pegawai='"+transaksi.get_pegawai_transaksi()+"' "
                +"where id ='"+transaksi.get_id_transaksi()+"'";
        
        koneksiQuery(query);
    }
    
    public void delete_transaksi(Tabel.transaksi transaksi)
    {
        String query ="delete from transaksi where id='"+transaksi.get_id_transaksi()+"'";
        koneksiQuery(query);
    }
}
