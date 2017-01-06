package service.impl;

import java.util.List;

import mapper.LanguageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pojo.Language;
import service.LanuageService;


@Component("lanuageService")
public class LanuageServiceImpl implements LanuageService {
	
	@Autowired
	private LanguageMapper languageMapper;
	@Override
	public Language findById(Integer id) {
		
		return languageMapper.findById(id) ;
	}
	
	@Override
	public List<Language> find() {

		return languageMapper.find();
	}

}
