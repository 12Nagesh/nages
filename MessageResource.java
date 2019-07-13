package org.rest.jersey.Restful;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Messages> getMessages(){
		
		List<Messages> list=new ArrayList<Messages>();
		Messages m1=new Messages(1, "hello", "nagesh");
		Messages m2=new Messages(2,"hi","susthuu");
		list.add(m1);
		list.add(m2);
		return list;
	}

}
