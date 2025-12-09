package za.co.zingo.demo.bloodbank.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="DONATION_REQUEST")
public class donationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id") // Maps to 'record_id' column
    private Long recordId;

    // Many-to-one relationship with Donor
    // One donor can have many donation records
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "donor_id", nullable = false) // Foreign key to Donor table
    private donor donor;

    //One-to-one relationship with BloodInventory (or Many-to-one if a donation can produce multiple specific units)
    // Assuming one donation event produces one logical unit tracked in blood_inventory
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unit_id", unique = true, nullable = false) // Foreign key to BloodInventory table

    private bloodInventory  bloodInventory;

    @Column(name = "donation_date", nullable = false)
    private LocalDate donationDate;

    // Using Integer for nullable if needed, otherwise int
    @Column(name = "quantity_ml")
    private Integer quanityMl;

    @Column(name = "health_status", length = 255) // Notes on donor's health during donation
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
