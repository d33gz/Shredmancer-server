package revature.d33gz.shredmancer.server.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="song_catalog")
public class Song {
	@Id
	@GeneratedValue
	@Column(name = "song_id")
	private int id;
	@Column
	private String songName;
	@Column
	private String bandName;
	@Column(name = "total_measures")
	private int measures;
}
