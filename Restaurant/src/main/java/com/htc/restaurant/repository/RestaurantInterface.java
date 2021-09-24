package com.htc.restaurant.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.htc.restaurant.entity.Resturant;


@Repository
public interface RestaurantInterface extends JpaRepository<Resturant, String> {

}
