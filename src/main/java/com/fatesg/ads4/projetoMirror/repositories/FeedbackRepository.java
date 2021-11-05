package com.fatesg.ads4.projetoMirror.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatesg.ads4.projetoMirror.domain.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Integer>{

}
