package org.rahul.home.messenger.Robot;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rahul.home.messenger.Model.RobotModel;
import org.rahul.home.messenger.Service.RobotService;

public class Robot {

	
	RobotService service = new RobotService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<RobotModel> getRobot(){
		
		return service.GetRobotDetails();
	}
	
}
