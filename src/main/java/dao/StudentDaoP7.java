package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.DeletedStudentP7;
import model.StudentP7;
import model.UserP6;

public class StudentDaoP7 {

	public static void insertStudent(StudentP7 s)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "insert into program7(fname,lname,email,mobile,gender,password) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(5, s.getGender());
			pst.setString(6, s.getPassword());
			pst.executeUpdate();
			System.out.println("student inserted");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<StudentP7> getAllStudent()
	{
		List<StudentP7> list = new ArrayList<StudentP7>();
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from program7";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				StudentP7 s = new StudentP7();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setMobile(rs.getLong("mobile"));
				s.setGender(rs.getString("gender"));
				s.setPassword(rs.getString("password"));
				list.add(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static StudentP7 getStudentById(int id)
	{
		StudentP7 s1 = null;
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from program7 where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				s1 = new StudentP7();
				s1.setId(rs.getInt("id"));
				s1.setFname(rs.getString("fname"));
				s1.setLname(rs.getString("lname"));
				s1.setEmail(rs.getString("email"));
				s1.setMobile(rs.getLong("mobile"));
				s1.setGender(rs.getString("gender"));
				s1.setPassword(rs.getString("password"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s1;
	}
	
	public static void updateStudent(StudentP7 s)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "update program7 set fname=?,lname=?,email=?,mobile=?,gender=?,password=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(5, s.getGender());
			pst.setString(6, s.getPassword());
			pst.setInt(7, s.getId());
			pst.executeUpdate();
			System.out.println("student updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteStudent(StudentP7 s)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "delete from program7 where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, s.getId());
			pst.executeUpdate();
			System.out.println("data deleted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insertDeletedStudent(DeletedStudentP7 d)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "insert into deleted_student(fname,lname,email,mobile,gender,password) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, d.getFname());
			pst.setString(2, d.getLname());
			pst.setString(3, d.getEmail());
			pst.setLong(4, d.getMobile());
			pst.setString(5, d.getGender());
			pst.setString(6, d.getPassword());
			pst.executeUpdate();
			System.out.println("deleted student inserted");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<DeletedStudentP7> getAllDeletedStudent()
	{
		List<DeletedStudentP7> list = new ArrayList<DeletedStudentP7>();
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from deleted_student";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				DeletedStudentP7 d = new DeletedStudentP7();
				d.setId(rs.getInt("id"));
				d.setFname(rs.getString("fname"));
				d.setLname(rs.getString("lname"));
				d.setEmail(rs.getString("email"));
				d.setMobile(rs.getLong("mobile"));
				d.setGender(rs.getString("gender"));
				d.setPassword(rs.getString("password"));
				list.add(d);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
