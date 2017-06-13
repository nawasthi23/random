/**
 * 
 */
package in.inishant.core;

/**
 * @author nishant.awasthi1
 *
 */
public class FinallyCheck {

	private static final String MY_TOWEL = "myTowel";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println(getmyTowel(MY_TOWEL));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String getmyTowel(String string) throws Exception {
		try {
			/*if(string.equals(MY_TOWEL)){
				throw new Exception(MY_TOWEL);
			}*/
			return MY_TOWEL;
		} catch (Exception e) {
			System.out.println("here ");
//			return "11";
//			throw e;
		}finally{
			System.out.println("11t");
//			throw new Exception("xyz");
			return MY_TOWEL+" 11";
		}
		
//		return "113";
		
	}

}
