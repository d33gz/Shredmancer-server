package revature.d33gz.shredmancer.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import revature.d33gz.shredmancer.server.exception.ResourceNotFoundException;
import revature.d33gz.shredmancer.server.models.Account;
import revature.d33gz.shredmancer.server.repository.AccountRepository;

@RestController
@CrossOrigin(origins = "*")
public class AccountController {
	@Autowired
	AccountRepository accountRepository;
	
	@PostMapping("/login")
	public ResponseEntity<Account> loginAccount(@RequestBody Account act)
			throws ResourceNotFoundException {
		System.out.println("Our Request Body is: " + act.toString());
		System.out.println("Our Username is: " + act.getUserName());
		System.out.println("Our Password is: " + act.getUserPass());
		Account loginAccount = accountRepository.login(act.getUserName(), act.getUserPass());
				//.orElseThrow(() -> new ResourceNotFoundException("No Account found with this Username/Password Combination"));
		return ResponseEntity.ok().body(loginAccount);
	}
}
