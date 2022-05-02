package revature.d33gz.shredmancer.server.models;

import java.sql.Date;

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
@Table(name="accounts")
public class Account {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Long id;
	public Long getId() {
		return id;
	}
	@Column(name = "user_name")
	private String userName;
	public String getUserName() {
		return userName;
	}
	@Column(name = "user_pass")
	private String userPass;
	public String getUserPass() {
		return userPass;
	}
	@Column(name = "authored_tabs")
	private String authoredTabs;
	public String getAuthoredTabs() {
		return authoredTabs;
	}
	@Column(name = "favorite_tabs")
	private String favoriteTabs;
	public String getFavoriteTabs() {
		return favoriteTabs;
	}
	@Column(name = "date_joined")
	private Date joinedDate;
	public Date getJoinedDate() {
		return joinedDate;
	}
}
