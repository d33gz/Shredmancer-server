package revature.d33gz.shredmancer.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import revature.d33gz.shredmancer.server.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	@Query(value = "SELECT * FROM accounts WHERE user_name = :name AND user_pass = :pass", nativeQuery = true)
	Account login(String name, String pass);
}
