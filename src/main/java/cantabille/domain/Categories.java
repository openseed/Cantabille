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
public class Categories {

	@Id
	private String id;
	
	private String name;

	@DBRef
	private Categories parent;


}
