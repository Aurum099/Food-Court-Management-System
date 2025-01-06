package interfaces;

import classes.*;

public interface IRestaurant
{
	void addRestaurant(Restaurant r);
	void removeRestaurant(Restaurant r);
	Restaurant getRestaurant(String shopNo);
	void showAllRestaurant();
}