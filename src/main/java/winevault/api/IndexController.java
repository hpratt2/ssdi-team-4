package winevault.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import winevault.model.IWine;
import winevault.model.Thing;
import winevault.service.WineListService;

@Path("/")
public class IndexController {
	@Context
	ServletContext sc;
	
	@GET
	@Path("/index")
	@Produces(MediaType.TEXT_HTML)
	public InputStream getIndex() {
		try {
			String basepath = sc.getRealPath("/");
			File f = new File(String.format("%s/%s", basepath, "index.html"));
			return new FileInputStream(f);
		}catch(FileNotFoundException e) {
			System.out.println("Unable to locate resource index.html");
			return null;
		}
	}
	
	@GET
	@Path("/winelist")
	@Produces(MediaType.APPLICATION_JSON)
	public List<IWine> getWineList(){
		WineListService service = new WineListService();
		return service.getWineList();
	}
	
	@GET
	@Path("/getthing")
	@Produces(MediaType.APPLICATION_JSON)
	public Thing getThing() {
		Thing x = new Thing();
		return x;
		//return Response.ok(new Thing()).build();
	}
}
