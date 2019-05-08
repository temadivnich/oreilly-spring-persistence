package com.oreilly.persistence.dao;

import com.oreilly.persistence.entites.Officer;
import com.oreilly.persistence.entites.Rank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfficerRepository extends JpaRepository<Officer, Integer> {

    List<Officer> findAllByRankAndLastLike(Rank rank, String last);
}
