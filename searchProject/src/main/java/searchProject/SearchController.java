package searchProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping(path="/home")
	public String home(){
		System.out.println("This is Search Controller Home Method");
		return "home";
	}
	
	@RequestMapping(path="/handleSearch", method = RequestMethod.POST)
	public RedirectView handleSearch(@RequestParam("inputSearch") String search ){
		System.out.println("This is handle Search Controller Method, searching .."+search);
		
		//Query Logic
		String request= "https://www.google.com/search?q="+search;
		
		RedirectView redirectView = new RedirectView();
		
		redirectView.setUrl(request);
		return redirectView;
	}

}
