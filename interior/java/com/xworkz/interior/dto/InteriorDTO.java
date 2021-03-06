package com.xworkz.interior.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class InteriorDTO {

	private int hid;
	private String mestriName;
	private int forWhat;
	private double dimension;
	private double budget;

}
