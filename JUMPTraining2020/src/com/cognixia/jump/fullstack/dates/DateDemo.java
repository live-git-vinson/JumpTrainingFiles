package com.cognixia.jump.fullstack.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		// Basic date object
		getDate();
		
		// Format Date
		dateFormat();
		
		// LocalDate
		getLocalDateTime();
		
		// LocalTime
		
		// LocalDateTime

		// ZonedDateTime
		getZonedDate();

	}

	public static void getDate() {
		// Create date for today
		Date today = new Date();
		System.out.println(today);
	}
	
	public static void dateFormat() {
		Date today = new Date();
		
		SimpleDateFormat sdf1, sdf2;
		sdf1 = new SimpleDateFormat("MM/dd/yy");
		sdf2 = new SimpleDateFormat("MMMM/dd/yyyy");
		
		String formatD1 = sdf1.format(today);
		String formatD2 = sdf2.format(today);
		
		System.out.println(formatD1);
		System.out.println(formatD2);
	}
	
	public static void getLocalDateTime() {
		LocalDate july3 = LocalDate.of(2015, 07, 03);
		System.out.println(july3);
		LocalDate ld = LocalDate.parse("2015-07-03");
		System.out.println(ld);
		
		LocalDate july6 = july3.plusDays(3);
		System.out.println(july6);
		
		System.out.println(july6.getDayOfWeek());
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		//combo localDate and LocalTime = LocalDateTime
		LocalDateTime ldt = LocalDateTime.of(july3, now);
		LocalDateTime ldt2 = LocalDateTime.of(2015, 07, 03, 20, 45);
		System.out.println(ldt);
		System.out.println(ldt2);
	}
	
	public static void getZonedDate() {
		LocalDateTime ldt;
		ZonedDateTime zdt;
		ZoneId zd;
		
		//System.out.println(ZoneId.getAvailableZoneIds());
		
		zd = ZoneId.of("America/Chicago");
		ldt = LocalDateTime.of(2020, 6, 3, 16,19);
		zdt = ZonedDateTime.of(ldt, zd);
		System.out.println(zdt);
	}
	
}
