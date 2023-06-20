package com.abc.learning.resources;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.learning.models.Rating;
import com.abc.learning.models.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}

	@RequestMapping("/users/{userId}")
	public UserRating getRatingsByUser(@PathVariable("userId") String userId) {

		List<Rating> ratings = Arrays.asList(new Rating("123", 4), new Rating("2143", 5));

		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);

		return userRating;
	}
}
