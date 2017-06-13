/**
 * 
 */
package in.inishant.core;
import in.inishant.core.ABC;
/**
 * @author nishant.awasthi1
 *
 */
public class StaticBlock {
	

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("is it?");
		A.doNothing();
		Class.forName("in.inishant.core.ABC");
	}
	
	

}

 class A{
	static{
		System.out.println(" loaded A");
	}
	public static void doNothing(){
		System.out.println("a");
	}
}
