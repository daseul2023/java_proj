package com.my.movie03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieMgr extends Movie
{
	int index = 0;
	List<Movie> movies = new ArrayList<>();
	
	MovieMgr(){}
	
	void add(Movie m) //영화정보 추가
	{
		movies.add(m);
		System.out.println(movies.size());
		System.out.println("영화 제목 : "+m.getTitle()+", 영화 감독 : "+m.getDirector()+", 영화 시청 연령 등급 : "+m.getGrade()+", 영화 장르 : "+m.getGenre());
	}
	
	void search() // 영화 정보 전체 출력
	{
		for(int i = 0; i<movies.size();i++)
		{
			System.out.println(movies.get(i));
		}
	}
	
	void search(String title) //영화 제목별 출력
	{
		
		for(int i = 0; i<movies.size();i++)
		{
			//System.out.println(movies.get(i).getTitle());
			/*
			if(movies.get(i).getTitle()==title)
			{
				System.out.println("영화 제목 : "+movies.get(i).getTitle());
			}
			*/
			if(movies.get(i).getTitle().equals(title)==true)
			{
				System.out.println(movies.get(i));
			}
			
		}
		
	}
	
	void searchDirector(String name) //영화 감독별 출력
	{
		for(int i = 0; i<movies.size();i++)
		{
			//System.out.println(movies.get(i).getDirector());
			
			/*
			if(movies.get(i).getDirector() == name)
			{
				System.out.println("영화 감독 : "+movies.get(i).getDirector());
			}
			*/
			
			if(movies.get(i).getDirector().equals(name)==true)
			{
				System.out.println(movies.get(i));
			}

		}
		
	}
	
	List<Movie> searchGenre(String genre) //영화 장르별 출력
	{
		
		List<Movie> a = new ArrayList<>(); 
		
		for(int i = 0; i<movies.size();i++)
		{
			//System.out.println(movies.get(i).getGenre());
			
			/*
			if(movies.get(i).getTitle() == genre)
			{
				System.out.println("영화 장르 : "+movies.get(i).getGenre());
			}
			*/
			
			if(movies.get(i).getGenre().equals(genre))
			{
				a.add(movies.get(i));
				//System.out.println("메소드 블락" + i);
			}

		}
		
		return a;
	}
	
	void delete(String title)
	{
		for(int i = 0; i<movies.size(); i++)
		{
			/*
			if(movies.get(i).getTitle() == title)
			{
				movies.remove(i);
			}
			*/
			
			if(movies.get(i).getTitle().equals(title)==true)
			{
				movies.remove(i);
			}
		}
	}
	

}
