package za.co.zingo.demo.bloodbank.entity.enums;

public enum bloodComponent {
    WHOLE_BLOOD("Whole Blood"),
    RED_BLOOD_CELLS("Red Blood Cells"),
    PLATELETS("Platelets"),
    PLASMA("Plasma");

    private final String displayValue;

    bloodComponent(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
