package Daily_Problem;

public class Coding_bat {

	public static void main(String[] args) {
		 System.out.println(getSandwich("breadjambread"));
	}
	 public static String getSandwich(String str) {
		  int first=str.indexOf("bread")+5;
		  int last=str.lastIndexOf("bread");
		  if(str.length()>=10)
		  {
		  String a=str.substring(first,last);
		  return a;
		  }
		  else
		  return "";
		}

}
