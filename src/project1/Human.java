package project1;

public class Human {
	private String name;
	private int age;
	private String gender;
	private String job;

	public Human(String name, int age, String gender, String job) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.job = job;
	}

	public void speak() {
		System.out.println("Oi, me chamo " + name + ", sou " + gender + ", tenho " + age + " anos e trabalho como " + job);

	}

	public void birthday() {
		age++;
		System.out.println("É meu aniversário. Agora tenho " + age + " anos.");

	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Human human = new Human("João", 21, "homem", "prf");

		human.speak();
		human.birthday();
		
		human.setName("Tainá");
		human.setAge(19);
		human.setGender("mulher");
		human.setJob("desenvolvedora");
		
		human.speak();
		human.birthday();
	}
}
