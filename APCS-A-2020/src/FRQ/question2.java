package FRQ;

public class question2 {
	public static int getChargingCost(int startHour, int chargeTime) {
		int[] data = { 50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180,140, 100, 80, 60 };
		int cost = 0;
		for (int i = startHour; i < startHour + chargeTime; i++) {
			cost += data[i % 24];

		}
		//System.out.println(cost);
		return cost;
	}
	
	public static int getChargeStartTime(int chargeTime) {
		int cheapestCost = getChargingCost(0, chargeTime);
		for(int i = 1; i<24; i++) {
			if(getChargingCost(i, chargeTime)<cheapestCost) {
				cheapestCost = getChargingCost(i, chargeTime);
			}
		}
		System.out.println(cheapestCost);
		return cheapestCost;
	}
}
