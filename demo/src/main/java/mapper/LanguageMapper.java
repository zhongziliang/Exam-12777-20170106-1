package mapper;

import pojo.Language;

import java.util.List;



public interface LanguageMapper {
	
	public Language findById(Integer id);
	public List<Language> find();

}
