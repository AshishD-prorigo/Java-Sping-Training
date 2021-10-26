package com.Sql.springbootfirstSQL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue
	private long studentId;
	private String first_name;
	private String last_name;
	private String email;
	private String gardian_name;
	private String gardian_email;
	private String gardian_mobile;

}
