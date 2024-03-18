package com.aits.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aits.bean.Student;

public class StudentCriteria {
	SessionFactory factory;
	public StudentCriteria() {
		// TODO Auto-generated constructor stub
		Configuration cfg=new Configuration().configure("myconfig.cfg.xml");
		factory=cfg.buildSessionFactory();
	}
	@SuppressWarnings("deprecation")
	public List<Student> getAllStudents(){
		Session session=factory.openSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Student> cr=cb.createQuery(Student.class);
		Root<Student> root=cr.from(Student.class);
		cr.select(root);
		@SuppressWarnings("deprecation")
		Query<Student> query=session.createQuery(cr);
		return query.list();
	}
	@SuppressWarnings("deprecation")
	public List<Student> getStudentsByBranch(String branch){
		Session session=factory.openSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Student> cr=cb.createQuery(Student.class);
		Root<Student> root=cr.from(Student.class);
		cr.select(root);
		Predicate predicate=cb.equal(root.get("branch"),branch);
		cr.where(predicate);
		@SuppressWarnings("deprecation")
		Query<Student> query=session.createQuery(cr);
		return query.list();
	}
	@SuppressWarnings("deprecation")
	public List<Student> getStudentsByAddress(String address){
		Session session=factory.openSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Student> cr=cb.createQuery(Student.class);
		Root<Student> root=cr.from(Student.class);
		cr.select(root);
		Predicate predicate=cb.equal(root.get("address"),address);
		cr.where(predicate);
		@SuppressWarnings("deprecation")
		Query<Student> query=session.createQuery(cr);
		return query.list();
	}
	public List<Student> getStudentsByCollege(String college){
		Session session=factory.openSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Student> cr=cb.createQuery(Student.class);
		Root<Student> root=cr.from(Student.class);
		cr.select(root);
		Predicate predicate=cb.equal(root.get("college"),college);
		cr.where(predicate);
		@SuppressWarnings("deprecation")
		Query<Student> query=session.createQuery(cr);
		return query.list();
	}
	@SuppressWarnings("deprecation")
	public List<Student> getStudentsByCompany(String company){
		Session session=factory.openSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Student> cr=cb.createQuery(Student.class);
		Root<Student> root=cr.from(Student.class);
		cr.select(root);
		Predicate predicate=cb.equal(root.get("dcompany"),company);
		cr.where(predicate);
		@SuppressWarnings("deprecation")
		Query<Student> query=session.createQuery(cr);
		return query.list();
	}

}
