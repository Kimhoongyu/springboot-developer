package me.kimhoongyu.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityManager;

public class EntityManagerTest {

	@Autowired
	EntityManager em;
	
	public void example() {
		Member member = new Member(1L, "홍길동");
		em.persist(member);
		em.detach(member);
		em.remove(member);
	}
	
	public void join() {
		Member member = new Member(1L, "홍길동");
		em.persist(member);
		
	}
}
