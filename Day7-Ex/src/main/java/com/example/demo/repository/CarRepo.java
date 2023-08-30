package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {
	@Query(value="select * from cartable where owners=:own", nativeQuery = true)
	public List<Car> getCarInFromOwners(@Param("own") int own);
	
	@Query(value="select * from cartable where address=:addr", nativeQuery = true)
	public List<Car> getCarInFromAddress(@Param("addr") String address);
	
	@Query(value="select * from cartable where car_name=:namec", nativeQuery = true)
	public List<Car> getCarFromName(@Param("namec") String carname);
	
	@Query(value="select * from cartable where owners=:own and car_type=:ct", nativeQuery = true)
	public List<Car> getCarInFromOwnNCt(@Param("own") int owner,@Param("ct") String cType);
	
	
	
}
