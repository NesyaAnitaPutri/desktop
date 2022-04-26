/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.tugas;
import tugas.Tugas;
/**
 *

 */
public class DBHandler {
    public final Connection conn;

    public DBHandler(String driver) {
        this.conn = DBHelper.getConnection(driver);
    }
   
        

    public void addtugas(Tugas tgs) {
       String insertTgs = "INSERT INTO `tugas`(`id`, `nama_barang`, `tanggal_produksi`,`pilihan warna`,`jumlah`,`harga`)"
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement stmtInsert = conn.prepareStatement(insertTgs);
            stmtInsert.setString(1, tgs.getID());
            stmtInsert.setString(2, tgs.getNama());
            stmtInsert.setString(3, tgs.getTanggalProduksi());
            stmtInsert.setString(4, tgs.getWarna());
            stmtInsert.setString(5, tgs.getJumlah());
            stmtInsert.setString(6, tgs.getHarga());
            
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    

