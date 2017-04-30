package com.weberfly.entities;
/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

import java.io.Serializable;
import java.util.Date;
// Start of user code (user defined imports)

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;



// End of user code

/**
 * Description of Comment.
 * 
 * @author kamal
 */
@Entity
@Table(name="Comment")
public class Comment implements Serializable{
	
	/**
	 * Description of the property id.
	 */
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id ;

	/**
	 * Description of the property user.
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	private RegularUser user ;
	@ManyToOne
    private Publication publication ;

	/**
	 * Description of the property date.
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "EEE, d MMM yyyy 'at' hh:mm aaa",timezone = "GMT+1")	
	private Date date = new Date();

	/**
	 * Description of the property sentiment.
	 */
	private Long sentiment ;

	/**
	 * Description of the property PubType.
	 */
	private String PubType ;

	/**
	 * Description of the property text.
	 */
	private String text ;

	
	public RegularUser getUser() {
		return this.user;
	}

	/**
	 * Sets a value to attribute user. 
	 * @param newUser 
	 */
	public void setUser(RegularUser newUser) {
		this.user = newUser;
	}

	/**
	 * Returns id.
	 * @return id 
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Sets a value to attribute id. 
	 * @param newId 
	 */
	public void setId(Long newId) {
		this.id = newId;
	}

	/**
	 * Returns date.
	 * @return date 
	 */
	public Date getDate() {
		return this.date;
	}

	/**
	 * Sets a value to attribute date. 
	 * @param newDate 
	 */
	public void setDate(Date newDate) {
		this.date = newDate;
	}

	/**
	 * Returns sentiment.
	 * @return sentiment 
	 */
	public Long getSentiment() {
		return this.sentiment;
	}

	/**
	 * Sets a value to attribute sentiment. 
	 * @param newSentiment 
	 */
	public void setSentiment(Long newSentiment) {
		this.sentiment = newSentiment;
	}

	/**
	 * Returns PubType.
	 * @return PubType 
	 */
	public String getPubType() {
		return this.PubType;
	}

	/**
	 * Sets a value to attribute PubType. 
	 * @param newPubType 
	 */
	public void setPubType(String newPubType) {
		this.PubType = newPubType;
	}

	/**
	 * Returns text.
	 * @return text 
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * Sets a value to attribute text. 
	 * @param newText 
	 */
	public void setText(String newText) {
		this.text = newText;
	}

//	public Publication getPublication() {
//		return publication;
//	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}



}
