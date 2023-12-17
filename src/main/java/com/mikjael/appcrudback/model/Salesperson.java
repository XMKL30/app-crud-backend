package com.mikjael.appcrudback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "salesperson")
public class Salesperson {
    @Id
    private String registration_no;

    @Column(name = "salesperson_name", nullable = false)
    private String salesperson_name;

    @Column(name = "registration_start_date", nullable = false)
    private String registration_start_date;

    @Column(name = "registration_end_date", nullable = false)
    private String registration_end_date;

    @Column(name = "estate_agent_name", nullable = false)
    private String estate_agent_name;

    @Column(name = "estate_agent_license_no", nullable = false)
    private String estate_agent_license_no;

    public Salesperson() {
    }

    public Salesperson(String registration_no, String salesperson_name, String registration_start_date, String registration_end_date, String estate_agent_name, String estate_agent_license_no) {
        this.registration_no = registration_no;
        this.salesperson_name = salesperson_name;
        this.registration_start_date = registration_start_date;
        this.registration_end_date = registration_end_date;
        this.estate_agent_name = estate_agent_name;
        this.estate_agent_license_no = estate_agent_license_no;
    }

    public String getRegistration_no() {
        return registration_no;
    }

    public void setRegistration_no(String registration_no) {
        this.registration_no = registration_no;
    }

    public String getSalesperson_name() {
        return salesperson_name;
    }

    public void setSalesperson_name(String salesperson_name) {
        this.salesperson_name = salesperson_name;
    }

    public String getRegistration_start_date() {
        return registration_start_date;
    }

    public void setRegistration_start_date(String registration_start_date) {
        this.registration_start_date = registration_start_date;
    }

    public String getRegistration_end_date() {
        return registration_end_date;
    }

    public void setRegistration_end_date(String registration_end_date) {
        this.registration_end_date = registration_end_date;
    }

    public String getEstate_agent_name() {
        return estate_agent_name;
    }

    public void setEstate_agent_name(String estate_agent_name) {
        this.estate_agent_name = estate_agent_name;
    }

    public String getEstate_agent_license_no() {
        return estate_agent_license_no;
    }

    public void setEstate_agent_license_no(String estate_agent_license_no) {
        this.estate_agent_license_no = estate_agent_license_no;
    }
}
