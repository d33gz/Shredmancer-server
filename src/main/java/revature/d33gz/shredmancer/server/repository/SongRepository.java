package revature.d33gz.shredmancer.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import revature.d33gz.shredmancer.server.models.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

}
