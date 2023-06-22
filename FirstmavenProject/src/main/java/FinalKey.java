
final public class FinalKey {
	final int amount=1000;

	public static void main(String[] args) {
		
			FinalKey obj=new FinalKey();
			obj.calc();
			
		}
	final void calc() {
		//amount=200;    final variable cant change the value
		System.out.println(amount);
		
	}

}
//class b extends FinalKey{   //cant extend final class
	
//	final void calc() {   System.out.println(amount); } }   //cant use method
 