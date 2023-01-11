package com.element.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="CONTACT_DTLS")
public class Contact {
	@Id
	@Column(name="CONTACT_ID")
	private Integer contact_id;
	
	@Column(name="CONTACT_NAME")
	private String contact_name;
	
	@Column(name="CONTACT_EMAIL")
	private String contact_EMAIL;
	
	@Column(name="CONTACT_NO")
	private Long contact_no;
	
	@Column(name="CONTACT_ACTIVESWITCH")
	private Character activeSwitch;
	
	@Column(name="CONTACT_CREATEDATE")
	private LocalDate createdDate;
	
	@Column(name="CONTACT_UPDATEDATE")
	private LocalDate updatedDate;
}
