package automobiles.model.binding;

import javax.validation.constraints.*;

public class AutomobileAddBindingModel {
    private Integer engineCapacity;
    private String registrationNumber;
    private String colour;
    private Integer horsePower;
    private String ownerEmail;
    private String makerName;
    private String modelName;

    public AutomobileAddBindingModel() {
    }

    @Positive
    @NotNull
    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Pattern(regexp = "^[A-Z]{1,2}[0-9]{4}[A-Z]{2}$")
    @NotBlank
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @NotBlank
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Positive
    @NotNull
    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Email
    @NotBlank
    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    @NotBlank
    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }
    @NotBlank
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
