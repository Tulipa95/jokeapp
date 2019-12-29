package guru.springframework.joke.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface JokeServices {

    String getJoke();
}
