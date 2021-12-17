package com.demolab.demolab.Model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

//Entity specify its class & mapped to a database table

@Entity
public class Patients {

//Primary key used for identity, its unique number
    @Id

//Inbulid function to identify primry key
    @GeneratedValue ( strategy = GenerationType.IDENTITY )

    private long id;

    @Column
    private int reportnumber;
    @Column
    private String patientname;
    @Column
    private String patientphno;
    @Column
    private String testname;
    @Column
    private String price;

// used getter & setter Methos

    public long getId() {
        return id;
    }

    public int getReportnumber() {
        return reportnumber;
    }

    public String getPatientname() {
        return patientname;
    }

    public String getPatientphno() {
        return patientphno;
    }

    public String getTestname() {
        return testname;
    }

    public String getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setReportnumber(int reportnumber) {
        this.reportnumber = reportnumber;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public void setPatientphno(String patientphno) {
        this.patientphno = patientphno;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
