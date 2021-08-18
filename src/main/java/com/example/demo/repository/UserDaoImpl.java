package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;
@Repository
public class UserDaoImpl implements UserDao {
	
	
	 
	private final JdbcTemplate jdbcTemplate;
	
	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
 

	@Override
	public List<User> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	/* 
	 * @Override
	public List<User> findAll() { 
		// TODO 自動生成されたメソッド・スタブ
		String sql = "SELECT id, name FROM user ";
        
        List<Map<String,Object>> resultList = jdbcTemplate.queryForList(sql);
        
        List<User> list = new ArrayList<>();
        
        for(Map<String, Object> result : resultList) {

            User user = new User();
            user.setId((int)result.get("id"));
            user.setUsername((String)result.get("name"));
 
            list.add(user);
        }
        return list;
	}
	 */

	@Override
	public int findRegisterUser(User user) {
		// TODO 自動生成されたメソッド・スタブ
		
		int count=10;
		
		String sql = "SELECT count(*) as count FROM users where username = ? ";
		
		Map<String, Object> result = jdbcTemplate.queryForMap(sql, user.getUsername());
		
		long lnum = (long) result.get("count");
		count = (int) lnum;
				        		
		return count;
		
		
	}

	

	@Override
	public User findLoginUser(User user) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	/*
	 * 
	 * @Override
	public User findLoginUser(User user) {
		// TODO 自動生成されたメソッド・スタブ
        String sql = "SELECT id, name, password, admin_flg "
                + " FROM user "
                + "WHERE name = ? AND password = ? ";
        
        
        Map<String, Object> result = jdbcTemplate.queryForMap(sql, user.getUsername(),user.getPassword());

        
        User userResult = new User();
        userResult.setId((int)result.get("id"));
        
        userResult.setUsername((String)result.get("name"));
       
        userResult.setPassword((String)result.get("password"));
        
        userResult.setAdmin_flg((int)result.get("admin_flg"));
       

        return userResult;
	}
*/

		
	  @Override
	public void insert(User user) {
		// TODO 自動生成されたメソッド・スタブ
		
		jdbcTemplate.update("INSERT INTO users (username,password,msg,user_img,delete_flg,login_time,created_date) "
				+ "VALUES(?,?,'test msg', 'uploads/puppy.jpg', 0, Now(0),Now(0))",
                user.getUsername(),user.getPassword());

	}

	@Override
	public int findLoginUserCheck(User user) {
		// TODO 自動生成されたメソッド・スタブ
		
		int count=10;
		
		String sql = "SELECT count(*) as count FROM users where username = ? AND password = ? ";
		
		Map<String, Object> result = jdbcTemplate.queryForMap(sql, user.getUsername(),user.getPassword());
		
		long lnum = (long) result.get("count");
		count = (int) lnum;
				        		
		return count;
		
		
	}

}
