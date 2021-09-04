package microservice.movies.movieratingservice.model;

import java.util.List;

public class UserRating {
    public List<Rating> getUserRating() {
        return userRating;
    }

public UserRating() {
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    private List<Rating> userRating;
}
