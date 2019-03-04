package niit.soft.domain;

/**
 * Created by ASUS on 2018/11/16.
 */
public class Student {
    private String name;
    private String school;

    public Student(String 张三, String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}


