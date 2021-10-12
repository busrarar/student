class Person
{
    private String name;
    private String surname;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Person setGender(String gender) {
        this.gender = gender;
        return this;
    }

}

class Student extends Person
{
    private int year;
    private int creditCount;

    public int getCreditCount() {
        return creditCount;
    }

    public void setCreditCount(int creditCount) {
        this.creditCount = creditCount;
    }

    public static Student aStudent() {
        return (Student) new Student().setAge(27)
                .setName("Büşra")
                .setGender("Kadın")
                .setSurname("Arar");
    }
        public void takeCourse(Course course)
    {
        if (getCreditCount()+course.getCredit()>20){
            System.out.println("daha fazla kredi alamazsınız");
        }
    setCreditCount(getCreditCount()+ course.getCredit());
    }

}

class Teacher extends Person
{

    int courseCount;

    public int getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(int courseCount) {
        this.courseCount = courseCount;
    }

    public void giveCourse(Course course)
    {
        if (getCourseCount()>3){
            System.out.println("daha fazla kurs veremezsiniz");
        }
        setCourseCount(getCourseCount()+1);
    }

}

class Course
{

    private String name;
    private int credit;
    private int studentCount;
    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }

    public int getCredit() {
        return credit;
    }

    public Course setCredit(int credit) {
        this.credit = credit;
        return this;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public Course setStudentCount(int studentCount) {
        this.studentCount = studentCount;
        return this;
    }

    public static Course aCourse() {
        return new Course().setCredit(5)
                .setName("math")
                .setStudentCount(5);
    }

}

class Hierarchical {

    public static void main(String args[]) {
        Course course = Course.aCourse();
        Student student = Student.aStudent();

        student.takeCourse(course);
        Teacher teacher = new Teacher();
        teacher.giveCourse(course);
    }
}