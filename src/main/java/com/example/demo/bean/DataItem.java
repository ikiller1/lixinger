/**
 * 
 */
package com.example.demo.bean;

/**
 * @author chenfeixu
 *
 */
public class DataItem {
	private double weightedAvg;
	private double median;
	private double equalAvg;
	private double avg;
	private AvgSet y_10;
	private AvgSet y_5;

	public double getWeightedAvg() {
		return weightedAvg;
	}

	public void setWeightedAvg(double weightedAvg) {
		this.weightedAvg = weightedAvg;
	}

	public double getMedian() {
		return median;
	}

	public void setMedian(double median) {
		this.median = median;
	}

	public double getEqualAvg() {
		return equalAvg;
	}

	public void setEqualAvg(double equalAvg) {
		this.equalAvg = equalAvg;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public AvgSet getY_10() {
		return y_10;
	}

	public void setY_10(AvgSet y_10) {
		this.y_10 = y_10;
	}

	public AvgSet getY_5() {
		return y_5;
	}

	public void setY_5(AvgSet y_5) {
		this.y_5 = y_5;
	}

}
