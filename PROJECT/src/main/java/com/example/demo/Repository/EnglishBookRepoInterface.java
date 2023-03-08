package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.EnglishBookEntity;

@Repository
public interface EnglishBookRepoInterface extends JpaRepository<EnglishBookEntity, Integer> 
{
	@Query(value="SELECT * FROM englishbookabi WHERE id=:id and author=:author",nativeQuery=true)
    public List<EnglishBookEntity> getAll(int id,String author);
}
