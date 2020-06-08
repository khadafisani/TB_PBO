package Tabel;

public class barang 
{
   private String id, nama, kategori;
   private double harga_jual, harga_beli;
   private int stok;
    
    public String get_id_barang()
    {
        return id;
    }
    
    public void set_id_barang(String x)
    {
        id = x;
    }
    
    public String get_nama_barang()
    {
        return nama;
    }
    
    public void set_nama_barang(String x)
    {
        nama = x;
    }
    
    public String get_kategori_barang()
    {
        return kategori;
    }
    
    public void set_kategori_barang(String x)
    {
        kategori = x;
    }
    
    public double get_harga_jual_barang()
    {
        return harga_jual;
    }
    
    public void set_harga_jual_barang(double x)
    {
        harga_jual = x;
    }
    
    public double get_harga_beli_barang()
    {
        return harga_beli;
    }
    
    public void set_harga_beli_barang(double x)
    {
        harga_beli = x;
    }
    
    public int get_stok_barang()
    {
        return stok;
    }
    
    public void set_stok_barang(int x)
    {
        stok = x;
    }
}
