package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.EnglishBookEntity;

import com.example.demo.Repository.EnglishBookRepoInterface;
@Service
public class EnglishBookService implements EnglishBookServiceInterface 
{
	@Autowired
	private EnglishBookRepoInterface er;
	@Override
	public List<EnglishBookEntity> getenglishbookDetails() {
		
		return er.findAll();
	}
	
	@Override
	public List<EnglishBookEntity> getAll(int id, String author) 
	{
		return er.getAll(id, author);
	}
    @Override
	public void saveenglishbookDetails(EnglishBookEntity ee) 
	{
		
		er.save(ee);
	}
    @Override
	public void updateenglishbookDetails(EnglishBookEntity ee) 
	{
		er.save(ee);
		
	}
    @Override
	public void deleteenglishbookDetails(int id) 
	{
		er.deleteById(id);
		
	}

	
}
