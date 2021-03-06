package com.company.ocp.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferReaderAndBufferedWriter {

	public static void main(String[] args) throws IOException{


		File source = new File("Zoo.csv");
		File destination = new File("ZooCopy.csv");
		List<String> data = CopyTextFileSample.readFile(source);
		for(String record : data) {
			System.out.println(record);
		}
		CopyTextFileSample.writeFile(data, destination);

	}
}

class CopyTextFileSample {

	public static List<String> readFile(File source) throws IOException {
		List<String> data = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(source))){
			String s;
			while ((s = reader.readLine()) != null) {
				data.add(s);
			}
		}
		return data;
	}

	public static void writeFile(List<String> data, File destination) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(destination))){
			for(String s: data) {
				writer.write(s);
				writer.newLine();
			}

		}
	}
}
