package com.kenrigtechservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="spec_tab")
public class Specialization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="spec_id_col")
	private Long id;
	
	@Column(name="spec_code_col")
	private String specCode;
	
	@Column(name="spec_name_col")
	private String specNAme;
	
	@Column(name="spec_note_col")
	private String specNote;
}
