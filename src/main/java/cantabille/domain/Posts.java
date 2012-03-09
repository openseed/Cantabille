package cantabille.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author Keesun Baik
 */
@Document
@Data
public class Posts {

	@Id
	private String id;

	@DBRef
	private Users author;

	private Date date;

	private Date dateOfGmt;

	private Date modified;

	private Date modifiedOfGmt;

	private String content;

	private String title;

	private PostStatus status;

	private boolean isCommentAvailable;

	private boolean isPingAvailable;

	private String guid;

	private PostType postType;

	private int commentCount;


}
