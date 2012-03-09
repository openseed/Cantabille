package cantabille.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Keesun Baik
 */
@Document
@Data
public class Comments {

	@Id
	private String id;

	@DBRef
	private Posts post;
	
	private String author;
	
	private String authorEmail;
	
	private String authorUrl;
	
	private String authorIp;

	private boolean approved;

	@DBRef
	private Comments parent;

}
