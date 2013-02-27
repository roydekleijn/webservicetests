package testing;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.testng.annotations.Test;

import webservice.methods.BaseRequest;
import webservice.methods.Post;

public class BasicTest {
	
	@Test
	public void connect() throws MalformedURLException, XmlRpcException {
	    XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
	    config.setServerURL(new URL("http://rdekleijn.nl/wordpress/xmlrpc.php"));
	    XmlRpcClient client = new XmlRpcClient();
	    client.setConfig(config);

	    BaseRequest request = new BaseRequest(1, "", "");
	    Post post = new Post();
	    List<Object> params = request.getParams();
	    params.add(post.deletePost(5));
	    
	    System.out.println(client.execute("wp.deletePost", params));
	}
	
	

}
