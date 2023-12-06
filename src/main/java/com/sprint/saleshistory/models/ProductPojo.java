package com.sprint.saleshistory.models;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class ProductPojo {

	private int prodId;

	@NotNull
	@Size(max = 50)
	private String prodName;
	@NotNull
	@Size(max = 4000)
	private String prodDesc;

	@NotNull
	@Size(max = 50)
	private String prodSubcategory;

	@NotNull
	private int prodSubcategotyId;

	@NotNull
	@Size(max = 2000)
	private String prodSubcategoryDesc;

	@NotNull
	@Size(max = 50)
	private String prodCategory;

	@NotNull
	private int prodCategoryId;

	@NotNull
	@Size(max = 2000)
	private String prodCategoryDesc;

	@NotNull
	private int prodWeightClass;

	@Size(max = 20)
	private String prodUnitOfMeasure;

	@NotNull
	@Size(max = 30)
	private String prodPackSize;

	@NotNull
	private int supplierId;

	@NotNull
	@Size(max = 20)
	private String prodStatus;

	@NotNull
	private String prodListPrice;

	@NotNull
	private double ProdMinPrice;

	@NotNull
	@Size(max = 13)
	private String prodTotal;

	@NotNull
	private int prodTotalId;

	private int prodSrcId;

	private LocalDate prodEffFrom;

	private LocalDate prodEffTo;

	@Size(max = 1)
	private String prodValid;

}
