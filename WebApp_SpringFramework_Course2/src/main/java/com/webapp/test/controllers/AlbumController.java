package com.webapp.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.webapp.test.repositories.AlbumRepository;

@Controller
public class AlbumController {

private final AlbumRepository albumRepository;
	
	public AlbumController(AlbumRepository albumRepository) {
		this.albumRepository = albumRepository;
	}
//test
//	@RequestMapping("/albums")
	public String getBooks(Model model) {
		model.addAttribute("albums",albumRepository.findAll());
		return "album_list";
	}
}
