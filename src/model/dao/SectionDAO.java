/*
 * WebApp_Project
 * model.dao.SectionDAO.java
 */
package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.SectionBean;

/**
 * m_sectionテーブルのDAOです。
 * @author Shohei Yamamoto
 */
public class SectionDAO {
    /**
     * すべての部署のリストを返します。
     * @return 従業員のリスト
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public List<SectionBean> selectAll() throws SQLException, ClassNotFoundException {

        // 部署のリスト
        List<SectionBean> sectionList = new ArrayList<SectionBean>();
        // 実行するSQL文
        String sql = "SELECT * FROM m_section ";

        // データベースへの接続
        try (Connection con = ConnectionManager.getConnection();
                Statement stmt = con.createStatement()) {

            // SQLステートメント(参照系)の実行
            ResultSet res = stmt.executeQuery(sql);

            // 結果の操作
            while (res.next()) {
                SectionBean section = new SectionBean();
                section.setSectionCode(res.getString("section_code"));
                section.setSectionName(res.getString("section_name"));
                section.setUpdateDateTime(res.getString("update_datetime"));

                sectionList.add(section);
            }
        }

        return sectionList;
    }


}
