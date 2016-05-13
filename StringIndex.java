
public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			
			String s="Amit Ladani";
			int l=s.length();
			System.out.println("The length of "+ s + " is " + l);
			char c =s.charAt(15);
			System.out.println(c);
		}
			catch (StringIndexOutOfBoundsException e){
			System.out.println("if length of String is 11 then how it can be print charactor of 15th position");
			System.out.println("Above Lines are printed due to StringIndexOutOfBoundsException");
		}
	}

}
