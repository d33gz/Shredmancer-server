package revature.d33gz.shredmancer.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import revature.d33gz.shredmancer.server.models.Tab;

@Repository
public interface TabRepository extends JpaRepository<Tab, Long> {
	@Query(value = "SELECT * FROM tab_list WHERE song_key = :songKey AND current_measure = :currentMeasure", nativeQuery = true)
	Tab findTab(@Param("songKey") Long songKey, @Param("currentMeasure") int currentMeasure);
}
