package com.kssk.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketInfo {
private String name;
private String from;
private String to;
private String flightId;
private String  journeyDate;
private String ticketPrice;
private String ticketStatus;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getFlightId() {
	return flightId;
}
public void setFlightId(String flightId) {
	this.flightId = flightId;
}
public String getJourneyDate() {
	return journeyDate;
}
public void setJourneyDate(String journeyDate) {
	this.journeyDate = journeyDate;
}
public String getTicketPrice() {
	return ticketPrice;
}
public void setTicketPrice(String ticketPrice) {
	this.ticketPrice = ticketPrice;
}
public String getTicketStatus() {
	return ticketStatus;
}
public void setTicketStatus(String ticketStatus) {
	this.ticketStatus = ticketStatus;
}

}
