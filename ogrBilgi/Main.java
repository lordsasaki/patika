package ogrBilgi;

public class Main {

	public static void main(String[] args) {
		Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Ali Faruk", "9000000000", "MAT");
        Teacher t2 = new Teacher("Ekrem Pala", "9000000000", "FZK");
        Teacher t3 = new Teacher("Abdullah Orman", "9000000000", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Bugra Kucuk", 4, "123123", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Osman Kutu", 4, "123123", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Melih Kaldiran", 4, "123123", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

	}

}
