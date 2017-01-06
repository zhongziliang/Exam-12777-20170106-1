package service;

import pojo.Language;

import java.util.List;



public interface LanuageService {
	public Language findById(Integer id);
	public List<Language> find();
}
