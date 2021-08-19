package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Category;
import com.example.demo.entity.Post;
import com.example.demo.entity.User;

@Repository
public class PostDaoImpl implements PostDao {
	

	private final JdbcTemplate jdbcTemplate;
    
    public PostDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


	@Override
	public List<Post> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		
		String sql = "SELECT p.id , p.contents, p.post_img, u.username, c.category_name, "
				+ "          TO_CHAR(p.created_date,'YYYY-MM-DD') as postcreate , p.delete_flg as postdeleteflg FROM post AS p "
				+ "     INNER JOIN users AS u ON p.user_id = u.id "
				+ "     INNER JOIN category AS c ON p.category_id = c.id "
                + "ORDER BY p.created_date ";
        
        List<Map<String,Object>> resultList = jdbcTemplate.queryForList(sql);
        
        List<Post> list = new ArrayList<>();
        
        for(Map<String, Object> result : resultList) {

            Post post = new Post();
            post.setId((int)result.get("id"));
            post.setContents((String)result.get("contents"));
            post.setPost_img((String)result.get("post_img"));
            //post.setUser_id((int)result.get("user_id"));
            //post.setCategory_id((int)result.get("category_id"));
            //post.setDelete_flg((int)result.get("p.delete_flg"));
            post.setDelete_flg((int)result.get("postdeleteflg"));
            //post.setCreated_date((String)result.get("p.created_date"));
            post.setCreated_date((String)result.get("postcreate"));
           
        	User user = new User();
        	user.setUsername((String)result.get("username"));
        	
        	Category category = new Category();
        	category.setCategoryname((String)result.get("category_name"));
        	
        	post.setUser(user);
        	post.setCategory(category);

            list.add(post);
            System.out.println(post.getCreated_date());
        }
        
        return list;
		//return null;
	}

	@Override
	public Post findById(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void insert(Post post) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void update(Post post) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void deleteById(int id) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public List<Post> findByCategory(int categoryId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Post> findListByGoodNum() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Post> findByCategoryAndGoodNum(int categoryId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
