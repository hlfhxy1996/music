package overall.a;

public class TicketVendingSystem {

	private static Station[] getStationList(){

		Station[] stationList=new Station[3];
		Station station =new Station("秋葉原駅", 133);
		Station station1 =new Station("山梨駅", 4128);
		Station station2 =new Station("長野駅", 7990);
		stationList[0]=station;
		stationList[1]=station1;
		stationList[2]=station2;


		//Station[] stationList= {new Station("秋葉原駅", 133),new Station("山梨駅", 4128),new Station("長野駅", 7990)};


		//stationList[0].setName("秋葉原駅");
	//	stationList[0].setFare(133);
		//stationList[1].setName("山梨駅");
		//stationList[1].setFare(4128);
	//	stationList[2].setName("長野駅");
	//	stationList[2].setFare(7990);
		return stationList;
	}
	private static int select(){
		  System.out.println("【ウチダ電鉄 券売機システム】");
		  Station[] stationslist=getStationList();
		  System.out.println("駅の選択");
		  for(int i=0;i<stationslist.length;i++){

			  System.out.println(i+1+":"+stationslist[i]);

		  }
		  System.out.println("行き先を入力してください（終了する場合には0 を入力）");
		int inp=  Input.nextInt(0, stationslist.length);
		  if(inp==0){
			  System.out.println("システムを終了します");
			  System.exit(0);
		  }
		  Station station=stationslist[inp-1];
		  System.out.println("行き先は"+station.getName()+"で料金は"+station.getFare()+"円です");
		return station.getFare();
	}
	private static int deposit(int fare){
		System.out.println("紙幣・硬貨を投入してください");
		int inp=0;
		do {
			System.out.println("●投入する紙幣・硬貨を選択してください");
			int buzhu=fare-inp;
			System.out.println("あと"+buzhu+"円です");
			Money.showMenu();
			int m=Input.nextInt(1, 7);
			inp=inp+Money.kinds[m-1];
			System.out.println("現在の投入金額は"+inp+"円です");
		} while (fare>inp);
		return inp-fare;
	}
	private static void printChange(int change){
		System.out.println("「購入が完了しました」「お釣りは"+change+"円です」");
	}
	public static void main(String[] args) {
		while(true){
			int fare= select();
           int changs=  deposit(fare);
           printChange(changs);
		}

	}

}
