package service;

import pojo.Film;

import java.util.HashMap;
import java.util.List;



public interface FilmService {
	public Film findById(Integer id);
	public List<Film> find(HashMap<String,Integer> map);
	public int insert(Film film);
	public int update(Film film);
	public int deleteById(Integer id);
	public int batchDelete(List<Integer> list);
	public void setForgienKeyUnChecks();
	public void setForgienKeyChecks();
}
