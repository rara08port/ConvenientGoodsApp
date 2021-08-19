package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Post;
import com.example.demo.repository.PostDao;
@Service
public class PostServiceImpl implements PostService {
	
private final PostDao dao;
	
	public PostServiceImpl(PostDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Post> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return dao.findAll();
	}

	@Override
	public Post getPost(int id) {
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
