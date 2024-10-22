package com.example.demo;

public class PrinterAdapter implements Printer {
	private LegacyPrinter legacyPrinter;

	//Adapter: A class that implements the target interface and translates the requests to the adaptee.
	public PrinterAdapter(LegacyPrinter legacyPrinter) {
		this.legacyPrinter = legacyPrinter;
	}

	@Override
	public void print() {
		legacyPrinter.printDocument();
		//Client: The code that interacts with the target interface.
	}
}
