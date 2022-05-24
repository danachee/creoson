/*
 * MIT LICENSE
 * Copyright 2000-2021 Simplified Logic, Inc
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to deal 
 * in the Software without restriction, including without limitation the rights 
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
 * copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions: The above copyright 
 * notice and this permission notice shall be included in all copies or 
 * substantial portions of the Software. THE SOFTWARE IS PROVIDED "AS IS", 
 * WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED 
 * TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE 
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.simplifiedlogic.nitro.jlink.data;

import java.io.Serializable;

/**
 * Information about a feature
 * 
 * @author Adam Andrews
 *
 */
public class PointData implements Serializable {

	private static final long serialVersionUID = 2L;
	
	String name;
	JLPoint point;
	
	/**
	 * @return Point name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Point name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return location of Point
	 */
	public double [] getLocation() {
		double [] ret = {point.getX(), point.getY(), point.getZ()};
		return ret;
	}
	/**
	 * @return location of Point
	 */
	public void setLocation(double x, double y, double z) {
		if (point == null) {
			point = new JLPoint();
		}
		point.setX(x);
		point.setY(y);
		point.setZ(z);
	}
}
