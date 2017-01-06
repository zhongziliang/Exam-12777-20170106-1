package controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Film;
import pojo.PageModel;

import service.FilmService;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;


@Controller
public class FilmController {
	
	@Autowired
	private FilmService filmAopService;
	
	@RequestMapping(value="/show.do",method=RequestMethod.GET)
	@ResponseBody
	public  PageModel<Film> showFilms( @RequestParam(name = "page",required = false, defaultValue = "1") int page,
									   @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize){
		PageModel<Film> responseData=new PageModel<>();
		responseData.setPageNow(page);
		responseData.setPageSize(pageSize);
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		/*map.put("startPos", (responseData.getPageNow()-1)*responseData.getPageSize());
		map.put("pageSize", responseData.getPageSize());*/
		map.put("startPos", 1);
		map.put("pageSize", 10);
		responseData.setRows(this.filmAopService.find(map));
			return responseData;
	}
	
	@RequestMapping(value="/modeifyMsg.do",method=RequestMethod.GET)
	@ResponseBody
	public Film preUpdate(Integer id){
		return filmAopService.findById(id);
	}
	
	@RequestMapping(value="/updateMoMsg.do")
	public String goToUpdatePage(Integer id){
		return "update?id="+id;
	}
	
	
	@RequestMapping(value="/update.do",method=RequestMethod.POST)
	public String update(@Valid Film film, BindingResult br,HttpServletRequest request){
		Integer id=Integer.parseInt(request.getParameter("id"));
		if(br.hasErrors()){
			return "redirect:updateMoMsg.do?id="+film.getId();
		}
		
		filmAopService.update(film);
		return "success";
	}

	@RequestMapping(value="/deleteById.do",method=RequestMethod.POST)
	public String deleteById(HttpServletRequest request){
		Integer id=Integer.parseInt(request.getParameter("id"));
			Integer res=filmAopService.deleteById(id);
			if(res!=0){
				return "home";
			}
			return "";
	}
	@RequestMapping(value="/insert.do",method=RequestMethod.POST)
	public String insert(@Valid Film film,BindingResult br){
		if(br.hasErrors()||film.getLanguage().getId()<0){
			return "insert";
		}
		filmAopService.insert(film);
		return "success";
	}
}
