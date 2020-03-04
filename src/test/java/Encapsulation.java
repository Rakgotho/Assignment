public class Encapsulation
{
    private String name;
    private String Surname;
    private int StudentNo;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setStudentNo(int studentNo) {
        StudentNo = studentNo;
    }

    public int getStudentNo() {
        return StudentNo;
    }
   /* public static void main (String[] args)
    {
        Encapsulation en = new Encapsulation();
        en.setName("Abram");
        en.setSurname("Rakgotho");
        en.setStudentNo(215031393);



    }*/
}
