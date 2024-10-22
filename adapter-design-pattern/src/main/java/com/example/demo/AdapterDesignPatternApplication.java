package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdapterDesignPatternApplication.class, args);
		Printer printer = new PrinterAdapter(new LegacyPrinter());
		printer.print();
	}
}
