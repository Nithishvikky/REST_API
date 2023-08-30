package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BikeModel;
@Repository
public interface BikeRepo extends JpaRepository<BikeModel, Integer>{
	@Query(value = "select * from bike where year =:yr",nativeQuery = true)
	public List<BikeModel> getByYear(@Param("yr") int yr);
	@Query(value = "slect * from bike where year = :yr and bikename =:bn",nativeQuery = true)
	public List<BikeModel> getByYearAndName(@Param("yr")int yr,@Param("bn") String bn);
	@Query(value = "select * from bike where bikename =:bn",nativeQuery = true)
	public List<BikeModel> getByName(@Param("bn")String bn);
}
