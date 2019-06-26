package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {
		for (Appliance i:appliances) {
			if (i == null) {
				System.out.println("Appliance not found");
			} else {
				System.out.println(i.toString());
			}
		}
		System.out.println("---------------------");
	}

}
