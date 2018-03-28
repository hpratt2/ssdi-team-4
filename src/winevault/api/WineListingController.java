package winevault.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import winevault.model.IWine;
import winevault.service.WineListingService;

@Path("/")
public class WineListingController {
	@GET
	@Produces("application/json")
	public List<IWine> getWineList() {
		WineListingService wls = new WineListingService();
		return wls.getWineList();
	}
	
	@GET @Path("/{sort}/{dir}")
	@Produces("application/json")
	public List<IWine> getSortedWineList(@PathParam("sort") String sort, @PathParam("dir") String dir){
		WineListingService wls = new WineListingService();
		return wls.getSortedWineList(sort, dir);
	}
}
