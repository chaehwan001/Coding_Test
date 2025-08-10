package ct.week01;
/*
 * 문자열
 */
public class EX10 {
	public static void main(String[] args) {
		String s = "AGood Morning!";
		
		System.out.println("Char At : " + s.charAt(7));
		System.out.println("startWith :" + s.startsWith("good"));
		System.out.println("endsWith : " + s.endsWith("ng!"));
		System.out.println("equals : " + s.equals("good Moning!"));
		System.out.println("index Of : " + s.indexOf("n"));
		System.out.println("lastIndex Of : " + s.lastIndexOf("n"));
		System.out.println("length : " + s.length());
		
		System.out.println("replace : " + s.replace("Good", "good"));
		System.out.println("replace : " + s.replace("o","a"));
		System.out.println("replaceFirst : " + s.replaceFirst("o", "a"));
		
		System.out.println("replaceAll : " + s.replaceAll("Good", "good"));
		System.out.println("replaceAll : " + s.replaceAll("[Good]", "a")); //괄호 안 문자 하나하나를 다 바꿈
		
		System.out.println("replaceAll : " + s.replaceAll("[^G]", "a")); // ^는 "G"가 아닌 문자를 다 바꿈
		System.out.println("replaceAll : " + s.replaceAll("^[A]", "a")); //시작하면
		System.out.println("replaceAll : " + s.replaceAll("[G]$", "a")); //끝나면
		
		String str = "1234567890ABCDEFGabcdefg";
		System.out.println(str.replaceAll("[0-9]",""));
		
	}
}
