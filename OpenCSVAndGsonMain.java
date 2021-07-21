package com.addressbook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.google.gson.Gson;

public class OpenCSVAndGsonMain {
	
	public static final String CSVPath= "C:\\Users\\pranav dani\\Desktop\\Basicjava\\AdvAddressBookSystem\\src\\main\\java\\com\\addressbook\\readdata.csv";
	public static final String JSONPath="C:\\Users\\pranav dani\\Desktop\\Basicjava\\AdvAddressBookSystem\\src\\main\\java\\com\\addressbook\\data.json";
	
	public static void main(String[] args) throws Exception {
		Reader reader=Files.newBufferedReader(Paths.get(CSVPath));
		CsvToBeanBuilder<AddressBookPojo> csvToBeanBuilder=new CsvToBeanBuilder<AddressBookPojo>(reader);
		csvToBeanBuilder.withType(AddressBookPojo.class);
		csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
		CsvToBean<AddressBookPojo> csvToBean =csvToBeanBuilder.build();
		List<AddressBookPojo> addressBookPojos=csvToBean.parse();
		Gson gson=new Gson();
		String json=gson.toJson(addressBookPojos);
		FileWriter Writer=new FileWriter(JSONPath);
		Writer.write(json);
		Writer.close();
		BufferedReader br=new BufferedReader(new FileReader(JSONPath));
		AddressBookPojo[] userObj=gson.fromJson(br,AddressBookPojo[].class);
		Arrays.asList(userObj);			

	}
}
