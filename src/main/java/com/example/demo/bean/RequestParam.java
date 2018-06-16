/**
 * 
 */
package com.example.demo.bean;

import java.util.List;

/**
 * @author chenfeixu
 *
 */
public class RequestParam {
	private String token;
	private String date;
	private	String startDate;
	private String endDate;
	private List<String> stockCodes;
	private List<String> metrics;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public List<String> getStockCodes() {
		return stockCodes;
	}
	public void setStockCodes(List<String> stockCodes) {
		this.stockCodes = stockCodes;
	}
	public List<String> getMetrics() {
		return metrics;
	}
	public void setMetrics(List<String> metrics) {
		this.metrics = metrics;
	}
	
}
