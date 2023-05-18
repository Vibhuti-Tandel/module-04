package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.UserP6;

public class UserDaoP6 {
	
	public static void insertUser(UserP6 u)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "insert into program6(fname,lname,mobile,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setLong(3, u.getMobile());
			pst.setString(4, u.getEmail());
			pst.setString(5, u.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<UserP6> getAllUser()
	{
		List<UserP6> list = new ArrayList<UserP6>();
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from program6";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				UserP6 u = new UserP6();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setMobile(rs.getLong("mobile"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				list.add(u);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static UserP6 getUserById(int id)
	{
		UserP6 u1 = null;
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from program6 where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				u1 = new UserP6();
				u1.setId(rs.getInt("id"));
				u1.setFname(rs.getString("fname"));
				u1.setLname(rs.getString("lname"));
				u1.setMobile(rs.getLong("mobile"));
				u1.setEmail(rs.getString("email"));
				u1.setPassword(rs.getString("password"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u1;
	}
	
	public static void updateUser(UserP6 u)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "update program6 set fname=?,lname=?,mobile=?,email=?,password=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setLong(3, u.getMobile());
			pst.setString(4, u.getEmail());
			pst.setString(5, u.getPassword());
			pst.setInt(6, u.getId());
			pst.executeUpdate();
			System.out.println("data updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteUser(UserP6 u)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "delete from program6 where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, u.getId());
			pst.executeUpdate();
			System.out.println("data deleted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
