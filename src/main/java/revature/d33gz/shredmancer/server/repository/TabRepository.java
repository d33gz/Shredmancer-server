package revature.d33gz.shredmancer.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import revature.d33gz.shredmancer.server.models.Tab;

@Repository
public interface TabRepository extends JpaRepository<Tab, Long> {

}
