package com.aits.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aits.bean.Student;

public class StudentDAO {

	SessionFactory sessionFactory;
	public StudentDAO() {
		// TODO Auto-generated constructor stub
		Configuration cfg=new Configuration().configure("myconfig.cfg.xml");
		sessionFactory=cfg.buildSessionFactory();		
	}
	public String insertStudent(Student student){
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
		return "successful";
	}
	public Student updateStudent(String roll){
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Student student=(Student)session.get(Student.class,roll);
		if(student.getBranch().equals("CSE")){
			student.setFname(student.getFname()+" Garu");
			session.update(student);
			transaction.commit();
		}	
		session.close();
		return student;
	}
	public String deleteStudent(String roll){
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Student student=new Student();
		student.setRoll(roll);
		session.delete(student);
		transaction.commit();
		session.close();
		return "successful";
	}
	public Student getStudent(String roll){
		Session session=sessionFactory.openSession();
		Student student=new Student();
		student=session.get(Student.class,roll);
		session.close();
		return student;
    }
	public Student loadStudent(String roll){
		Session session=sessionFactory.openSession();
		Student student=new Student();
		student=session.load(Student.class,roll);
		session.close();
		return student;
    }


}
