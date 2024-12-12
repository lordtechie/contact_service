package com.contact.service;

import com.contact.entity.Contacts;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements contactService {

    //fake list of contacts

    List<Contacts> list=List.of(
            new Contacts(1L,"tejas@gmail.com","9349403",1311L),
            new Contacts(2L,"digu@gmail.com","5434343",1312L),
            new Contacts(3L,"abhay@gmail.com","3434342",1313L),
            new Contacts(4L,"ajinkya@gmail.com","3939222",1314L)


    );

    @Override
    public List<Contacts> getContactsOfUser(Long userId) {

        return list.stream().filter(contacts -> contacts.getUserId().equals(userId)).collect(Collectors.toList());

    }
}
