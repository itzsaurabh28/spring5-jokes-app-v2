package kumar.saurabh.chuckNorrisJokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	

	public JokeServiceImpl() {
		
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();  
	
		/*
		 * hard coding here as not learned how to manage spring managed component on external classes--
           not good practice--need to change later
		 */
				
	}



	@Override
	public String getJokes() {
		// TODO Auto-generated method stub
		return chuckNorrisQuotes.getRandomQuote();
	}

}
