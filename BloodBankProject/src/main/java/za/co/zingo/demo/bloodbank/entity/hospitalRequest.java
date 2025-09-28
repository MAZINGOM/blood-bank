package za.co.zingo.demo.bloodbank.entity;

import za.co.zingo.demo.bloodbank.entity.enums.bloodComponent;
import za.co.zingo.demo.bloodbank.entity.enums.requestStatus;

import java.time.LocalDateTime;

public class hospitalRequest {

    private  Long requestId;
    private String hospitalName;
    private String requestedBloodType;
    private bloodComponent bloodComponent;
    private Integer requestedUnits;
    private LocalDateTime requestedDate;
    private requestStatus requestStatus;
    private staff  staff;

    public hospitalRequest() {
    }

    public hospitalRequest(Long requestId, String hospitalName, String requestedBloodType,
                           bloodComponent bloodComponent, LocalDateTime requestedDate,
                           Integer requestedUnits, requestStatus requestStatus, staff staff) {
        this.requestId = requestId;
        this.hospitalName = hospitalName;
        this.requestedBloodType = requestedBloodType;
        this.bloodComponent = bloodComponent;
        this.requestedDate = requestedDate;
        this.requestedUnits = requestedUnits;
        this.requestStatus = requestStatus;
        this.staff = staff;
    }


    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getRequestedBloodType() {
        return requestedBloodType;
    }

    public void setRequestedBloodType(String requestedBloodType) {
        this.requestedBloodType = requestedBloodType;
    }

    public bloodComponent getBloodComponent() {
        return bloodComponent;
    }

    public void setBloodComponent(bloodComponent bloodComponent) {
        this.bloodComponent = bloodComponent;
    }

    public Integer getRequestedUnits() {
        return requestedUnits;
    }

    public void setRequestedUnits(Integer requestedUnits) {
        this.requestedUnits = requestedUnits;
    }

    public LocalDateTime getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(LocalDateTime requestedDate) {
        this.requestedDate = requestedDate;
    }

    public requestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(requestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public staff getStaff() {
        return staff;
    }

    public void setStaff(staff staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "hospitalRequest{" +
                "requestId=" + requestId +
                ", hospitalName='" + hospitalName + '\'' +
                ", requestedBloodType='" + requestedBloodType + '\'' +
                ", bloodComponent=" + bloodComponent +
                ", requestedUnits=" + requestedUnits +
                ", requestedDate=" + requestedDate +
                ", requestStatus=" + requestStatus +
                ", staff=" + staff +
                '}';
    }
}
