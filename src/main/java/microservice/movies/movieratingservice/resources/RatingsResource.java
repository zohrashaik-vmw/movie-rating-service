package microservice.movies.movieratingservice.resources;

import microservice.movies.movieratingservice.model.Rating;
import microservice.movies.movieratingservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
       return new Rating(movieId,3);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId){
        UserRating userRating = new UserRating();
        userRating.setUserRating(Arrays.asList(new Rating("1234",3), new Rating("5678",1)));
        return userRating;
    }
}

