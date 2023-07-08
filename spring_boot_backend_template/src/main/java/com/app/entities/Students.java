package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Students extends BaseEntity{

	//first name , last name , email , course title,score
	@Column(name="first_name", length=20)
	private String firstName;
	@Column(name="last_name", length=20)
	private String lastName;
	@Email
	private String email;
	@Enumerated(EnumType.STRING)
	private CoursesEnum title;
	private int score;
	@ManyToOne()
	@JoinColumn(name = "course_id")
	private Courses course;
	
	public Students(String firstName, String lastName, @Email String email, CoursesEnum title, int score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.title = title;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Students [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", title=" + title
				+ ", score=" + score + "]";
	}
	
	
}
