package test.testspring.MvcLoginDAO;

import test.testspring.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class MvcMemberDAO {
    // 로그인 체크 코드
    public String loginCheck(String userid, String password) {
        String name = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DatabaseUtil.getConnection();
            String SQL = "SELECT NAME FROM member WHERE userid=? and password=?";
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, userid);
            pstmt.setString(2, password);

            rs = pstmt.executeQuery();
            if(rs.next()) {
                name = rs.getString("name");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs != null)
                    rs.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return name;
    }
}
