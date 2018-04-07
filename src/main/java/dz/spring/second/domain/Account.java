package dz.spring.second.domain;

public class Account {
    private Long id;
    private String name;
    private Long ownerId;
    private Double rate;

    public Account(Long id, String name, Long ownerId, Double rate) {
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.rate = rate;
    }

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}

