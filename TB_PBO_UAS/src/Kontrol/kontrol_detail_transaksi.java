package Kontrol;

public class kontrol_detail_transaksi extends koneksi
{
    public kontrol_detail_transaksi()
    {
        super();
    }
    
    public void add_detail_transaksi(Tabel.detail_transaksi detail)
    {
        String query = "insert into detail_transaksi values "
                +"('"+detail.get_id_detail_transaksi()+"',"
                +"'"+detail.get_barang_detail_transaksi()+"',"
                +""+detail.get_total_barang_detail_transaksi()+","
                +""+detail.get_total_harga_detail_transaksi()+")";
        
        koneksiQuery(query);
    }
    
    public void update_detail_transaksi(Tabel.detail_transaksi detail)
    {
        String query = "update detail_transaksi set "
                +"barang = '"+detail.get_barang_detail_transaksi()+"',"
                +"total_barang = "+detail.get_total_barang_detail_transaksi()+","
                +"total_harga = "+detail.get_total_harga_detail_transaksi()+" "
                +"where id ='"+detail.get_id_detail_transaksi()+"'";    
    }
    
    public void delete_detail_transaksi(Tabel.detail_transaksi detail)
    {
        String query = "delete from detail_transaksi where id='"+detail.get_id_detail_transaksi()+"'";
        koneksiQuery(query);
    }
}
