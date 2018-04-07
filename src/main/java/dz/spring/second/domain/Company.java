package dz.spring.second.domain;

public class Company {
    private Long id;
    private String title;

    public Company(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Company() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}
