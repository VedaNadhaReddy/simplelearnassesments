package Diamondproblem;
interface first{
	default void show() {
		System.out.println("Defalut first..");
	}
}
interface second{
	 default void show() {
		System.out.println("Defalut second");
	}
}
public class TestClass implements first,second{
	public void show() {
		first.super.show();
		second.super.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TestClass ob=new TestClass();
      ob.show();
	}

}