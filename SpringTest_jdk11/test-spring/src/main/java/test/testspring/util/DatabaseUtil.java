package test.testspring.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
    public static Connection getConnection() {
        try {
            //String dbURL = "jdbc:mysql://localhost:3306/{테이블명}?verifyServerCertificate=false&useSSL=true";
            String dbURL = "jdbc:mariadb://localhost:3306/cafe_test";
            String dbID = "root";
            String dbPassword = "cafe2413";
            Class.forName("org.mariadb.jdbc.Driver");

            System.out.println("MARIA DB CONNECT SUCCESS!!");
	/*
	  설정없이 그냥 실행시
	  java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
	   라는 드라이버를 찾을 수 없다는 오류가 발생합니다.
	   드라이버를 다운받은후 web-inf/lib 에 넣으면 됩니다.
	*/
            return DriverManager.getConnection(dbURL, dbID, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
        // 오류 발생시 null 값 리턴
    }
}
