package com.contact.controller;

import com.contact.entity.Contacts;
import com.contact.service.contactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private contactService contactsService;

    @RequestMapping ("/user/{userId}")
    public List<Contacts>getContacts(@PathVariable("userId") Long userId){

        return contactsService.getContactsOfUser(userId);
    }



}
