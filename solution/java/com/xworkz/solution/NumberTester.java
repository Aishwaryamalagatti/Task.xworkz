package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

public class NumberTester {

	public static void main(String[] args) {

		Collection<Long> mobileNum = new ArrayList();
		mobileNum.add(8147262055l);
		mobileNum.add(9845953873l);
		mobileNum.add(9448541183l);
		mobileNum.add(7338339196l);
		mobileNum.add(8904680543l);
		mobileNum.add(8977620911l);
		mobileNum.add(9022463719l);
		mobileNum.add(9088234161l);
		mobileNum.add(9355648728l);
		mobileNum.add(9788651092l);

		for (Long mobileNo : mobileNum) {

			String convertedMobileNo = mobileNo.toString();
			Character last = convertedMobileNo.charAt(convertedMobileNo.length() - 1);
			System.out.println(last);
			if (Integer.parseInt(last.toString()) > 3) {
				System.out.println("mobile number is greater" + convertedMobileNo);
			}
		}
	}
}
