package launchBrowser;

import java.util.Arrays;

public class Testing {
private Testing(int data) {
System.out.println("constructor called");	
}
protected static Testing create(int data) {
Testing obj = new Testing (data);
return obj;
}
public void myMethod() {
	System.out.println("Method called");
	
}


	public static void main(String[] args) {
		Testing ts = new Testing (10);
		ts.myMethod();

}}
