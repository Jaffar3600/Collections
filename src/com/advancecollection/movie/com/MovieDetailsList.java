package com.advancecollection.movie.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieDetailsList {
	private static final String sortbyMovieName = "movie";
	private static final String sortbyLeadActor = "actor";
	private static final String sortbyLeadActress = "actress";
	private static final String sortbyGenre = "genre";
	List<MovieDetails> list = new ArrayList<MovieDetails>();

	public String addMovie(MovieDetails moviedetails) {
		list.add(moviedetails);
		return moviedetails.toString() ;
	}
	
	public boolean removeMovie(MovieDetails moviedetailsone){
		boolean flag=list.remove(moviedetailsone);
		return flag;
	}
	
	public boolean removeAllMovies(MovieDetailsList moviedetailslist){
		
		return list.removeAll(list);
	}

	public MovieDetails findMovieByMovieName(String moviename){
		MovieDetails moviedetails=null;
		for (MovieDetails movieDetail : list) {
			if(movieDetail.getMoviename().equalsIgnoreCase(moviename))
				moviedetails=movieDetail;
		}
		return moviedetails;
		
	}

	public MovieDetails FindMovieByGenre(String genre) {
		
		MovieDetails moviedetails=null;
		for (MovieDetails movieDetail : list) {
			if(movieDetail.getGenere().equalsIgnoreCase(genre))
				moviedetails=movieDetail;
		}
		return moviedetails;
	
	}
	
	public void sort(){
	
}

	public List<MovieDetails> sort(String type) {
		switch(type){
		case sortbyMovieName:
			Collections.sort(list, new Comparator<MovieDetails>() {

				@Override
				public int compare(MovieDetails movie1, MovieDetails movie2) {
					return movie1.getMoviename().compareToIgnoreCase(movie2.getMoviename());
				}
			});
			return list;
			
		case sortbyLeadActor:
			Collections.sort(list, new Comparator<MovieDetails>() {

				@Override
				public int compare(MovieDetails movie1, MovieDetails movie2) {
					
					return movie1.getLeadactor().compareToIgnoreCase(movie2.getLeadactor());
				}
			});
			return list;
			
		case sortbyLeadActress:
			Collections.sort(list, new Comparator<MovieDetails>() {

				@Override
				public int compare(MovieDetails movie1, MovieDetails movie2) {
					
					return movie1.getLeadactress().compareToIgnoreCase(movie2.getLeadactress());
				}
			});
			return list;
			
		case sortbyGenre:
			Collections.sort(list, new Comparator<MovieDetails>() {

				@Override
				public int compare(MovieDetails movie1, MovieDetails movie2) {
					
					return movie1.getGenere().compareToIgnoreCase(movie2.getGenere());
				}
			});
			return list;
			
		default:
			return list;
			
		}
	}
}