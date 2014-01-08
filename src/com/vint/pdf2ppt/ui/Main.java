package com.vint.pdf2ppt.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.vint.pdf2ppt.core.PdfToPPT;

public class Main {

	public static void main(String args[]) throws FileNotFoundException, IOException {
		new PdfToPPT().process(new File("Physiology Lectures Pt. II.pdf"), new File(""));
	}
}
