package revature.d33gz.shredmancer.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import revature.d33gz.shredmancer.server.models.Tab;
import revature.d33gz.shredmancer.server.repository.TabRepository;

@RestController
@CrossOrigin(origins = "*")
public class TabController {
	@Autowired
	TabRepository tabRepository;
	
	@GetMapping("/tabs")
	public List<Tab> getAllTabs() {
		List<Tab> myTab = tabRepository.findAll();
		System.out.println("Here's your Tab bro\n" + myTab);
		System.out.println("Oh, you wanted it formatted?\n" + myTab.get(0).getRhythm());
		System.out.println(myTab.get(0).getString1());
		System.out.println(myTab.get(0).getString2());
		System.out.println(myTab.get(0).getString3());
		System.out.println(myTab.get(0).getString4());
		System.out.println(myTab.get(0).getString5());
		System.out.println(myTab.get(0).getString6());
		System.out.println(myTab.get(0).getSpecial());
		return myTab;
	}
}
