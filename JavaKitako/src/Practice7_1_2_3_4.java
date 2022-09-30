class Dog{
	private String Name;
	private int Age;
	private String Category;
	public Dog(String category){
		Category = category;
	}
	public void SetName( String nm ){
	  Name = nm;
	}
	public void SetAge( int age) {
		Age = age;
	}
	public void ShowProfile(){
		System.out.println( "名前は、" + Name + "です。" );
		System.out.println("年齢は、" + Age + "歳です。");
		System.out.println("犬種は、" + Category + "です。");
	}
}

public class Practice7_1_2_3_4 {
	public static void main(String[] args) {
//		7-1
//		Dog dog = new Dog();
//		dog.SetName("jack");
//		dog.ShowProfile();
		
//		7-2
//		dog.SetAge(10);
//		dog.ShowProfile();
		
//		7-3
//		Dog dog1 = new Dog();
//		Dog dog2 = new Dog();
//		dog1.SetName("Taro");
//		dog1.SetAge(3);
//		dog2.SetName("Jiro");
//		dog2.SetAge(1);
//		dog1.ShowProfile();
//		dog2.ShowProfile();
		
//		7-4
		Dog mydog = new Dog("秋田犬");
		mydog.SetName("三郎");
		mydog.SetAge(1);
		mydog.ShowProfile();
	}
}
