package com.element.service;

import java.util.List;



import com.element.entity.Contact;

public interface ContactService {


	public boolean saveContact(Contact contact);
	
	public List<Contact> getAllContact();
	
	public Contact getContactById(Integer contact_id);
	
	public boolean deleteContactById(Integer contact_id);

}
