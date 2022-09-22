package skapa.zorro.spring5bromisapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class BromaServiceImpl implements BromaService{

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public BromaServiceImpl() {//esto no es una buena practica, esto es una implementacion hardcode, deberia hacerce por medio de injeccion de dependencias. 
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getBroma() {
		// TODO Auto-generated method stub
		return chuckNorrisQuotes.getRandomQuote();
	}

}
