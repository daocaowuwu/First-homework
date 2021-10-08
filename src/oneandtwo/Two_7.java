package oneandtwo;
//获取当前时间
public class Two_7 {

	public static void main(String[] args) {
		long totalmilliseconds=System.currentTimeMillis();
		long totalseconds=totalmilliseconds/1000;
		long currentseconds=totalseconds%60;
		long totalminutes=totalseconds/60;
		long currentminutes=totalminutes%60;
		long totalhours=totalminutes/60;
		long currenthours=totalhours%24;
		System.out.println("Current time is "+currenthours+":"+currentminutes+":"+currentseconds);

	}

}
