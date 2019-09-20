package com.telusko.demo.dao;
import java.util.*;
import org.springframework.data.repository.*;

import com.telusko.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
	List<Alien> findByAtech(String atech);
}
