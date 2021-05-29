package com.example.test.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Department department;
    private int phone;
    private String customerComment;
    private Date receptionTime;
    private String contentTicket;
    private boolean statusTicket;
    private Date processingTime;

    public Ticket() {
    }

    public Ticket(int id, Department department, int phone, String customerComment, Date receptionTime, String contentTicket, boolean statusTicket, Date processingTime) {
        this.id = id;
        this.department = department;
        this.phone = phone;
        this.customerComment = customerComment;
        this.receptionTime = receptionTime;
        this.contentTicket = contentTicket;
        this.statusTicket = statusTicket;
        this.processingTime = processingTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCustomerComment() {
        return customerComment;
    }

    public void setCustomerComment(String customerComment) {
        this.customerComment = customerComment;
    }

    public Date getReceptionTime() {
        return receptionTime;
    }

    public void setReceptionTime(Date receptionTime) {
        this.receptionTime = receptionTime;
    }

    public String getContentTicket() {
        return contentTicket;
    }

    public void setContentTicket(String contentTicket) {
        this.contentTicket = contentTicket;
    }

    public boolean isStatusTicket() {
        return statusTicket;
    }

    public void setStatusTicket(boolean statusTicket) {
        this.statusTicket = statusTicket;
    }

    public Date getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(Date processingTime) {
        this.processingTime = processingTime;
    }
}
