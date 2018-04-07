package dz.spring.second.domain;

public class Owner {
    private Long id;
    private Long companyId;
    private String firsstName;
    private String lastName;

    public Owner(Long id, Long companyId, String firsstName, String lastName) {
        this.id = id;
        this.companyId = companyId;
        this.firsstName = firsstName;
        this.lastName = lastName;
    }

    public Owner() {
    }

    public Long getId() {
        return id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public String getFirsstName() {
        return firsstName;
    }

    public String getLastName() {
        return lastName;
    }

}
