package com.example.book_my_show.Repository;

import com.example.book_my_show.Entities.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {

}
