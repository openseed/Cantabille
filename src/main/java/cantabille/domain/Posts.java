package cantabille.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author Keesun Baik
 */
@Document
public class Posts {

	@Id
	String id;

	@DBRef
	Users author;

	@DBRef
	Posts parent;

	Date date;

	Date dateOfGmt;

	Date modified;

	Date modifiedOfGmt;

	String content;

	String title;

	PostStatus status;

	boolean isCommentAvailable;

	boolean isPingAvailable;
	
	String guid;

	PostType postType;

	int commentCount;


}
