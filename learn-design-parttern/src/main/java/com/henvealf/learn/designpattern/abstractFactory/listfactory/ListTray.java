package com.henvealf.learn.designpattern.abstractFactory.listfactory;


import java.util.Iterator;

import com.henvealf.learn.design.abstractFactory.factory.Item;
import com.henvealf.learn.design.abstractFactory.factory.Tray;

public class ListTray extends Tray{

	public ListTray(String caption){
		super(caption);
	}
	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n");
		buffer.append(caption + "\n");
		buffer.append("<ul>\n");
		Iterator it = tray.iterator();
		while(it.hasNext()){
			Item item = (Item) it.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("</li>\n");
		return buffer.toString();
	}

}
