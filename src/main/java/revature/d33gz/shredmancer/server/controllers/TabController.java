package revature.d33gz.shredmancer.server.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import revature.d33gz.shredmancer.server.exception.ResourceNotFoundException;
import revature.d33gz.shredmancer.server.models.Song;
import revature.d33gz.shredmancer.server.models.Tab;
import revature.d33gz.shredmancer.server.repository.SongRepository;
import revature.d33gz.shredmancer.server.repository.TabRepository;

@RestController
@CrossOrigin(origins = "*")
public class TabController {
	@Autowired
	TabRepository tabRepository;
	
	@Autowired
	SongRepository songRepository;
	
	@GetMapping("/tabs")
	public List<Tab> getAllTabs() {
		return tabRepository.findAll();
	}
	
	@GetMapping("/tabs/{songKey}")
	public ArrayList<Tab> getOneTab(@PathVariable(value="songKey") Long sKey) {
			//throws ResourceNotFoundException {
		Song song = null;
		try {
			song = getMeasures(sKey);
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int totalMeasures = song.getMeasures();
		int measure = 1;
		ArrayList<Tab> returnTab = new ArrayList<>();
		while (measure <= totalMeasures) {
			Tab tab = tabRepository.findTab(sKey, measure);
					//.orElseThrow(() -> new ResourceNotFoundException("No Tabs found for this Song Key: " + sKey));
			returnTab.add(tab);
			measure++;
		}
		return returnTab;
	}
	
	public Song getMeasures(Long sKey) throws ResourceNotFoundException {
		return songRepository.findById(sKey)
				.orElseThrow(() -> new ResourceNotFoundException("No Songs found for this Id: " + sKey));
	}
	
}
