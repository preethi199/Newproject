package com.fitness.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fitness.model.FitnessModel;
import com.fitness.util.FitnessUtil;


@Service
public class FitnessDao {
	
	Connection con=FitnessUtil.getConnection();
	public boolean addUserData(FitnessModel ud) {
		// TODO Auto-generated method stub
		
		String ins="insert into details values(?,?,?,?,?,?)";
		PreparedStatement ps;
		int i = 0;
		try {
			ps = con.prepareStatement(ins);
			ps.setString(1,ud.getName());
			ps.setInt(2,ud.getAge());
			ps.setString(3,ud.getGender());
		    ps.setInt(4,ud.getWeight());
		    ps.setInt(5,ud.getHeight());
		    ps.setString(6,ud.getPhoneNumber());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0)
			return true;
		else
			return false;
	}
	
	public double calculatebmi(FitnessModel userData) {
		// TODO Auto-generated method stub
		double BMI;
		double height = userData.getHeight()*userData.getHeight();
		BMI = Double.valueOf(userData.getWeight()/height)*10000;
		String ins="insert into bmi values(?,?,?)";
		PreparedStatement ps;
		int i = 0;
		try {
			ps = con.prepareStatement(ins);
			ps.setString(1,userData.getName());
			ps.setInt(2,userData.getAge());
			ps.setDouble(3,BMI);
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			String cmd1="select * from bmi";
		PreparedStatement ps1;
		double bmivalue=0;
		try {
			ps1 = con.prepareStatement(cmd1);
			ResultSet rs = ps1.executeQuery();
			while(rs.next())
			{
				
				 bmivalue=rs.getDouble(3);
				
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
			
			return bmivalue;
		}
		else 
			return 0;
	
	}
	
	public List<FitnessModel> bmiG80(int weight){
		
		List<FitnessModel> lp=new ArrayList<FitnessModel>();
		String cmd="select * from bmiDietG80";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(cmd);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				String diet=rs.getString(1);
				String workout=rs.getString(2);
				String recipes=rs.getString(3);
				FitnessModel f=new FitnessModel(diet,workout,recipes);
				lp.add(f);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return lp;
		}
	public List<FitnessModel> bmiL80(int weight){
			
			
			List<FitnessModel> lp=new ArrayList<FitnessModel>();
			String cmd="select * from bmiDietL80";
			PreparedStatement p;
			try {
				p = con.prepareStatement(cmd);
				ResultSet rs = p.executeQuery();
				while(rs.next())
				{
					String diet=rs.getString(1);
					String workout=rs.getString(2);
					String recipes=rs.getString(3);
					FitnessModel f=new FitnessModel(diet,workout,recipes);
					lp.add(f);
				}
			} catch (SQLException e) {
				System.out.println(e);
			}
			return lp;
		
		}
	



}
