package com.fitness.model;

public class FitnessModel {
	
	public String name;
	public int age;
	public String gender;
	public int weight;
	public int height;
	public String phoneNumber;
	public String diet;
	public String workout;
	public String recipes;
	
	public FitnessModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FitnessModel(String name, int age, String gender, int weight, int height, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.phoneNumber = phoneNumber;
	}

	public FitnessModel(String diet, String workout, String recipes) {
		super();
		this.diet = diet;
		this.workout = workout;
		this.recipes = recipes;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getWorkout() {
		return workout;
	}

	public void setWorkout(String workout) {
		this.workout = workout;
	}

	public String getRecipes() {
		return recipes;
	}

	public void setRecipes(String recipes) {
		this.recipes = recipes;
	}

	@Override
	public String toString() {
		return "Fitness [name=" + name + ", age=" + age + ", gender=" + gender + ", weight=" + weight + ", height="
				+ height + ", phoneNumber=" + phoneNumber + ", diet=" + diet + ", workout=" + workout + ", recipes="
				+ recipes + "]";
	}


}
