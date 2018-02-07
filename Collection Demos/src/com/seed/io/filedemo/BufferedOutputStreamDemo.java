package com.seed.io.filedemo;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) {
		File f = new File("pqr.txt");
		try {
			FileOutputStream fos = new FileOutputStream(f);
			BufferedOutputStream bfos = new BufferedOutputStream(fos);
			String str = "Welcome to Seed Infotech";
			byte[] bts = str.getBytes();
			try {
				bfos.write(bts);
				bfos.flush();
				fos.close();
				bfos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
