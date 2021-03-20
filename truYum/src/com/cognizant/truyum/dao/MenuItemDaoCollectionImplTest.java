package com.cognizant.truyum.dao;
import java.util.*;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest{
	public static void testGetMenuItemListAdmin()
	{
		try
		{
			MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
			List<MenuItem> menuItems = new ArrayList <MenuItem>();
			menuItems = menuItemDao.getMenuItemListAdmin();
            System.out.println("Menu item list for admin"); 
            System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery"));   
			for (MenuItem items : menuItems) {

				System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n",items.getName(),items.getPrice(),items.isActive(),items.getDateOfLaunch(),items.getCategory(),items.isFreeDelivery()));

			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void testGetMenuItemListCustomer()
	{
		
		MenuItemDao menuItemDao;

		try {
			menuItemDao = new MenuItemDaoCollectionImpl();
			List<MenuItem> menuItems = new ArrayList<MenuItem>();
			menuItems = menuItemDao.getMenuItemListCustomer();
			System.out.println("Menu item list for customer"); 
			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery"));
			for (MenuItem items : menuItems) {
				System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n",items.getName(),items.getPrice(),items.isActive(),items.getDateOfLaunch(),items.getCategory(),items.isFreeDelivery()));
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	public static void testmodifyMenuItem()
	{
		try {
			MenuItem menuItem = new MenuItem((long) 04,"Pongal-Vada",(float) 35.0,true,DateUtil.convertToDate("15/03/2021"), "Breakfast", false);
			MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
			if(menuItemDao.getMenuItem(menuItem.getId()) == menuItem);
			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery")); 
			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n",menuItem.getName(),menuItem.getPrice(),menuItem.isActive(),menuItem.getDateOfLaunch(),menuItem.getCategory(),menuItem.isFreeDelivery()));
			System.out.println("Modification Done");

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	public static void main(String[] args)
	{
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
        testmodifyMenuItem();
		
		
	}

	
}