package com.sprint.saleshistory.dao.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prodId;
	
	@Column(length = 50, nullable = false)
	private String prodName;
	
	@Column(length = 4000, nullable = false)
	private String prodDesc;
	
	@Column(length = 50, nullable = false)
	private String prodSubcategory;
	
	@Column(nullable = false)
	private int prodSubcategotyId;
	
	@Column(length = 2000, nullable = false)
	private String prodSubcategoryDesc;
	
	@Column(length = 50, nullable = false)
	private String prodCategory;
	
	@Column(nullable = false)
	private int prodCategoryId;
	
	@Column(length = 2000, nullable = false)
	private String prodCategoryDesc;
	
	@Column(nullable = false)
	private int prodWeightClass;
	
	@Column(length = 20)
	private String prodUnitOfMeasure;
	
	@Column(length = 30, nullable = false)
	private String prodPackSize;
	
	@Column(nullable = false)
	private int supplierId;
	
	@Column(length = 20, nullable = false)
	private String prodStatus;
	
	
	@Column(nullable = false)
	@DecimalMin(value = "0.0", inclusive = false)
    @Digits(integer=8, fraction=2)
	private String prodListPrice;
	
	@Column(nullable = false)
	@DecimalMin(value = "0.0", inclusive = false)
    @Digits(integer=8, fraction=2)
	private double ProdMinPrice;
	
	@Column(length = 13, nullable = false)
	private String prodTotal;
	
	@Column(nullable = false)
	private int prodTotalId;
	
	
	private int prodSrcId;
	
	private LocalDate prodEffFrom;
	
	
	private LocalDate prodEffTo;
	
	@Column(length = 1)
	private String prodValid;
	
	
	

}
