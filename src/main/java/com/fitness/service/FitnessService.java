package com.fitness.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fitness.dao.FitnessDao;
import com.fitness.model.FitnessModel;


@Service
public class FitnessService {
	
	public boolean addUserData(FitnessModel userData) {
		// TODO Auto-generated method stub
		FitnessDao ud=new FitnessDao();
		boolean flag=ud.addUserData(userData);
		return flag;
		
	}

	public double calculatebmi(FitnessModel userData) {
		// TODO Auto-generated method stub
		FitnessDao f=new FitnessDao();
		double bmi=f.calculatebmi(userData);
		return bmi;
	}

	public List<FitnessModel> bmiG80(int weight) {
		
		FitnessDao f=new FitnessDao();
		List<FitnessModel> lf=f.bmiG80(weight);
		return lf;
	}

	public List<FitnessModel> bmiL80(int weight) {
		
		FitnessDao f=new FitnessDao();
		List<FitnessModel> lf=f.bmiL80(weight);
		return lf;
	}


}
