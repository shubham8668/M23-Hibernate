package com.capgemini.service;

import com.capgemini.entities.College;

public interface CollegeService 
{
	public abstract College addCollege(College college);
	public abstract College updateCollege(College college) ;
	public abstract College searchCollege(int id);
	public abstract College deleteCollege(int id);
}