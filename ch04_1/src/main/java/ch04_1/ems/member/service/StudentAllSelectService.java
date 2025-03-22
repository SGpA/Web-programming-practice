package ch04_1.ems.member.service;

// 전체 학생 정보 조회
import java.util.Map;
import ch04_1.ems.member.Student;
import ch04_1.ems.member.dao.StudentDao;

public class StudentAllSelectService {
	private StudentDao studentDao;

	public StudentAllSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public Map<String, Student> allSelect() {
		return studentDao.getStudentDB();
	}
}
