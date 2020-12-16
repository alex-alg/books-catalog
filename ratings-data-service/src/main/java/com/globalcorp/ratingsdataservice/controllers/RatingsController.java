package com.globalcorp.ratingsdataservice.controllers;

import com.globalcorp.ratingsdataservice.models.Rating;
import com.globalcorp.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("ratingsdata")
public class RatingsController
{
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId)
    {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("123", 4),
                new Rating("345", 3)
        );

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);

        return userRating;
    }
}
