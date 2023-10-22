package saving.doctors.to.vaults.model;

public class Doctor {


    private int id;
    private String lastName;
    private String firstSurname;

    private String middleName;

    private String specialization;

    private int licenseNumber;

    private int telephone;
    private String email;
    private String address;

    private int experienceYears;

    private String workSchedule;

    private int consultationFee;

    private String patientList;

    private String specializedServices;


    public Doctor(int id, String lastName, String firstSurname, String middleName,
                  String specialization, int licenseNumber, int telephone, String email,
                  String address, int experienceYears, String workSchedule, int consultationFee,
                  String patientList, String specializedServices) {
        this.id = id;
        this.lastName = lastName;
        this.firstSurname = firstSurname;
        this.middleName = middleName;
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
        this.experienceYears = experienceYears;
        this.workSchedule = workSchedule;
        this.consultationFee = consultationFee;
        this.patientList = patientList;
        this.specializedServices = specializedServices;
    }

    public Doctor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
    }

    public int getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }

    public String getPatientList() {
        return patientList;
    }

    public void setPatientList(String patientList) {
        this.patientList = patientList;
    }

    public String getSpecializedServices() {
        return specializedServices;
    }

    public void setSpecializedServices(String specializedServices) {
        this.specializedServices = specializedServices;
    }
}

