package xml.beanUtil_xml_demo.demo2;

public class Student {
	private String stuNo;
	private String name;
	private int age;
	private char gender;
	private float score;
	public Student() {
		super();
	}
	
	public Student(String stuNo, String name, int age, char gender, float score) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.score = score;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + ", score=" + score + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	
}
