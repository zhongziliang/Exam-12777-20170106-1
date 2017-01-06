package service.impl;

import java.util.HashMap;
import java.util.List;

import mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pojo.Film;
import service.FilmService;


@Component("filmService")
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	private FilmMapper filmMapper;

	@Override
	public Film findById(Integer id) {

		return filmMapper.findById(id);
	}

	@Override
	public List<Film> find(HashMap<String,Integer> map) {

		return filmMapper.find(map);
	}

	@Override
	public int insert(Film film) {

		return filmMapper.insert(film);
	}

	@Override
	public int update(Film film) {

		return filmMapper.update(film);
	}

	@Override
	public int deleteById(Integer id) {
		//setForgienKeyUnChecks();
		filmMapper.deleteById(id);
		//setForgienKeyChecks();
		return 0;
	}

	@Override
	public int batchDelete(List<Integer> list) {

		return filmMapper.batchDelete(list);
	}

	@Override
	public void setForgienKeyUnChecks() {
		filmMapper.setForgienKeyChecks(0);
	}

	@Override
	public void setForgienKeyChecks() {
		filmMapper.setForgienKeyChecks(1);
	}

}
