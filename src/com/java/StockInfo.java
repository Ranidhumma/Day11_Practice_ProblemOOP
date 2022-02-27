package com.java;

public class StockInfo {
	private String StockName;
	private Double NumberOfShare;
	private Double sharePrice;

	public StockInfo() {
		super();
	}

	public StockInfo(String stockName, Double numberOfShare, Double sharePrice) { //// constructor
		super();
		this.StockName = stockName;
		this.NumberOfShare = numberOfShare;
		this.sharePrice = sharePrice;
	}

	public String getStockName() {
		return StockName;
	}

	public void setStockName(String stockName) {
		this.StockName = stockName;
	}

	public Double getNumberOfShare() {
		return NumberOfShare;
	}

	public void setNumberOfShare(Double numberOfShare) {
		this.NumberOfShare = numberOfShare;
	}

	public Double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(Double sharePrice) {
		this.sharePrice = sharePrice;
	}
}
