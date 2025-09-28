package za.co.zingo.demo.bloodbank.entity;

import za.co.zingo.demo.bloodbank.entity.enums.bloodComponent;
import za.co.zingo.demo.bloodbank.entity.enums.bloodStatus;

import java.time.LocalDate;

public class bloodInventory {

    private Long id;
    private String bloodType;
    private bloodComponent bloodComponent;
    private LocalDate collectionDate;
    private LocalDate expiredDate;
    private bloodStatus bloodStatus;
    private Long unitsOfBloodAvailable;
    private String location;
    private donor donor;

    // ---Constructors --
    public bloodInventory() {

    }

    public bloodInventory(String bloodType, bloodComponent bloodComponent, LocalDate collectionDate,
                          LocalDate expiredDate, bloodStatus bloodStatus, Long unitsOfBloodAvailable,
                          String location, donor donor) {
        this.bloodType = bloodType;
        this.bloodComponent = bloodComponent;
        this.collectionDate = collectionDate;
        this.expiredDate = expiredDate;
        this.bloodStatus = bloodStatus;
        this.unitsOfBloodAvailable = unitsOfBloodAvailable;
        this.location = location;
        this.donor = donor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public bloodComponent getBloodComponent() {
        return bloodComponent;
    }

    public void setBloodComponent(bloodComponent bloodComponent) {
        this.bloodComponent = bloodComponent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(LocalDate collectionDate) {
        this.collectionDate = collectionDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    public bloodStatus getBloodStatus() {
        return bloodStatus;
    }

    public void setBloodStatus(bloodStatus bloodStatus) {
        this.bloodStatus = bloodStatus;
    }

    public Long getUnitsOfBloodAvailable() {
        return unitsOfBloodAvailable;
    }

    public void setUnitsOfBloodAvailable(Long unitsOfBloodAvailable) {
        this.unitsOfBloodAvailable = unitsOfBloodAvailable;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public donor getDonor() {
        return donor;
    }

    public void setDonor(donor donor) {
        this.donor = donor;
    }

    @Override
    public String toString() {
        return "bloodInventory{" +
                "id=" + id +
                ", bloodType='" + bloodType + '\'' +
                ", bloodComponent=" + bloodComponent +
                ", collectionDate=" + collectionDate +
                ", expiredDate=" + expiredDate +
                ", bloodStatus=" + bloodStatus +
                ", unitsOfBloodAvailable=" + unitsOfBloodAvailable +
                ", location='" + location + '\'' +
                ", donor=" + donor +
                '}';
    }
}
