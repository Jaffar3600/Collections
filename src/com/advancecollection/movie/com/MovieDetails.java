package com.advancecollection.movie.com;

public class MovieDetails {
	private String moviename;
	private String leadactor;
	private String leadactress;
	private String genere;
	
	
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getLeadactor() {
		return leadactor;
	}
	public void setLeadactor(String leadactor) {
		this.leadactor = leadactor;
	}
	public String getLeadactress() {
		return leadactress;
	}
	public void setLeadactress(String leadactress) {
		this.leadactress = leadactress;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public MovieDetails(String moviename, String leadactor, String leadactress,
			String genere) {
		super();
		this.moviename = moviename;
		this.leadactor = leadactor;
		this.leadactress = leadactress;
		this.genere = genere;
	}
	public MovieDetails() {
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genere == null) ? 0 : genere.hashCode());
		result = prime * result
				+ ((leadactor == null) ? 0 : leadactor.hashCode());
		result = prime * result
				+ ((leadactress == null) ? 0 : leadactress.hashCode());
		result = prime * result
				+ ((moviename == null) ? 0 : moviename.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDetails other = (MovieDetails) obj;
		if (genere == null) {
			if (other.genere != null)
				return false;
		} else if (!genere.equals(other.genere))
			return false;
		if (leadactor == null) {
			if (other.leadactor != null)
				return false;
		} else if (!leadactor.equals(other.leadactor))
			return false;
		if (leadactress == null) {
			if (other.leadactress != null)
				return false;
		} else if (!leadactress.equals(other.leadactress))
			return false;
		if (moviename == null) {
			if (other.moviename != null)
				return false;
		} else if (!moviename.equals(other.moviename))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MovieDetails [moviename=" + moviename + ", leadactor="
				+ leadactor + ", leadactress=" + leadactress + ", genere="
				+ genere + "]";
	}
	
	
}
