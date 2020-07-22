package com.epam.myCustomList;

import org.apache.logging.log4j.*;

import java.util.Scanner;

public class App
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	//Integer[] array= {23,45};
    	//MyList<Integer> list = new MyList<Integer>(array);
    	//Gives and exception as the initial size is 10
    	
    	
        Integer[] array= {23,45,54,25,45,27,22,45,65,76};
        MyList<Integer> list = new MyList<Integer>(array);
        list.add(23);
        Scanner sc = new Scanner(System.in);
        System.out.println(list);
        logger.debug("Enter which element you want to get(index): ");
        int x=sc.nextInt();
        logger.debug("The is element at "+x+" position "+list.get(x-1));
        System.out.println("Enter which element you want to remove(index): ");
        int remove=sc.nextInt();
        list.remove(remove);
        logger.debug("After removing "+remove+" list is:"+list);
        list.add(11);
        list.add(15);
        logger.debug(list);
    }
}

