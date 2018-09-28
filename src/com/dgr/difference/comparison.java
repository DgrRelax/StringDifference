package com.dgr.difference;

public class comparison {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("String run time");
		long startTime1 = System.nanoTime();
		String str = "*";
		for(int i=0;i<1000;i++){
			str += "*";
		}
		long endTime1 = System.nanoTime();
		System.out.println("Program run time: " + (endTime1 - startTime1) + "ns");
		
		System.out.println("StringBuilder run time");
		long startTime2 = System.nanoTime();
		StringBuilder strbuilder = new StringBuilder("*");
		for(int i=0;i<1000;i++){
			strbuilder.append("*");
		}
		long endTime2 = System.nanoTime();
		System.out.println("Program run time: " + (endTime2 - startTime2) + "ns");
		
		
		System.out.println("StringBuffer run time");
		long startTime3 = System.nanoTime();
		StringBuffer strbuffer = new StringBuffer("*");
		for(int i=0;i<1000;i++){
			strbuffer.append("*");
		}
		long endTime3 = System.nanoTime();
		System.out.println("Program run time: " + (endTime3 - startTime3) + "ns");
		
		/**
		 * 1.run efficiency
		 * StringBuilder > StringBuffer > String 
		 * 
		 * 2.
		 * String: immutable class
		 * StringBuilder: Thread is not secure
		 * StringBuffer: Thread safety
		 */
	}
}
