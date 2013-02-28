package webservice.methods;

import java.util.HashMap;
import java.util.Map;

public class Post {
  private Map<String, String> post = new HashMap<String, String>();

  public Post(String title) {
    setPostTitle(title);
  }

  public Post() {
  }

  public Post setPostType(String postType) {
    post.put("post_type", postType);
    return this;
  }

  public Post setPostStatus(String postStatus) {
    post.put("post_status", postStatus);
    return this;
  }

  public Post setPostTitle(String postTitle) {
    post.put("post_title", postTitle);
    return this;
  }

  public Post setPostAuthor(String postAuthor) {
    post.put("post_author", postAuthor);
    return this;
  }

  public Post setPostExcerpt(String postExcerpt) {
    post.put("post_excerpt", postExcerpt);
    return this;
  }

  public Post setPostContent(String postContent) {
    post.put("post_content", postContent);
    return this;
  }

  public Post setPostDateGmt(String postDateGmt) {
    post.put("post_date_gmt", postDateGmt);
    return this;
  }

  public Post setPostFormat(String postFormat) {
    post.put("post_format", postFormat);
    return this;
  }

  //TODO: ???
  public int deletePost(int postId) {
    return postId;
  }



}
