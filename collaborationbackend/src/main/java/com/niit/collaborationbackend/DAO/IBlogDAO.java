package com.niit.collaborationbackend.DAO;

import java.util.ArrayList;

import com.niit.collaborationbackend.Modal.Blog;

public interface IBlogDAO {

	boolean addBlog(Blog b);
	boolean updateBlog(Blog b);
	boolean deleteBlog(Blog b);
	ArrayList<Blog> selectallApprovedBlogs();
	ArrayList<Blog> selectallBlogsOfOneUser(int cus_Id);
	ArrayList<Blog> selectUnApprovedBlogs();
	Blog selectOneBlog(int blog_Id);
	 
}
