package com.rad.repository;

import org.springframework.stereotype.Repository;

import com.rad.model.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class UserRepo {

	/*
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate parameterJdbcTemplate;
	
	void addUser(User user){
		String sql = "INSERT INTO USER (userName, password, email, phoneNo, createdDate, createdByName)"
				+ " values(:userName, :password, :email, :phoneNo, :createdDate, :createdByName)";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("userName", user.getUsername());
		parameterJdbcTemplate.update(sql, params);
	}
	*/
	@PersistenceContext
	private EntityManager entityManager;
	
	public void saveUserDetail(User user){
		  entityManager.persist(user);
		  System.out.println("--Data Saved--");
	  }
	public User getUserDetails(String userName) {
		Query query = entityManager.createQuery("select user from User where userName = ?");
		query.setParameter(0, userName);
		query.setMaxResults(1);
		User user = (User) query.getSingleResult();
		return user;
	}
}
