package com.afuentes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.afuentes.models.Post;

public interface PostRespository extends JpaRepository <Post, Long>{
	
	public List <Post> findAllByOrderByPostDateDesc ();

}
