package com.weberfly.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.weberfly.entities.Country;
import com.weberfly.entities.Twitte;

public interface TwitterRepository extends JpaRepository<Twitte, Long>{

    Country findOneByText(String text);
	

}
