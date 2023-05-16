package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import dto.detail;

public class Emp {
	EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
	EntityManager m = f.createEntityManager();
	EntityTransaction t = m.getTransaction();

	public void save(detail d) {
		t.begin();
		m.persist(d);
		t.commit();

	}

	public detail details(int id) {
		return m.find(detail.class, id);
	}
	
	public List<detail> fetchAll(){
		return m.createQuery("select x from detail x").getResultList();
	}

	public void update(detail d) {
		// TODO Auto-generated method stub
		t.begin();
		m.merge(d);
		t.commit();
	}
	public void delete(int id)
	{
		t.begin();
		m.remove(id);
		t.begin();
	}
}
