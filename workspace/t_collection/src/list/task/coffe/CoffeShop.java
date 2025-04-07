package list.task.coffe;

import list.task.DBConnecter;

public class CoffeShop {
		public Coffee checkmenu(Coffee order) {
			for(Coffee coffee : DBConnecter.coffee){
				if(coffee.equals(order)) {
					return coffee;
				}
			}
			return null;
					
		}
		
		
	}

