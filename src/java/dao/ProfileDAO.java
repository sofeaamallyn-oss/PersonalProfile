/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ProfileBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author user
 */
public class ProfileDAO {
    
    private String jdbcURL = "jdbc:mysql://localhost:3306/studentprofilesdb";
    private String jdbcUsername = "root";
    private String jdbcPassword = "";
    
    public Connection getConnection(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/studentprofilesdb",
                "root",
                "");
            
            System.out.println("Connected Successfully!");
        } catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        return con;
    }
    
    public int insertProfile(ProfileBean profile){
        
        int status = 0;
        
        try{
            Connection con = getConnection();
            if(con == null){
            System.out.println("Connection is NULL");
            return 0;
        }
            String sql = "INSERT INTO profile (studentID, name, programme, email, hobbies, introduction) VALUES (?,?,?,?,?,?) ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, profile.getStudentID());
            ps.setString(2, profile.getName());
            ps.setString(3, profile.getProgramme());
            ps.setString(4, profile.getEmail());
            ps.setString(5, profile.getHobbies());
            ps.setString(6, profile.getIntroduction());
            
            status = ps.executeUpdate();
            
            con.close();
        } catch (Exception e){
            System.out.println(e);
        }
        
        return status;
    }
    
    public ProfileBean searchProfile(String studentID){

    ProfileBean profile = null;

    try{

        Connection con = getConnection();

        String sql = "SELECT * FROM profile WHERE studentID=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, studentID);

        java.sql.ResultSet rs = ps.executeQuery();

        if(rs.next()){

            profile = new ProfileBean();

            profile.setStudentID(rs.getString("studentID"));
            profile.setName(rs.getString("name"));
            profile.setProgramme(rs.getString("programme"));
            profile.setEmail(rs.getString("email"));
            profile.setHobbies(rs.getString("hobbies"));
            profile.setIntroduction(rs.getString("introduction"));

        }

        con.close();

    }catch(Exception e){

        System.out.println(e);

    }

    return profile;

}
    public List<ProfileBean> viewProfiles(){

    List<ProfileBean> list = new ArrayList<>();

    try{

        Connection con = getConnection();

        String sql = "SELECT * FROM profile";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while(rs.next()){

            ProfileBean profile = new ProfileBean();

            profile.setStudentID(rs.getString("studentID"));
            profile.setName(rs.getString("name"));
            profile.setProgramme(rs.getString("programme"));
            profile.setEmail(rs.getString("email"));
            profile.setHobbies(rs.getString("hobbies"));
            profile.setIntroduction(rs.getString("introduction"));

            list.add(profile);
        }

        con.close();

    }catch(Exception e){

        System.out.println(e);

    }

    return list;
}
    
    public int updateProfile(ProfileBean profile){

    int status = 0;

    try{

        Connection con = getConnection();

        String sql = "UPDATE profile SET "
                + "name=?, "
                + "programme=?, "
                + "email=?, "
                + "hobbies=?, "
                + "introduction=? "
                + "WHERE studentID=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, profile.getName());
        ps.setString(2, profile.getProgramme());
        ps.setString(3, profile.getEmail());
        ps.setString(4, profile.getHobbies());
        ps.setString(5, profile.getIntroduction());
        ps.setString(6, profile.getStudentID());

        status = ps.executeUpdate();

        con.close();

    }catch(Exception e){

        System.out.println(e);

    }

    return status;
}
    public int deleteProfile(String studentID){

    int status = 0;

    try{

        Connection con = getConnection();

        String sql =
        "DELETE FROM profile WHERE studentID=?";

        PreparedStatement ps =
        con.prepareStatement(sql);

        ps.setString(1, studentID);

        status = ps.executeUpdate();

        con.close();

    }
    catch(Exception e){

        System.out.println(e);

    }

    return status;

}
    
}
