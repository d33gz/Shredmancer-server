package revature.d33gz.shredmancer.server.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		System.out.println("Maybe I work?");
		return songRepository.findAll();
	}
	
	@GetMapping("/songs/{songName}")
	public ArrayList<Song> getSongByName(@PathVariable(value="songName") String sName) {
		Song song = songRepository.findSong(sName);
		System.out.println("This is the song name:" + sName);
		
		ArrayList<Song> returnSong = new ArrayList<>();
		returnSong.add(song);
		
		return returnSong;
	}
}
