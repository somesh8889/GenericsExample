class Gen<T>{
	T ob;
	Gen(T o){
		ob=o;
	}
	T getob(){
		return ob;
	}
	void show() {
		System.out.println("The type of object is:"+ob.getClass().getName());
	}
}
public class GenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer> iob1=new Gen<Integer>(55);
		Gen<String> iob2=new Gen<String>("SDM");
		Gen<Boolean> iob3=new Gen<Boolean>(true);
		iob1.show();
		int v=iob1.getob();
		System.out.println("The value of objectis:"+v);
		iob2.show();
		String str1=iob2.getob();
		System.out.println("The value of objectis:"+str1);		
		iob3.show();
		Boolean b1=iob3.getob();
		System.out.println("The value of objectis:"+b1);		
		
		
	}
}
