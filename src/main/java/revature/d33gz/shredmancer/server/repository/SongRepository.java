package revature.d33gz.shredmancer.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import revature.d33gz.shredmancer.server.models.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
	@Query(value = "SELECT * FROM song_catalog WHERE song_name = :songName", nativeQuery = true)
	Song findSong(@Param("songName") String songName);
}
