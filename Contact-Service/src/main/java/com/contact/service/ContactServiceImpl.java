package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	//Fake Service
	List<Contact> list = List.of(
			new Contact(2001L, "kalel@gmail.com","Kal-EL", 1001L),
			new Contact(2002L, "dayana@gmail.com","Dayana", 1002L),
			new Contact(2003L, "bruce@gmail.com","Bruce-Wayn", 1003L)
			);

	@Override
	public List<Contact> getContacts(Long user) {
		return list.stream().filter(contact -> contact.getUserId().equals(user))
				.collect(Collectors.toList());
	}
	
	

}
