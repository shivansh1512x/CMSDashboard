package com.medicare.clinic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class ClinicProfile {
    @Id
    private Long id = 1L;

    @NotBlank private String doctorName;
    private String specialization;
    private String clinicName;
    private String phone;
    @Email private String email;
    private String address;
    private String city;
    private String state;
    private String pincode;
    private String consultationFee;
    private String clinicTimings;
    private String doctorPhoto;

    public ClinicProfile() {}
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getDoctorName(){return doctorName;} public void setDoctorName(String v){doctorName=v;}
    public String getSpecialization(){return specialization;} public void setSpecialization(String v){specialization=v;}
    public String getClinicName(){return clinicName;} public void setClinicName(String v){clinicName=v;}
    public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
    public String getEmail(){return email;} public void setEmail(String v){email=v;}
    public String getAddress(){return address;} public void setAddress(String v){address=v;}
    public String getCity(){return city;} public void setCity(String v){city=v;}
    public String getState(){return state;} public void setState(String v){state=v;}
    public String getPincode(){return pincode;} public void setPincode(String v){pincode=v;}
    public String getConsultationFee(){return consultationFee;} public void setConsultationFee(String v){consultationFee=v;}
    public String getClinicTimings(){return clinicTimings;} public void setClinicTimings(String v){clinicTimings=v;}
    public String getDoctorPhoto(){return doctorPhoto;} public void setDoctorPhoto(String v){doctorPhoto=v;}
}
