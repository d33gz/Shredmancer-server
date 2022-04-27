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
	@Column(name = "song_key")
	private Long song_key;
	@Column(name = "current_measure")
	private int measure;
	@Column(name = "repeat_info")
	private int repeats;
	@Column(name = "rhythm_notation")
	private String rhythm;
	@Column
	private String string1;
	@Column
	private String string2;
	@Column
	private String string3;
	@Column
	private String string4;
	@Column
	private String string5;
	@Column
	private String string6;
	@Column(name = "special_instructions")
	private String special;
}
