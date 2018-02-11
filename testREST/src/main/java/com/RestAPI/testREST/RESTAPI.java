package com.RestAPI.testREST;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class RESTAPI{
	
		private String City;
		private int StreetCode;
		
		public String getCity() {
			return City;
	}
		public void setCity(String City) {
			this.City = City;
		}
		public int getStreetCode() {
			return StreetCode;
		}

		public void setStreetCode(int StreetCode) {
			this.StreetCode = StreetCode;
		}
	}


	

	
	

