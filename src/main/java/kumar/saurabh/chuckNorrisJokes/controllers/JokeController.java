package kumar.saurabh.chuckNorrisJokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kumar.saurabh.chuckNorrisJokes.services.JokeService;

@Controller
public class JokeController {
	
	private final JokeService jokeService;

	//no need of autowired for constructor injection
	public JokeController(JokeService jokeService) {
		
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		
		model.addAttribute("joke", jokeService.getJokes());
		return "index";
	}
	

}
