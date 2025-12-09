package za.co.zingo.demo.bloodbank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

/**
 * mazingo mbatha
 */

@Entity
@Table(name ="STAFF")
public class staff {

    @Id
    private  Long staffId;
    private String firstName;
    private String lastName;
    private String role;
    private String contactNumber;
    private String email;
    private Set<hospitalRequest> managedRequests = new HashSet<>();

    public staff() {

    }

    public staff(String firstName, String lastName, String role, String contactNumber, Set<hospitalRequest> managedRequests, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.contactNumber = contactNumber;
        this.managedRequests = managedRequests;
        this.email = email;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<hospitalRequest> getManagedRequests() {
        return managedRequests;
    }

    public void setManagedRequests(Set<hospitalRequest> managedRequests) {
        this.managedRequests = managedRequests;
    }

    @Override
    public String toString() {
        return "staff{" +
                "staffId=" + staffId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", managedRequests=" + managedRequests +
                '}';
    }
}
