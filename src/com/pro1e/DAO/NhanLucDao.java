/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pro1e.DAO;


import com.pro1e.helper.JDBChelper;
import duan1.model.HauCan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Admin
 */
public class NhanLucDao implements DAOhelper<HauCan, Integer> {
     private final String insert_sql = "INSERT INTO HAUCAN VALUES(?,?,?,?)";
    private final String update_sql = "UPDATE HAUCAN SET TENBP = ? , TENNGUOILH =? , EMAIL = ? , DTHOAI =? WHERE IDHAUCAN =? ";
    private final String delete_sql ="delete from HAUCAN where IDHAUCAN =?";
    private final String select_all = "select * from HAUCAN";
    private final String select_byid = "select * from HAUCAN where IDHAUCAN =?";
    @Override
    public int insert(HauCan e) {
        return JDBChelper.update(insert_sql, e.getTenBP(),e.getTenNguoiLH(),e.getEmail(),e.getDienThoai());
    }

    @Override
    public int update(HauCan e) {
        return JDBChelper.update(update_sql, e.getTenBP(),e.getTenNguoiLH(),e.getEmail(),e.getDienThoai(),e.getIDHauCan());
    }

    @Override
    public int delete(Integer id) {
         return JDBChelper.update(delete_sql, id);
    }

    @Override
    public List<HauCan> selectall() {
        return selectbySQL(select_all);
    }

    @Override
    public HauCan selectbyID(Integer id) {
        List<HauCan> nv = selectbySQL(select_byid, id);
        return nv.get(0);
    }

    @Override
    public List<HauCan> selectbySQL(String sql, Object... args) {
         List<HauCan> lsv = new ArrayList<>();
        try {
            ResultSet rs = JDBChelper.query(sql, args);
            while (rs.next()) {
                lsv.add(new HauCan(rs.getInt("IDHAUCAN"), rs.getString("TENBP"),rs.getString("TENNGUOILH"), rs.getString("EMAIL"), rs.getString("DTHOAI")));
            }
            rs.getStatement().getConnection().close();
            return lsv;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
    
}
