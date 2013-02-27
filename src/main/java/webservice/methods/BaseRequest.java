package webservice.methods;

import java.util.ArrayList;
import java.util.List;

public class BaseRequest {
	protected List<Object> params = new ArrayList<Object>();
	
	public BaseRequest(int blogid, String username, String password) {
		setBlogId(blogid);
		setUsername(username);
		setPassword(password);
	}

	public BaseRequest() {
	}

	public BaseRequest setUsername(String username) {
		params.add(new String(username));
		return this;
	}
	
	public BaseRequest setPassword(String password) {
		params.add(new String(password));
		return this;
	}
	
	public BaseRequest setBlogId(int blogid) {
		params.add(new Integer(blogid));
		return this;
	}
	
	public List<Object> getParams() {
		return params;
	}
	
}
