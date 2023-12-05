package com.my.movieTeacher;

public class Movie {
	
	private String title;		//영화
	private String director;	//감독
	private int grade;			//등급 
	private String genre;		//장르 
	
	Movie(){}
	
	Movie(String title, String director, int grade, String genre) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
 
		return  " 영화 제목 : " + title + ", 영화 감독 : " + director + ", 영화 등급 : " + grade + ", 영화 장르 : " + genre
				+ "\n";
	}
		
	
}


