package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.entity.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {

    @Query(value = "select * from address_book order by city ASC",nativeQuery = true)
    List<AddressBookData> findAddressBookDataOrderByCity();

}
