package com.highradius;

import java.sql.*;

public class Invoice {
	private String business_code;
	private String cust_number;
	private String name_customer;
	private Timestamp clear_date;
	private Float business_year;
	private Double doc_id;
	private Date posting_date;
	private Date document_create_date;
	private Date due_in_date;
	private String invoice_currency;
	private String document_type;
	private Float posting_id;
	private String area_business;
	private Float total_open_amount;
	private Date baseline_create_date;
	private String cust_payment_terms;
	private Float invoice_id;
	private Float isOpen;

	public String getBusiness_code() {
		return business_code;
	}

	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}

	public String getCust_number() {
		return cust_number;
	}

	public void setCust_number(String cust_number) {
		this.cust_number = cust_number;
	}

	public String getName_customer() {
		return name_customer;
	}

	public void setName_customer(String name_customer) {
		this.name_customer = name_customer;
	}

	public Timestamp getClear_date() {
		return clear_date;
	}

	public void setClear_date(Timestamp clear_date) {
		this.clear_date = clear_date;
	}

	public Float getBusiness_year() {
		return business_year;
	}

	public void setBusiness_year(Float business_year) {
		this.business_year = business_year;
	}

	public Double getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(Double doc_id) {
		this.doc_id = doc_id;
	}

	public Date getPosting_date() {
		return posting_date;
	}

	public void setPosting_date(Date posting_date) {
		this.posting_date = posting_date;
	}

	public Date getDocument_create_date() {
		return document_create_date;
	}

	public void setDocument_create_date(Date document_create_date) {
		this.document_create_date = document_create_date;
	}

	public Date getDue_in_date() {
		return due_in_date;
	}

	public void setDue_in_date(Date due_in_date) {
		this.due_in_date = due_in_date;
	}

	public String getInvoice_currency() {
		return invoice_currency;
	}

	public void setInvoice_currency(String invoice_currency) {
		this.invoice_currency = invoice_currency;
	}

	public String getDocument_type() {
		return document_type;
	}

	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}

	public Float getPosting_id() {
		return posting_id;
	}

	public void setPosting_id(Float posting_id) {
		this.posting_id = posting_id;
	}

	public String getArea_business() {
		return area_business;
	}

	public void setArea_business(String area_business) {
		this.area_business = area_business;
	}

	public Float getTotal_open_amount() {
		return total_open_amount;
	}

	public void setTotal_open_amount(Float total_open_amount) {
		this.total_open_amount = total_open_amount;
	}

	public Date getBaseline_create_date() {
		return baseline_create_date;
	}

	public void setBaseline_create_date(Date baseline_create_date) {
		this.baseline_create_date = baseline_create_date;
	}

	public String getCust_payment_terms() {
		return cust_payment_terms;
	}

	public void setCust_payment_terms(String cust_payment_terms) {
		this.cust_payment_terms = cust_payment_terms;
	}

	public Float getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(Float invoice_id) {
		this.invoice_id = invoice_id;
	}

	public Float getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Float isOpen) {
		this.isOpen = isOpen;
	}

}
