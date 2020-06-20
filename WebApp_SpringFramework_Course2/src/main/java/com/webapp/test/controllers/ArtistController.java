package com.webapp.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.webapp.test.repositories.ArtistRepository;

@Controller
public class ArtistController {
	private final ArtistRepository artistRepository;

	public ArtistController(ArtistRepository artistRepository) {
		this.artistRepository = artistRepository;
	}

	//@RequestMapping("/artists")
	public String getArtists(Model model) {
		model.addAttribute("artists", artistRepository.findAll());

		return "artist_list";
	}

}
