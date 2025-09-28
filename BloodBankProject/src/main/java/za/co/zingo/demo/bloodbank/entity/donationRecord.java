package za.co.zingo.demo.bloodbank.entity;

import java.time.LocalDate;

public class donationRecord {

    private Long recordId;
    private donor donor;
    private bloodInventory  bloodInventory;
    private LocalDate donationDate;
    private Integer quanityMl;
    private String healthStatus;


    public donationRecord(donor donor, bloodInventory bloodInventory, LocalDate donationDate, Integer quanityMl, String healthStatus) {
        this.donor = donor;
        this.bloodInventory = bloodInventory;
        this.donationDate = donationDate;
        this.quanityMl = quanityMl;
        this.healthStatus = healthStatus;
    }


    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public donor getDonor() {
        return donor;
    }

    public void setDonor(donor donor) {
        this.donor = donor;
    }

    public bloodInventory getBloodInventory() {
        return bloodInventory;
    }

    public void setBloodInventory(bloodInventory bloodInventory) {
        this.bloodInventory = bloodInventory;
    }

    public LocalDate getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(LocalDate donationDate) {
        this.donationDate = donationDate;
    }

    public Integer getQuanityMl() {
        return quanityMl;
    }

    public void setQuanityMl(Integer quanityMl) {
        this.quanityMl = quanityMl;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
        return "donationRecord{" +
                "recordId=" + recordId +
                ", donor=" + donor +
                ", bloodInventory=" + bloodInventory +
                ", donationDate=" + donationDate +
                ", quanityMl=" + quanityMl +
                ", healthStatus='" + healthStatus + '\'' +
                '}';
    }
}
