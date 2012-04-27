package cantabille.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Keesun Baik
 */
@Document
@Data
public class Settings {

	@Id
	private String id;

	private String blogTitle;

	private String blogSubTitle;

	private String ownerName;

	private String ownerPasswd;

}
