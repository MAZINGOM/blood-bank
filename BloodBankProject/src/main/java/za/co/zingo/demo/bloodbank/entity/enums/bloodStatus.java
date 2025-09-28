package za.co.zingo.demo.bloodbank.entity.enums;

public enum bloodStatus {
    AVAILABLE("Available"),
    USED("Used"),
    EXPIRED("Expired"),
    QUARANTINED("Quarantined");

    private final String displayValue;

    bloodStatus(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
