package com.contact.service;


import com.contact.entity.Contacts;

import java.util.List;

public interface contactService {

    public List<Contacts>getContactsOfUser(Long userId);


}