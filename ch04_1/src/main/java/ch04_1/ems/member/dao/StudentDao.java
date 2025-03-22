package ch04_1.ems.member.dao;

/*
 * 데이터베이스에 접속하고, Service에 의해서 호출
 * 데이터의 insert, search, update, delete 등의 기능을 수행
 */


// DAO
import java.util.HashMap;
import java.util.Map;
import ch04_1.ems.member.Student;

public class StudentDao {
	private Map<String, Student> studentDB = new HashMap<String, Student>();

	public void insert(Student student) {
		studentDB.put(student.getsNum(), student);
	}

	public Student select(String sNum) {
		return studentDB.get(sNum);
	}

	public void update(Student student) {
		studentDB.put(student.getsNum(), student);
	}

	public void delete(String sNum) {
		studentDB.remove(sNum);

	}

	public Map<String, Student> getStudentDB() {
		return studentDB;

	}
}