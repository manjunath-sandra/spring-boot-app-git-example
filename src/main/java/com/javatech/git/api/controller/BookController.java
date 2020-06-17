package com.javatech.git.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class BookController {

	@GetMapping("/getBookName")
	public String getBookNameById(@PathVariable String bookId) {
		if (bookId == "101") {
			return "God Book";
		}
		return "No Book find with the id::" + bookId;
	}

}
