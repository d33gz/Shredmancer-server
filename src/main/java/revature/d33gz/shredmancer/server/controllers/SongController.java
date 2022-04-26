package revature.d33gz.shredmancer.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import revature.d33gz.shredmancer.server.models.Song;
import revature.d33gz.shredmancer.server.repository.SongRepository;

@RestController
@CrossOrigin(origins = "*")
public class SongController {
	@Autowired
	SongRepository songRepository;
	
	@GetMapping("/songs")
	public List<Song> getAllSongs() {
		return songRepository.findAll();
	}
}
