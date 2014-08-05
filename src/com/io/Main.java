package com.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Please enter a value");
		String i = br.readLine();

		System.out.println(i);

	}

}
