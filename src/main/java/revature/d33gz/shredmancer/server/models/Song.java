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
	private Long id;
	public Long getId()
	{
		return id;
	}
	@Column
	private String songName;
	public String getSongName()
	{
		return songName;
	}
	@Column
	private String bandName;
	public String getBandName()
	{
		return bandName;
	}
	@Column(name = "total_measures")
	private int measures;
	public int getMeasures() {
		// TODO Auto-generated method stub
		return measures;
	}
}
