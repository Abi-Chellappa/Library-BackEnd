package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.EnglishBookEntity;


public interface EnglishBookServiceInterface 
{
    public List<EnglishBookEntity>getenglishbookDetails();
    public List<EnglishBookEntity> getAll(int id,String author);
    public void saveenglishbookDetails(EnglishBookEntity  ee);
 	public void updateenglishbookDetails(EnglishBookEntity ee);
 	public void deleteenglishbookDetails(int id);
}