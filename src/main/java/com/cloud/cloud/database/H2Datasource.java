//package com.cloud.cloud.database;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//@Component
//public class H2Datasource {
//
//    @Bean
//    public String configDatabase() {
//        try {
//            Class.forName("org.h2.Driver").newInstance();
//            Connection conn = DriverManager.getConnection("jdbc:h2:test",
//                    "sa", "");
//            Statement st = null;
//            st = conn.createStatement();
//            st.execute("INSERT INTO TEST VALUES(default,'HELLO')");
//            st.execute("INSERT INTO TEST(NAME) VALUES('JOHN')");
//            String name1 = "Jack";
//            String q = "insert into TEST(name) values(?)";
//            PreparedStatement st1 = null;
//
//            st1 = conn.prepareStatement(q);
//            st1.setString(1, name1);
//            st1.execute();
//
//            ResultSet result;
//            result = st.executeQuery("SELECT * FROM TEST");
//            while (result.next()) {
//                String name = result.getString("NAME");
//                System.out.println(result.getString("ID")+" "+name);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return  null;
//    }
//}
