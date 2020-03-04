public class Inheritance extends Encapsulation
{
    private String faculty;

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public static void main (String[] args)
    {
        Inheritance in = new Inheritance();
        Encapsulation en = new Encapsulation();
        en.setName("Abram");
        en.setSurname("Rakgotho");
        en.setStudentNo(215031393);
        in.setFaculty("Informatics and design");
        //System.out.println(in.getFaculty());

        System.out.println(" Student: "+en.getName()+"\n "+"Surname: "+en.getSurname()+"\n "+"Student No: "+en.getStudentNo()+" \n"+" Faculty: "+in.getFaculty());
        System.out.println(" ");
        System.out.println("Successfully displayed my details");


    }
}
