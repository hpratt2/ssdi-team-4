package winevault.api;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import winevault.model.IWine;
import winevault.service.WineListingService;

@Path("/")
@WebServlet("/WineListingController")
public class WineListingController {
	
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public List<IWine> getWineList() {
		WineListingService wls = new WineListingService();
		return wls.getWineList();
	}
	
	@GET @Path("/{sort}/{dir}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public List<IWine> getSortedWineList(@PathParam("sort") String sort, @PathParam("dir") String dir){
		WineListingService wls = new WineListingService();
		return wls.getSortedWineList(sort, dir);
	}
}
