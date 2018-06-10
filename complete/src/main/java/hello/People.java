package hello;

import java.util.Date;

public class People {
    public People() {
    }

    public People(String name, String position, String office, String extn, Double salary) {

        this.name = name;
        this.position = position;
        this.office = office;
        this.extn = extn;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setExtn(String extn) {
        this.extn = extn;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getOffice() {
        return office;
    }

    public String getExtn() {
        return extn;
    }

    public Double getSalary() {
        return salary;
    }

    private String name;
    private String position;
    private String office;
    private String extn;
    private Double salary;
}

