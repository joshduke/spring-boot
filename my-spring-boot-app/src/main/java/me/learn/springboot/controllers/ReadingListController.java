package me.learn.springboot.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readinglist")
public class ReadingListController {

	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getReadingList() {
		return "Welcome to ReadingList app - Home Page";
	}


	@RequestMapping(method=RequestMethod.GET, value="/test", produces=MediaType.APPLICATION_JSON_VALUE)
	public String test() {
		return "Welcome to ReadingList app - Test";
	}

}
