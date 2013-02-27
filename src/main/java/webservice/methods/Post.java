package webservice.methods;

import java.util.HashMap;
import java.util.Map;

public class Post {
	private Map<String, String> post = new HashMap<String, String>();

	public Post(String title) {
		setPost_title(title);
	}

	public Post() {
	}

	public Post setPost_type(String post_type) {
		post.put("post_type", post_type);
		return this;
	}

	public Post setPost_status(String post_status) {
		post.put("post_status", post_status);
		return this;
	}

	public Post setPost_title(String post_title) {
		post.put("post_title", post_title);
		return this;
	}

	public Post setPost_author(String post_author) {
		post.put("post_author", post_author);
		return this;
	}

	public Post setPost_excerpt(String post_excerpt) {
		post.put("post_excerpt", post_excerpt);
		return this;
	}

	public Post setPost_content(String post_content) {
		post.put("post_content", post_content);
		return this;
	}

	public Post setPost_date_gmt(String post_date_gmt) {
		post.put("post_date_gmt", post_date_gmt);
		return this;
	}

	public Post setPost_format(String post_format) {
		post.put("post_format", post_format);
		return this;
	}

	public int deletePost(int postId) {
		return postId;
	}
	
	

}
