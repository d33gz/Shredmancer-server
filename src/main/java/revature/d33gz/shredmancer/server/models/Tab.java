package revature.d33gz.shredmancer.server.models;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "tab_list")
public class Tab {
	@Id
	@Column(name = "tab_id")
	private Long id;
	public Long getId() {
		return id;
	}
	@Column(name = "song_key")
	private Long song_key;
	public Long getSongKey() {
		return song_key;
	}
	@Column(name = "current_measure")
	private int measure;
	public int getMeasure() {
		return measure;
	}
	@Column(name = "repeat_info")
	private int repeats;
	public int getRepeats() {
		return repeats;
	}
	@Column(name = "rhythm_notation")
	private String rhythm;
	public String getRhythm() {
		return rhythm;
	}
	@Column
	private String string1;
	public String getString1() {
		return string1;
	}
	@Column
	private String string2;
	public String getString2() {
		return string2;
	}
	@Column
	private String string3;
	public String getString3() {
		return string3;
	}
	@Column
	private String string4;
	public String getString4() {
		return string4;
	}
	@Column
	private String string5;
	public String getString5() {
		return string5;
	}
	@Column
	private String string6;
	public String getString6() {
		return string6;
	}
	@Column(name = "special_instructions")
	private String special;
	public String getSpecial() {
		return special;
	}
}
