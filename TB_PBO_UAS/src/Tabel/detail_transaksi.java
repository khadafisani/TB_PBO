package Tabel;

public class detail_transaksi 
{
    private String id, barang;
    private int total_barang;
    private double total_harga;
    
    public String get_id_detail_transaksi()
    {
        return id;
    }
    
    public void set_id_detail_transaksi(String x)
    {
        id = x;
    }
    
    public String get_barang_detail_transaksi()
    {
        return barang;
    }
    
    public void set_barang_detail_transaksi(String x)
    {
        barang = x;
    }
    
    public int get_total_barang_detail_transaksi()
    {
        return total_barang;
    }
    
    public void set_total_barang_detail_transaksi(int x)
    {
        total_barang = x;
    }
    
    public double get_total_harga_detail_transaksi()
    {
        return total_harga;
    }
    
    public void set_total_harga_detail_transaksi(double x)
    {
        total_harga = x;
    }
}
