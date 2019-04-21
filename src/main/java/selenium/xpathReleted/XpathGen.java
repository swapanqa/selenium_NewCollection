package selenium.xpathReleted;

import org.openqa.selenium.By;

public class XpathGen {
	
	
	
	public static By email =By.xpath(createXpath("//input[@id='{0}']", "swapanqa"));
	
	
	
	
	public static String createXpath(String xpathExp,Object ...args) {
		
		for(int i= 0; i<args.length;i++) {
			
			xpathExp = xpathExp.replace("{"+i+"}", (CharSequence)args[i]);
		}
		return xpathExp;
			
	}
	
	

	public static void main(String[] args) {
		
		String xpath = createXpath("//input[@id='{0}']", "test");
		System.out.println(xpath);
		
		String xpath1 = createXpath("//input[@id='{0}' and @name='{1}']", "email","username");
		System.out.println(xpath1);
		
		String xpath2 =createXpath("//input[@id='{0}' and @name='{1}' and @type='{2}'", "email","username","text");
		System.out.println(xpath2);
		
		System.out.println(email.toString().substring(email.toString().indexOf("//")));
		

	}

}
