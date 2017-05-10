package com.weberfly.entities;
/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Post.
 * 
 * @author kamal
 */
@Entity
@Table(name="Post")
@PrimaryKeyJoinColumn(name = "id")
@DiscriminatorValue("post")
public class Post extends Publication {
	public static enum sentiment{
		positive,
		negative,
		neutratl,
	}
	/**
	 * Description of the property title.
	 */

	/**
	 * Description of the property content.
	 */
	private String content ;
	private String title;

	@Enumerated(EnumType.ORDINAL)
    private sentiment nltkSentment;
	

	@Enumerated(EnumType.ORDINAL)
    private sentiment dumaxSentment;
	@Enumerated(EnumType.ORDINAL)
    private sentiment otherSentment;
	// Start of user code (user defined attributes for Post)

	private int latitude;

	private int longitude;
	// End of user code

	/**
	 * The constructor.
	 */
	public Post() {
		// Start of user code constructor for Post)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Post)

	// End of user code
	/**
	 * Returns title.
	 * @return title 
	 */
	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	
	public String getContent() {
		return this.content;
	}

	public void setContent(String newContent) {
		this.content = newContent;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public sentiment getNltkSentment() {
		return nltkSentment;
	}

	public void setNltkSentment(sentiment nltkSentment) {
		this.nltkSentment = nltkSentment;
	}

	public sentiment getDumaxSentment() {
		return dumaxSentment;
	}

	public void setDumaxSentment(sentiment dumaxSentment) {
		this.dumaxSentment = dumaxSentment;
	}

	public sentiment getOtherSentment() {
		return otherSentment;
	}

	public void setOtherSentment(sentiment otherSentment) {
		this.otherSentment = otherSentment;
	}
	
}
