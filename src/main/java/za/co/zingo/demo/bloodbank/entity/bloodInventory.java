package za.co.zingo.demo.bloodbank.entity;

import jakarta.persistence.*;
import za.co.zingo.demo.bloodbank.entity.enums.bloodComponent;
import za.co.zingo.demo.bloodbank.entity.enums.bloodStatus;

import java.time.LocalDate;

@Entity
@Table(name = "Blood_Inventory")
public class bloodInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unit_id") // Maps to 'unit_id' column
    private Long id;

    @Column(name = "blood_type", length = 5) // e.g., "A+", "O-", etc.
    private String bloodType;

    @Enumerated(EnumType.STRING) // Stores the enum name (e.g., "WHOLE_BLOOD") as a string in the DB
    @Column(name = "component")
    private bloodComponent bloodComponent;

    @Column(name = "collection_date")
    private LocalDate collectionDate;

    @Column(name = "expiry_date")
    private LocalDate expiredDate;

    @Enumerated(EnumType.STRING) // Stores the enum name (e.g., "AVAILABLE") as a string in the DB
    @Column(name = "status")
    private bloodStatus bloodStatus;
    private Long unitsOfBloodAvailable;
    private String location;

    // Many-to-one relationship with Donor, as one donor can contribute many blood units
    @ManyToOne(fetch = FetchType.LAZY) // LAZY loading is usually preferred for performance
    @JoinColumn(name = "donor_id", nullable = false) // This specifies the foreign key column
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
