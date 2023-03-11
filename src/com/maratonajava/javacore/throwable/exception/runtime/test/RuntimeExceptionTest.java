package com.maratonajava.javacore.throwable.exception.runtime.test;

public class RuntimeExceptionTest {
	public static void main(String[] args) {
		/**
		 * Unchecked: São filhas da classe RuntimeException, e irão lançar o erro após a
		 * compilação, por problemas de tratativas que deixaram de ser feitas.
		 * 
		 */
		int[] nums = { 1, 2 };
		System.out.println(nums[2]);

		Object object = null;
		object.toString();
	}

}
