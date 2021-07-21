package com.addressbook;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*This Program: 
 * Add contact of AddressBook from AddressBookPojo.java 
 * Read Data from readdata.csv and display in Console using method void read().
 * Write data from console to writedata.csv using method void write().
 */

public class AddressBookCSVMain {

	/* Read data from data.csv */
	void readdata() throws Exception {

		String path = "C:\\Users\\pranav dani\\Desktop\\Basicjava\\AdvAddressBookSystem\\src\\main\\java\\com\\addressbook\\readdata.csv";

		Reader reader = Files.newBufferedReader(Paths.get(path));
		CsvToBean<AddressBookPojo> csvToBean = new CsvToBeanBuilder<AddressBookPojo>(reader)
				.withType(AddressBookPojo.class).withIgnoreLeadingWhiteSpace(true).build();

		List<AddressBookPojo> csvUsers = csvToBean.parse();
		for (AddressBookPojo csvUser : csvUsers) {
			System.out.println(
					"================================================================================================");
			System.out.println("fName :" + csvUser.getfName());
			System.out.println("lName :" + csvUser.getlName());
			System.out.println("addess :" + csvUser.getAddress());
			System.out.println("city :" + csvUser.getCity());
			System.out.println("state :" + csvUser.getState());
			System.out.println("Zip :" + csvUser.getZip());
			System.out.println("phoneNo :" + csvUser.getPhoneNo());
			System.out.println("email :" + csvUser.getEmail());
			System.out.println(
					"================================================================================================");
		}

	}

	/* Write data from console to writedata.csv */
	void WriteData() throws Exception {

		String path1 = "C:\\Users\\pranav dani\\Desktop\\Basicjava\\AdvAddressBookSystem\\src\\main\\java\\com\\addressbook\\writedata.csv";
		Writer writer = Files.newBufferedWriter(Paths.get(path1));
		StatefulBeanToCsv<AddressBookPojo> beanToCsv = new StatefulBeanToCsvBuilder<AddressBookPojo>(writer)
				.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).build();

		List<AddressBookPojo> csvUsers = new ArrayList<AddressBookPojo>();
		csvUsers.add(new AddressBookPojo("pranav", "dani", "aaa", "pune", "maharastra", "414006", "9997999797",
				"abc@gmail.com"));
		beanToCsv.write(csvUsers);
		writer.close();
	}

	// main method
	public static void main(String[] args) throws Exception {

		AddressBookCSVMain csv = new AddressBookCSVMain();
		csv.readdata();
		csv.WriteData();
	}

}
