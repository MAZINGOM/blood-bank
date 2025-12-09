package za.co.zingo.demo.bloodbank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import za.co.zingo.demo.bloodbank.entity.enums.bloodType;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "Donor")
public class donor {

    @Id
    private Long donorId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private bloodType bloodType;
    private LocalDate lastDonation;

    //Constructors
    public donor() {

    }

    public donor(String lastName, String firstName, Date dateOfBirth, String gender, bloodType bloodType, LocalDate lastDonation) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.bloodType = bloodType;
        this.lastDonation = lastDonation;
    }

    public Long getDonorId() {
        return donorId;
    }

    public void setDonorId(Long donorId) {
        this.donorId = donorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public bloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(bloodType bloodType) {
        this.bloodType = bloodType;
    }

    public LocalDate getLastDonation() {
        return lastDonation;
    }

    public void setLastDonation(LocalDate lastDonation) {
        this.lastDonation = lastDonation;
    }

    /**
     * Calculations if the donor is eligible to donate again
     * Assume a standard of donation interval of 56 days (8weeks).
     *
     * @return true if eligible , false otherwise
     */

    public boolean isEligibleForDonation() {
        if (this.lastDonation == null) {
            return true;
        }

        return this.lastDonation.plusDays(56).isBefore(LocalDate.now());
    }
}
