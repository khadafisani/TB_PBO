package Kontrol;

public class kontrol_barang extends koneksi
{   
    public kontrol_barang()
    {
        super();
    }
    
    public void add_barang(Tabel.barang barang)
    {
        String query = "insert into barang values "
                +"('"+barang.get_id_barang()+"',"
                +"'"+barang.get_nama_barang()+"',"
                +barang.get_harga_jual_barang()+","
                +barang.get_harga_beli_barang()+","
                +barang.get_stok_barang()+","
                +"'"+barang.get_kategori_barang()+"')";
       
        koneksiQuery(query);
    }
    
    public void update_barang(Tabel.barang barang)
    {
        String query = "update barang set "
                +"nama = '"+barang.get_nama_barang()+"',"
                +"harga_jual ="+barang.get_harga_jual_barang()+","
                +"harga_beli ="+barang.get_harga_beli_barang()+","
                +"stok = "+barang.get_stok_barang()+", "
                +"kategori = '"+barang.get_kategori_barang()+"' "
                +"where id='"+barang.get_id_barang()+"'";
       
        koneksiQuery(query);
    }
    
    public void delete_barang(Tabel.barang barang)
    {
        String query = "delete from barang where id='"+barang.get_id_barang()+"'";
        koneksiQuery(query);
    }    
}