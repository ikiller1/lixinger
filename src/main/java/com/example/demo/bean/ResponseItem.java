/**
 * 
 */
package com.example.demo.bean;

import java.util.Date;

/**
 * @author chenfeixu
 *
 */
public class ResponseItem {
	private Date date;
	private String stockCode;
	private String stockCnName;
	private DataItem pe_ttm;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockCnName() {
		return stockCnName;
	}
	public void setStockCnName(String stockCnName) {
		this.stockCnName = stockCnName;
	}
	public DataItem getPe_ttm() {
		return pe_ttm;
	}
	public void setPe_ttm(DataItem pe_ttm) {
		this.pe_ttm = pe_ttm;
	}
}
