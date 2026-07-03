package com.example.bus_tracking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "parents")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phone;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_class")
    private String studentClass;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Parent() {
    }

    public Parent(Long id, String phone, String studentName, String studentClass, User user) {
        this.id = id;
        this.phone = phone;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public User getUser() {
        return user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public void setUser(User user) {
        this.user = user;
    }

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEmail(Object email) {
		// TODO Auto-generated method stub
		
	}

	public void setAddress(Object address) {
		// TODO Auto-generated method stub
		
	}
}