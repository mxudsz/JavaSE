import org.junit.Test;

public class TestEnum {
    @Test
    public void testEnum(){
        StudentName studentName=new StudentName();
        studentName.name= StudentName.studentName.zhangsan;
        System.out.println(studentName.name);



    }
}
class StudentName{
    enum studentName{zhangsan,lisiwanger}
    studentName name;
}
