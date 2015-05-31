package com.strategy;

public class SpringDiscountStrategyImpl extends DiscountStrategy {

	@Override
	public double total(double price, int num) {
		// TODO Auto-generated method stub
		double ret = price * num * 0.8;
		if ( ret > 300 && ret < 700 ) {
			ret = ret-30;
		}else if ( ret >= 700 && ret < 2000 ) {
			ret = ret - 100;
		}else if ( ret >= 2000 ) {
			ret = ret -300;
		}
		return ret;
	}

}
