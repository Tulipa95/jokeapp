package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServicesImpl implements JokeServices {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServicesImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
