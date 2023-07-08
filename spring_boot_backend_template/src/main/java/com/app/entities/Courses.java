package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//course title(unique) , start date , end date , fees , min score
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Courses extends BaseEntity {
	@Enumerated(EnumType.STRING)
	private CoursesEnum title;
	@Column(name = "start_date", length = 20)
	private LocalDate startDate;
	@Column(name = "end_date", length = 20)
	private LocalDate endDate;
	private double fees;
	@Column(name = "min_Score", length = 20)
	private int minScore;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "course")
	private List<Students> list = new ArrayList<>();

	public Courses(CoursesEnum title, LocalDate startDate, LocalDate endDate, double fees, int minScore) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
		this.minScore = minScore;
	}

}
