package com.kgisl.sbngjscrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String purpose;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String role;
    @Column
    private String source;
    @Column
    private String assigned_to;
    @Column
    private String status;
    @Column
    private Double score;
    @Column
    private String eligible_for_interview;
    @Column
    private String referral;
    @Column
    private String process_status;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getAssigned_to() {
        return assigned_to;
    }
    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Double getScore() {
        return score;
    }
    public void setScore(Double score) {
        this.score = score;
    }
    public String getEligible_for_interview() {
        return eligible_for_interview;
    }
    public void setEligible_for_interview(String eligible_for_interview) {
        this.eligible_for_interview = eligible_for_interview;
    }
    public String getReferral() {
        return referral;
    }
    public void setReferral(String referral) {
        this.referral = referral;
    }
    public String getProcess_status() {
        return process_status;
    }
    public void setProcess_status(String process_status) {
        this.process_status = process_status;
    }
    public Employee() {
    }
    public Employee(Long id, String purpose, String name, String email, String role, String source, String assigned_to,
            String status, Double score, String eligible_for_interview, String referral, String process_status) {
        this.id = id;
        this.purpose = purpose;
        this.name = name;
        this.email = email;
        this.role = role;
        this.source = source;
        this.assigned_to = assigned_to;
        this.status = status;
        this.score = score;
        this.eligible_for_interview = eligible_for_interview;
        this.referral = referral;
        this.process_status = process_status;
    }
    public Employee(String purpose, String name, String email, String role, String source, String assigned_to,
            String status, Double score, String eligible_for_interview, String referral, String process_status) {
        this.purpose = purpose;
        this.name = name;
        this.email = email;
        this.role = role;
        this.source = source;
        this.assigned_to = assigned_to;
        this.status = status;
        this.score = score;
        this.eligible_for_interview = eligible_for_interview;
        this.referral = referral;
        this.process_status = process_status;
    }

    
    
    
    

    


}
