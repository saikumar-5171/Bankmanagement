class Bank{
	float rateOfInterest(){
		return 0;
	}
	String IFSC(){
	    return "HP852";
	}
}
class ICICI extends Bank{
	float rateOfInterest(){
		return 5.5f;
	}
	String IFSC(){
	    return "KP963";
	}
}
class SBI extends Bank{
	float rateOfInterest(){
		return 10.6f;
	}
	String IFSC(){
	    return "ID741";
	}
}
class HDFC extends Bank{
	float rateOfInterest(){
		return 9.4f;
	}
	String IFSC(){
	    return "WS125";
	}
}
class AXIS extends Bank{
	float rateOfInterest(){
		return 9.6f;
	}
	String IFSC(){
	    return "JP453";
	}
}
class KOTAK extends Bank{
	float rateOfInterest(){
		return 6.9f;
	}
	String IFSC(){
	    return "UP236";
	}
}
class Polymorphism{
    public static void main(String[] args) {
    	Bank B;
    	B = new ICICI();
    	System.out.println("Rate of interest of ICICI is: "+B.rateOfInterest()+"\n"+"IFCS Code is : "+B.IFSC());
    	B = new SBI();
    	System.out.println("Rate of interest of SBI is: "+B.rateOfInterest()+"\n"+"IFCS Code is : "+B.IFSC());
    	B = new HDFC();
    	System.out.println("Rate of interest of HDFC is: "+B.rateOfInterest()+"\n"+"IFCS Code is : "+B.IFSC());
    	B = new AXIS();
    	System.out.println("Rate of interest of HDFC is: "+B.rateOfInterest()+"\n"+"IFCS Code is : "+B.IFSC());
    	B = new KOTAK();
    	System.out.println("Rate of interest of HDFC is: "+B.rateOfInterest()+"\n"+"IFCS Code is : "+B.IFSC());
    }
}
