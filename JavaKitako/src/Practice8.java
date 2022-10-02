class Animal{
	public String Name;
	public int Age;
	
	public void ShowProfile() {
		System.out.println("名前は" + Name + "、" + Age + "歳です。");
	}	
	public void Speak() {
		System.out.println(".......");
	}
}

class Cat extends Animal{
	public void Sleep() {
		System.out.println("スースー");
	}
	@Override
	public void Speak() {
		System.out.println("ニャー");
	}
}

class Dogs extends Animal{
	public void Run() {
		System.out.println("トコトコ");
	}
	@Override
	public void Speak() {
		System.out.println("ワンワン");
	}
}

public class Practice8 {
	public static void main(String[] args) {
		Cat mycat = new Cat();
		mycat.Name = "シャム";
		mycat.Age = 5;
		mycat.ShowProfile();
		mycat.Speak();
		mycat.Sleep();
		
		Dogs mydog = new Dogs();
		mydog.Name = "太郎";
		mydog.Age = 8;
		mydog.ShowProfile();
		mydog.Speak();
		mydog.Run();
		
		Animal animals[] = {new Cat(), new Dogs(), new Cat(), new Dogs()};
		for(Animal animal : animals)
			animal.Speak();
	}
}
