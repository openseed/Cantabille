package cantabille.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Keesun Baik
 */
@Document
@Data
public class Users {
	
	@Id
	private String id;

	private String loginName;

	private String password;

	private String nickname;

	private String email;
}
