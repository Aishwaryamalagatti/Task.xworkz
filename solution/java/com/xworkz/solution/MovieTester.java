package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.solution.dto.MovieDTO;

public class MovieTester {

	public static void main(String[] args) {

		MovieDTO dto1 = new MovieDTO("KGF2", 5, 3, "action");
		MovieDTO dto2 = new MovieDTO("Om", 5, 2.5, "Drama");
		MovieDTO dto3 = new MovieDTO("Bahubhali", 4.5, 2.39, "Action/War");
		MovieDTO dto4 = new MovieDTO("Andhra Wala", 5, 3, "Action");
		MovieDTO dto5 = new MovieDTO("Tarle nan maga", 5, 3, "Comedy");

		Collection<MovieDTO> movieDTOs = new ArrayList();
		movieDTOs.add(dto1);
		movieDTOs.add(dto2);
		movieDTOs.add(dto3);
		movieDTOs.add(dto4);
		movieDTOs.add(dto5);

		Iterator<MovieDTO> iterator = movieDTOs.iterator();

		while (iterator.hasNext()) {
			MovieDTO movie = iterator.next();
			System.out.println(movie);
			if (movie.getGenre().equals("Comedy")) {
				iterator.remove();
				movieDTOs.remove(movie);
			}
		}
		System.out.println("movies after removing comedy " + movieDTOs.size());

		for (MovieDTO dto : movieDTOs) {
			System.out.println(dto);
		}
	}
}
