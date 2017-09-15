import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		int student[3]={s1,s2,s3};
			if(student[]==NULL())
			{
				throw("illegal arguement exception",student());
			}
			return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(index<0||index>stdent[3])
		{
			throw("illegal arguement exception",index);
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		student[1]=s4;
		if(student[]==NULL())
			{
				throw("illegal arguement exception",student[1]);
			}
			setStudents(student[1]);
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		student[1]=student[2];
		if(student[]==NULL())
			{
				throw("illegal arguement exception",student[2]);
			}
			setStudents(student[1]);
			return null;
	}
	}

	@Override
	public void addFirst(Student student) {
		
		// Add your implementation here
		student[1]=15-8-1990;
		if(student[]==NULL())
			{
				throw("illegal arguement exception",student[1]);
			}
			setStudent(student[1]);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		student[1]=0;
		if(index<0||index>stdent[3])
		{
			throw("illegal arguement exception",index);
		}
		setStudent(student[1]);
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		student[1]=15-8-1990;
		if(student[]==NULL())
			{
				throw("illegal arguement exception",student[1]);
			}
			setStudent(student[1]);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(student[1]!=NULL)
		{
			student[1]=0;
		}
		else if(student[1]==NULL)
		{
			throw("illegal arguement exception");
		}
		else
			throw("student not exist");
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(index>0)
		{
			index=0;
		}
		index();
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		removeFromIndex()
		{
		remove(int index);
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		removeFromElement()
		{
			remove(Student,student);
		}
		if(index<0||index>stdent[3])
		{
			throw("illegal arguement exception",index);
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		removeFromElement(index[1]);
		removeToIndex(index[2]);
		if(student[]==NULL())
			{
				throw("illegal arguement exception",student[1]);
			}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		removeToIndex(student[2]);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		if(s1>0)
		{
			s1=n;
			n=s2;
			s2=s1;
		}
		if(s2<s1)
		{
			index(s1);
		}
		else
			throw("illegal expression");
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(s1==15&&s1==21)
		{
			index(s1);
		}
		FirstDate(index);
		LastDate(index);
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(s1<=15)
		{
			index(s1);
		}
		else if(s1>21)
		{
			index(s1);
		}
		else
			throw("illegal expression");
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		if(student[1]!=NULL)
		{
			index(s2);
		}
		else
			throw("illegal expression");
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if(student[2]==30)
		{
			index(s1);
		}
		else
			throw("illegal expression");
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		if(s2==32)
		{
			getStudent(s2);
		}
		else
			throw("illegal expression");
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		if(student[s3]==550)
		{
			getStudent();
		}
		else
			throw("illegal expression");
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student[2]!=NULL
		{
			getStudent[3];
		}
		else
			throw("illegal expression");
		return null;
	}
}
