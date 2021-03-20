package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.*;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;
public class MenuItemDaoCollectionImpl implements MenuItemDao 
{
   private static ArrayList<MenuItem> menuItemList;
   MenuItemDaoCollectionImpl() throws Exception
   {
	   
	   super();
	   if(menuItemList == null || menuItemList.isEmpty())
	   {
		   menuItemList = new ArrayList<MenuItem>();
		   menuItemList.add(new MenuItem((long) 01,"Dosa",(float) 35.0,true,DateUtil.convertToDate("12/03/2021"), "Breakfast", false));
			menuItemList.add(new MenuItem((long) 02,"Idli",(float) 30.0,true,DateUtil.convertToDate("12/03/2021"), "Breakfast", false));
			menuItemList.add(new MenuItem((long) 03,"Puri",(float) 30.0,true,DateUtil.convertToDate("12/03/2021"), "Breakfast", false));
			menuItemList.add(new MenuItem((long) 04,"Pongal-Vada",(float) 35.0,true,DateUtil.convertToDate("15/03/2021"), "Breakfast", false));
		   
	   }
   }

public ArrayList<MenuItem> getMenuItemListAdmin() {
	return menuItemList;
}

public ArrayList<MenuItem> getMenuItemListCustomer(){
	
	ArrayList<MenuItem> fill = new ArrayList<MenuItem>();
	for(MenuItem x : menuItemList)
	{
		Date d = x.getDateOfLaunch();
		String today = "19/03/2021";
		try {
			if(d.equals((DateUtil.convertToDate(today))))
			{
				if(x.isActive())
				{
					fill.add(x);
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	return fill;
	
}


public void modifyMenuItem(MenuItem menuItem) {
	for(MenuItem x : menuItemList)
	{
		if(x.equals(menuItem))
		{
			x.setName(menuItem.getName());
			x.setActive(menuItem.isActive());
			x.setCategory(menuItem.getCategory());
			x.setDateOfLaunch(menuItem.getDateOfLaunch());
			x.setCategory(menuItem.getCategory());
			x.setFreeDelivery(menuItem.isFreeDelivery());
			
		}
	}
	
}

public MenuItem getMenuItem(long menuItemId) {
	for(MenuItem x: menuItemList)
	{
		if(x.getId()== menuItemId)
		{
			return x;
		}
	}
	return null;
}

@Override
public MenuItem getMenuItem(Long menuItemId) {
	return null;
}


}